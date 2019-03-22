/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks4.pkg52.pkg4.pkg62;

import static java.lang.Double.*;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author Michael
 */
public class Tasks452462 {

    private static String string;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //ALL
        Scanner sc = new Scanner(System.in);
        
        
        //4.52 а
        /*double a = sc.nextInt();
        boolean ans = false;
        for (int i = 154; i < 3; i++)    
        {
            if (a % (pow(10, i)) == 4)
            {
                ans = true;
                break;
            }
            a = a - a % 10;
            a = a /10;
        }
        if (ans == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        
        //4.52 б
        
        /*double a = sc.nextInt();
        boolean ans = false;
        for (int i = 154; i < 3; i++)    
        {
            if ((a % (pow(10, i)) == 3) || (a % (pow(10, i)) ==  6) || (a % (pow(10, i)) == 7))
            {
                ans = true;
                break;
            }
            a = a - a % 10;
            a = a /10;
        }
        if (ans == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        
        //4.53
        
        /*double a = sc.nextDouble();
        double n = sc.nextDouble();
        boolean ans = false;
        for (double i = 1; i <= 3; i++)
        {
            
            if (a % pow(10, 1) == n)
            {
                ans = true;
                break;
            }
            System.out.println(a % pow(10, i));
            //System.out.println(pow(10, i));
            //System.out.println(a % pow(10, i));
            a = (a - a % pow(10, 1)) / 10;
            System.out.println(a+ "   wsv ");
        }
        if (ans == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }*/
        
        //4.57
        
        boolean ans = false;
        double a = sc.nextDouble();
        System.out.println(a % 10);
        System.out.println(a % 100);
        System.out.println(a % 1000);
        System.out.println(a % 10000);
        
        /*if (a < 1000 || a > 99)
        {
            if (a % 100 == a % 10)
            {
                ans = true;
            }
        }
        if (a >= 1000)
        {
            if ()
        */
    }
    
}
