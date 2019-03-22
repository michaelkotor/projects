/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author milan
 */
public class JavaApplication36 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        File file = new File("fxml/fxml1.fxml");
        System.out.println("Все хорошо");
        Parent pane = FXMLLoader.load(getClass().getResource("../fxml/scene1.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/scene1.fxml"));
        System.out.println("Все уже хуже");
        fxmlLoader.setResources(ResourceBundle.getBundle("../bundles/Locale", new Locale("en")));
        
        Scene scene = new Scene(pane, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Адресная книга");
        primaryStage.show();
    }
    
}
