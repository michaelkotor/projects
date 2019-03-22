/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package показкартинок;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author milan
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent pane = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        
        Scene scene = new Scene(pane);
        /*
        Image image = new Image("https://chto-eto-takoe.ru/uryaimg/750dee84f4aa22327320ab543c4f5bab.jpg");
        
        ImageView view = new ImageView();
        view.setImage(image);

        root.getChildren().add(view);
        */
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
        
    }
}
