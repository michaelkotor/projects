/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author milan
 */



public class FirstStream {

    //static SecondStream secondStream;
    public static void main(String[] args) {
        SecondStream secondStreami = new SecondStream("i");
        SecondStream secondStreamj = new SecondStream("j");
        Thread myThreadi = new Thread(secondStreami);
        Thread myThreadj = new Thread(secondStreamj);
        myThreadi.start();
        //if (!myThreadi.isAlive()) {
            myThreadj.start();
        //}
        
    }
    
}
