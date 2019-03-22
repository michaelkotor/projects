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
public class MyThread implements Runnable
    {
        Thread thread;
        MyThread()
        {
            thread = new Thread(this, "NEW");
            System.out.println("We are planting a new steam!");
            thread.start();
        }
        MyThread(Runnable i, int i1)
        {
            
        }
        public void run()
        { 
            System.out.println("New stteam is working!");
            try
            { 
                for (int i = 5; i > 0; i--) 
                {
                    System.out.println("yyy" + i);
                    sleep(500);
                }
            }
            catch(Exception e)
            {
                System.out.println("We have a problem...");
            }

        }
}
