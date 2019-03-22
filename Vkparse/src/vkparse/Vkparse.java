/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vkparse;

import java.io.IOException;

/**
 *
 * @author milan
 */
public class Vkparse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        Parse Lida = new Parse("https://vk.com/id188627329");
        Parse Michael = new Parse("https://vk.com/michael_kotor");
        Michael.start();
        Lida.start();
    }
    
}
