/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easydraw;


import java.awt.*;
import java.applet.*;
import javax.swing.JFrame;
/**
 *
 * @author Michael
 */

class MyApp extends JFrame
{
    MyApp()
    {
        super("First graphick");
        setBounds(0, 0, 4000, 4000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g)
    {
        
        g.fillOval(400, 400, 1000, 1000);
        g.setColor(Color.yellow);
        g.fillOval(123, 123, 123, 123);
    }
    
}

public class EasyDraw
{   
    public static void main(String args[])
    {
        MyApp app = new MyApp();
        app.setVisible(true);
    }
    
}
