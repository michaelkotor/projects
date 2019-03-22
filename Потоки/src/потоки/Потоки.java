/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package потоки;

import static java.lang.Thread.sleep;

/**
 *
 * @author Michael
 */


public class Потоки {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        mainThread.setName("Cat Michael");
        System.out.println(mainThread);
        
        MyThread My = new MyThread();
        My.run();
        
        
    }
}