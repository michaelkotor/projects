/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package показкартинок;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author milan
 */
public class Controller {
    @FXML
    private ImageView image;

    
    public void startDo(ActionEvent actionEven) {
        System.out.println("Кнопка нажата");
        MyThread my1 = new MyThread(1);
        my1.start();
        System.out.println("Первый должен быть запущен");
        MyThread my2 = new MyThread(2);
        my2.start();
        System.out.println("Второй должен быть запущен");
    }
    
}
