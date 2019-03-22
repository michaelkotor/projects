/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.io.IOException;
import java.util.ArrayList;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;

/**
 *
 * @author milan
 */
public class Controler {
    private ArrayList<String> arrayName = new ArrayList();
    private ArrayList<String> arrayPhone = new ArrayList();
    
    @FXML
    private TextField valueName;
    
    @FXML
    private TextField valuePhone;
    
    @FXML
    private TextArea value;
    
    public void firstButtonAction(ActionEvent actionEven) {
        
        arrayName.add(valueName.getText());
        arrayPhone.add(valuePhone.getText());
        
        valueName.setText("");
        valuePhone.setText("");
        
    }
    
    public void secondButtonAction(ActionEvent actionEven) 
    {
        value.setText("Вот ваши данные: " + "\n");
        for (int i = 0; i < arrayName.size(); i++) {
            String text = (String)(i + ") " + arrayName.get(i) + " : " + arrayPhone.get(i));
            System.out.println(text);
            value.appendText(text + "\n");
            value.appendText("");
        }
    }
    
    public void showDialog(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Модальное окно");
        stage.setMinHeight(100);
        stage.setMinWidth(200);
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
        stage.show();
    }
    
    
}
