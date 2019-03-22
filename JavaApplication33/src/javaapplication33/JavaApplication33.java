/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author milan
 */
public class JavaApplication33 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        
        Scene scene =new Scene(pane, 700, 500);
        //scene.getStylesheets().add(0, "javaapplication33/my.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Адресная книга");
        primaryStage.show();
        
        
    }
    
}
