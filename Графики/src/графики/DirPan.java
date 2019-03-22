/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package графики;

/**
 *
 * @author milan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DirPan extends JFrame 
{
    PaintGraph pg; // класс вывода графика функции
    ButPan bp; // класс управляющих масштабом кнопок
    RadPan rp; // класс задания функции
            public DirPan()
            {
            super("Построение графика функции");
            Container c = getContentPane();
            c.setLayout(new BorderLayout()); // установка менеджера размещения
            pg = new PaintGraph(); // инициализация класса построения графика функции
            pg.setSize(600,430); // задание размеров
            c.add(pg,BorderLayout.CENTER); // задание размещения
            bp = new ButPan(pg); // инициализация класса кнопок масштаба
            c.add(bp,BorderLayout.WEST);
            rp = new RadPan(pg); 
            c.add(rp,BorderLayout.NORTH);// инициализация класса выбора графика функции
            setSize(700,430); // задание размеров
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // задание параметров
                                                            // главного окна при закрытии
            setVisible(true);
            }
  public static void main(String[] args)
 {
  new DirPan();
 }
}
