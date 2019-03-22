/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg1.pkg5.pkg26;

import static java.lang.Double.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) 
    {
        //ALL
        
        Scanner sc = new Scanner(System.in);
        
        //5.3
        
        /*double a = sc.nextDouble();
        for (double i = a; i <= 50; i++)
        {
            System.out.println(i * i * i);
        }*/
        
        //5.4
        
        /*double n = 20.4;
        for (double i = 10; i < 25; i++)
        {
            System.out.print(i + "   ");
            System.out.println(i + 0.4);
        }*/
        
        
        //5.7
        /*double n = 20.4;
        for (int i = 2; i < 20; i++)
        {
            System.out.print(i + " - ");
            System.out.println(i * n);
        }*/
        
        //5.8
        
        /*double n = 0.453;
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i + " - " + i * n);
        }*/
        
        //5.9
        
        /*double n = 2.54;
        for (int i = 10; i <= 22; i++)
        {
            System.out.println(i + " - " + n * i);
        }*/
        
        //5.10
        
        /*double n = sc.nextDouble();
        for (int i = 1; i <= 20; i++)
        {
            System.out.println(i + " " + i * n);
        }*/
        
        //5.16
        
        /*for (int i = 2; i < 20; i++)
        {
            System.out.println(sin(i));
        }*/
        
        //5.17
        
        /*for (int i = 4; i <= 28; i++)
        {
            System.out.println(2 * (i + 2) * (i + 2) + 5.5 * (i + 2) - 2);
        }*/
        
        //5.18
        
        /*for (int i = 2; i <= 17; i++)
        {
            System.out.println(3.5 * (4 * i) * (4 * i) - 7 * (4 * i) + 16);
        }*/
        
        
        //5.19
        
        /*for (double i = 0.1; i < 1.1; i = i + .1)
        {
            System.out.println(sin(i));
        }*/
        
        
        
        
        //5.25
        
        /*for (double i = 2.2; i <= 4.2; i = i + .2)
        {
            System.out.println(i);
        }*/
        
        
        //5.26
        /*for (double i =4.4; i <= 6.4; i = i + .2)
        {
            System.out.println(i);
        }*/
        
        //5.29
        
        /* sum = 0; 
        for (int i = 1; i <= 1000; i++)
        {
            sum  = sum + i;
        }
        System.out.println(sum / 1000);*/
        
        /*double sum = 0; 
        int j = 0;
        for (int i = 0; i <= 1000; i = i + 2)
        {
            sum  = sum + i;
            j++;
            
        }
        System.out.println(sum / j);*/
        /*int j =0;
        for (int i = 23; i <= 101; i++)
        {
            if (i % 3 ==0)
            {
                j++;
            }
        }
        System.out.println(j);*/
        
        int x = sc.nextInt();
        x = abs(x);
        while (x > 0)
        {
            int a = x % 10;
            System.out.println(a);
            x = x /10;
        }
        
        
    }
    
}
