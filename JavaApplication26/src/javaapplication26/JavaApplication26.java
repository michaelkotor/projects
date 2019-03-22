/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Michael
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a = 0;
        int b = 0;
        int c;
        Integer v = null;
               
        try
        {
            c = a / b;
            try
            {
               v = 0;
               if (v == 0)
               {
                   try
                   {
                       int t = 0 / 0;
                       throw new NullPointerException("Котик не инициализирован");
                   }
                   catch(NullPointerException e)
                   {
                       System.out.println(e);
                   }
                     
               }
               v = 0 / 0;
            }
            catch(Exception e)
            {
                System.out.println("!");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Everything is bad...");
        }
        finally
        {
            System.out.println("YOU DIED");
        }
        System.out.println("j");
    }
    
}
