/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package показкартинок;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author milan
 */
public class MyThread extends Thread {
    public int number;
    @FXML
    private ImageView img;
    
    @Override
    public void run() {
        Image img1 = new Image("http://3.bp.blogspot.com/-wqyCow3vX18/T7qvtfnQn4I/AAAAAAAAA1U/8lArecKiLM4/s320/meme.png");
        Image img2 = new Image("https://chto-eto-takoe.ru/uryaimg/750dee84f4aa22327320ab543c4f5bab.jpg");
        
        for (int i = 0; i < 10; i++) {   
            System.out.println("Зашли в цикл");
            img = new ImageView();
            if (this.number == 1) {
                img.setImage(img1);
            } else {
                img.setImage(img2);
            }
            
            {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
                    stage.setTitle("Модальное окно");
                    stage.setMinHeight(100);
                    stage.setMinWidth(200);
                    stage.setResizable(false);
                    stage.setScene(new Scene(root));
                    stage.initModality(Modality.WINDOW_MODAL);
                    //stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                
            }
            
            
        }
    }
    
    public MyThread(int i) {
        this.number = i;
    }
    
}
