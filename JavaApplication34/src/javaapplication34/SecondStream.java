/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milan
 */
public class SecondStream implements Runnable {
    private String s;
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(s + " = " + i);
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(SecondStream.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public SecondStream(String s) {
        this.s = s;
    }
    
}
