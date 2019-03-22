/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg65.pkg5.pkg76;

import static java.lang.Double.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //5.65
        double a = 1;
        for (int i = 1; i < 10; i++)
        {
            a = a * i + 1.0 / i;
            System.out.println(a);
        }
    }
    
}
