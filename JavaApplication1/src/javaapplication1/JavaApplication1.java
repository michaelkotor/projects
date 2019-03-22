/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import static java.lang.Math.*;
import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Первая задача
       /*Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int x = sc.nextInt();
       int y = sc.nextInt();
       if (y > a)
       {
           System.out.println("First");
       }
       else
       if (y == a)
       {
            System.out.println("На линии");
       } 
       else System.out.println("Second");*/
       
       //Вторая задача
       /*Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       if (x < y)
       {
           System.out.println("First");
       }
       else 
       {
           System.out.println("Second");
       }*/
       
       //Третья задача
       /*Scanner sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double r = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double a = pow(x1-x2, 2) + pow(y1-y2,2);
       double l = pow(a, 1.0 / 2.0);
       if (r > l)
       {
           System.out.println("First");
       }
       else 
       {
           System.out.println("Second");
       }*/
       
       //Четвертая задача
       /* sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double rmax = sc.nextDouble();
       double rmin = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double l = pow(x1 - x2, 2) + pow(y1 - y2, 2);
       double a = pow(l, 1.0/2.0);
       if (a <= rmax)
       {
           if (a <= rmin)
           {
               System.out.println("Second");
           } else
           if (rmin <= a)
           {
               System.out.println("First");
           }
       }
       else
       {
           System.out.println("Second");
       }*/
       
       //Пятая задача
       /*Scanner sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double r = sc.nextDouble();
       double h = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double l = pow(x1 - x2, 2) + pow(y2-y1, 2);
       double a = pow(l,2);
       boolean ans = false;
       if (a < r) {
           ans = true;
       }
       else
       {
           if (((x2 < x1 + r) && (x2 > x1 - r)) && ((y2 > y1 - h ) && (y2 < y1 + h) ))
           {
               ans = true;
           }
       }

       if (ans == true)
       {
           System.out.println("First");
       }
       else System.out.println("Second");*/
       
       //Шестая задача
       /*Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
       double y = sc.nextDouble();
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       boolean ans = false;
       double dis = b * b - 4* a * c;
       
       double yup = (-b / a / 2);
       double xup = -dis / 4 / a;
       System.out.println(yup + " " + xup);
       if (yup < y)
       {
           
           double ynow = a * (x1 * x1) + b * x1 + c; //ynow показывает значение функции от х1
           double disp = b *b - 4 * a * ( c - y1); 
           double xnow1 = (b + Math.sqrt(disp)) / (2 * a);
           double xnow2 = (b - Math.sqrt(disp)) / (2 * a);
           //System.out.println(ynow + "    " + xnow1 + "     " + xnow2);
           System.out.println("ЭЭ      " + xnow1 + "    " + xnow2 + "    "  + x1 );
           /*if ( (ynow < y || ynow > y1) || ( (xnow2 < x1 ) && (xnow1 > -x1) ) );
           {
               ans = true;
           }*/
           /*if ()
       }
       else
       {
           System.out.println("Ошибка");
       }
       //System.out.println("Привет");
       if (ans == true)
       {
           System.out.println("First");
       }
       else
       {
           System.out.println("Second");
       }*/
       
           
       //цикл for
       /*Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       double sum = 0;
       for (double i = 1; i <= n; i++)
       {    
           sum = sum + i / 5.0;

       }
        System.out.println(sum);*/
       
       
       
       //14.01.2018
       /*double x = sc.nextDouble();
       double y = sc.nextDouble();
       double z = sc.nextDouble();
       
       if (x > y)
       {
           if (x > z)
           {
               System.out.println("x is the biggest");
           }
               else
               {
                     System.out.println("z is the biggest");  
               }
       }
       else
       {
           if (y > z)
           {
               System.out.println("y is the biggest");
           }
           else
           {
               System.out.println("z is the biggest");
           }
       }*/
       
       
       /*double x = sc.nextDouble();
       double y = sc.nextDouble();
       double z = sc.nextDouble();
       double k = sc.nextDouble();
       if (x > y)
       {
           System.out.println(x);
       }
       else
       {
           System.out.println(y);
       }
       if (z > k)
       {
           System.out.println(z);
       }
       else
       {
           System.out.println(k);
       }*/
       
       /*double x = sc.nextDouble();
       double y = sc.nextDouble();
       double yc = 4;
       double xc = 5;
       if (x < xc && y < yc)
       {
           System.out.println("FIRST");
       }
       else
       {
           System.out.println("SECOND");
       }*/
       
        /*double sum = 0;
        for (double i = 2; i < 11; i++)
        {
            sum = sum + i / (i + 1);
        }
        System.out.println(sum);*/
        
        
        int n = 1;
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i + "*" + n + "=" + i*n);
            if (i == 10)
            {
                i = 0;
                n++;
            }
            if (n == 10)
            {
                
                
                System.exit(0);
            }
        }
       
    }
    
}
