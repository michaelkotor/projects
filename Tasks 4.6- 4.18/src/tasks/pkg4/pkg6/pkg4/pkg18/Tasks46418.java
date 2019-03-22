/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks.pkg4.pkg6.pkg4.pkg18;

import static java.lang.Double.*;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author Michael
 */
public class Tasks46418 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //ALL
        Scanner sc = new Scanner(System.in);
        



        //4.6
        /*double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a > b)
        {
            System.out.println(a);
        } else 
        {
            System.out.println(b);
        }*/
        
        //4.7
        /*double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(max(a, b));
        System.out.println(min(a, b));*/
        
        //4.8
        /*double a = sc.nextDouble(); // КМ
        double b = sc.nextDouble(); //ФУТ
        a = a * 1000;
        b = b / 0.45;
        System.out.println(max(a, b));*/
        
        //4.9
        /*double a = sc.nextDouble(); // кмч
        double b = sc.nextDouble(); //мс
        b = b * 3.6;
        System.out.println(max(a, b));*/
        
        //4.10
        /*double a = sc.nextDouble(); //круг
        double b = sc.nextDouble(); //сторона
        double r1 = pow(2 * a * a, 1.0 / 2.0);
        if (b > r1)
        {
            System.out.println("Влезет");
        }
        else
        {
            System.out.println("Нет");
        }*/
        
        //4.11
        /*double m1 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double v2 = sc.nextDouble();
        if ((m1 / v1) > (m2 / v2))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");
        }*/
        
        //4.12
        
        
        //4.13
        /*double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double disp = b * b - 4 * a * c;
        if (disp >= 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        
        //4.14
        /*double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double disp = b * b - 4 * a * c;
        if (disp >=  0)
        {
            disp = pow(disp, 1.0 / 2.0);
            double x1 = (- b + disp)/ (2 * a);
            double x2 = (- b - disp)/ (2 * a);
            if (x1 == x2)
            {
                System.out.println(x1);
            } 
            else
            {
                System.out.println(x1 + " " + x2);
            }
        }
        else
        {
            System.out.println("Error");
        }*/
        
        //4.15
        /*double month1 = sc.nextDouble();
        double year1 = sc.nextDouble();
        double month2 = sc.nextDouble();
        double year2 = sc.nextDouble();
        
        double age = 0;
        double dmonth = month2 - month1;
        double dyear = year2 - year1;
        if (dmonth == 0)
        {
            age = dyear;
        }
        if (dmonth > 0)
        {
            age = dyear + 1;
        }
        if (dmonth < 0) 
        {
            age = dyear - 1;
        }
        System.out.println(age);*/
        
        //4.16
        /*double a = sc.nextDouble();  //круг
        double b = sc.nextDouble();  //квадрат
        double r1 = pow(a / 3.1415 , 1.0 / 2.0);
        double r2 = pow(b, 1.0 / 2.0);
        double r = pow(2 * r2 * r2, 1.0 / 2.0);
        if (r1 < r2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        if (r < r1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        
        //4.17
        /*double x11 = sc.nextDouble(); // первый прямоугольник
        double y11 = sc.nextDouble();
        double x12 = sc.nextDouble();
        double y12 = sc.nextDouble();
        
        double x21 = sc.nextDouble(); //второй прямоугольник
        double y21 = sc.nextDouble();
        double x22 = sc.nextDouble();
        double y22 = sc.nextDouble();
        
        double dx1 = abs(x11 - x12);
        double dy1 = abs(y11 - y12);
        double s1 = dx1 * dy1;
        
        double dx2 = abs(x21 - x22);
        double dy2 = abs(y21 - y22);
        double s2 = dx2 * dy2;
        
        if (s1 > s2)
        {
            System.out.println("Левый верхний");
            System.out.println(x11 + "  " + y12);
            
            System.out.println("Правый нижний");
            System.out.println(x12 + "  " + y11); 
        }
        else
        {
            System.out.println("Левый верхний");
            System.out.println(x21 + "  " + y22);
            
            System.out.println("Правый нижний");
            System.out.println(x22 + "  " + y21); 
        }
        
        
        
        
        //4.18
        
        /*double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        */
        
        
        
        
    }
    
}
