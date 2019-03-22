/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package факториал;

import java.math.BigInteger;

/**
 *
 * @author milan
 */
public class Факториал {

    public static long factorial(long n)
    {
        if (n <= 1)
        {
            return 1;
        }
        return n * factorial(n - 1);
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(factorial(44));
    }
    
}
