/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package телеграммбот;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.*;


/**
 *
 * @author milan
 */
public class Weather {
    
    //40755980d0f5988e2081fe273f7ec1a1
    public static String getWeather(String message, Model model) throws MalformedURLException, IOException{
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=40755980d0f5988e2081fe273f7ec1a1");
        
        Scanner sc = new Scanner((InputStream)url.getContent());
        String result = "";
        
        while(sc.hasNext()) {
            result += sc.nextLine();
        }
        //System.out.println(result);
        
        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));
        
        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getDouble("temp"));
        model.setHumidity(main.getDouble("humidity"));
        
        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setIcon(obj.getString("icon"));
            model.setMain(obj.getString("main"));
        }
        
        return "City: " + model.getName() + "\n" + 
                "Temperature: " + model.getTemp() + "\n" +
                "Humidity: " + model.getHumidity() + "%" + "\n" +
                "Main: " +model.getMain() +  "\n" + 
                "http://openweathermap.org/img/w/" + model.getIcon() + ".png";
    };
}
