/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppWindow extends Frame
{
    String keymsg = "This is a test";
    String mousemsg = "";
    int mouseX = 30, mouseY = 30;
    
    public AppWindow()
    {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }
    
    public void paint(Graphics g)
    {
        g.drawString(keymsg, 10, 40);
        g.drawString(mousemsg, mouseX, mouseY);
        
    }
    
    public static void main(String args[])
    {
        AppWindow app = new AppWindow();
        app.setSize(new Dimension(300, 200));
        app.setVisible(true);
        app.setTitle("My");
    }
}

class MyKeyAdapter extends KeyAdapter
{
    AppWindow app;
    public MyKeyAdapter(AppWindow app)
    {
        this.app = app;
    }
    
    public void keyTyped(KeyEvent ke)
    {
        app.keymsg += ke.getKeyChar();
        app.repaint();
    }
}

class MyMouseAdapter extends MouseAdapter
{
    AppWindow app;
    public MyMouseAdapter(AppWindow app)
    {
        this.app = app;
        
    }
    
    public void mousePressed(MouseEvent me)
    {
        app.mouseX = me.getX();
        app.mouseY = me.getY();
        app.mousemsg = "MouseDown at " + app.mousemsg + ", " + app.mouseX;
        app.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}