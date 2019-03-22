/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package телеграммбот;

import static java.awt.SystemColor.text;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;



public class Bot extends TelegramLongPollingBot 
{
    public static void main(String args[]) throws TelegramApiRequestException
    {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        
        telegramBotsApi.registerBot(new Bot());

        
    }

    @Override
    public String getBotToken() 
    {
        return "659776836:AAEm8mzbYetgeFXLhSrTKRZEou9hAFQHOiE";
    }

    @Override
    public void onUpdateReceived(Update update) 
    {
        Model model = new Model();
        Message message = update.getMessage();
        if (message != null && message.hasText()) 
        {
            switch(message.getText())
            {
                case "/help":
            {
                try {
                    sendMsg(message, "Напишите город");
                } catch (TelegramApiException ex) {
                    Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "/setting":
            {
                try {
                    sendMsg(message, "Что будем настраивать?");
                } catch (TelegramApiException ex) {
                    Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "/start":
            {
                try {
                    sendMsg(message, "Давайте начнем");
                    sendMsg(message, "У меня две команды: /help и /setting");
                } catch (TelegramApiException ex) {
                    Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                default:
            {
                try {
                    sendMsg(message, Weather.getWeather(message.getText(), model));
                } catch (TelegramApiException ex) {
                    Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    try {
                        sendMsg(message, "Город не найден");
                    } catch (TelegramApiException ex1) {
                        Logger.getLogger(Bot.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
                     
            }
                
        }
    }
    
    public void sendMsg(Message message, String s) throws TelegramApiException
    {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(s);
        setButtons(sendMessage);
        execute(sendMessage);

        
    }
    
    public void setButtons(SendMessage sendMessage)
    {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup(); //создание клавиатуры
        sendMessage.setReplyMarkup(replyKeyboardMarkup);//разметка
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true); //количетво кнопок
        replyKeyboardMarkup.setOneTimeKeyboard(false); //скрытие кнопок после выбора
        
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        
        
        keyboardFirstRow.add(new KeyboardButton().setText("/help"));
        keyboardFirstRow.add(new KeyboardButton().setText("/setting"));
        
        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
    }

    @Override
    public void onUpdatesReceived(List<Update> list) {
        super.onUpdatesReceived(list); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBotUsername() 
    {
        return "michael_kot_bot";
    }

    
}
