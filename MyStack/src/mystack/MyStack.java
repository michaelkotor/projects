/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author milan
 */
public class MyStack 
{
    private int MASS[];
    
    public MyStack() 
    {
        MASS = new int[0];
    }
    
    public void push(int a)
    {
        int l = MASS.length;
        int MASS2[] = new int[l + 1];
        for (int i = 0; i < l; i++) 
        {
            MASS2[i] = MASS[i];
        }
        MASS2[l] = a;
        MASS = MASS2;
    }
    
    public void pop()
    {
        int l = MASS.length;
        int MASS2[] = new int[l - 1];
        for (int i = 0; i < l - 1; i++) 
        {
            System.out.println("При i = " + i + " все еще хорошо");
            MASS2[i] = MASS[i];
            
        }
        int n = MASS[l - 1];
        System.out.println(n);
        MASS = MASS2;
    }
    
    public void peek()
    {
        System.out.println(MASS[MASS.length - 1]);
    }
    
    public void empty()
    {
        if (MASS.length == 0) 
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
    
    public String toString()
    {
        String ans ="";
        for (int i = 0; i < MASS.length; i++) 
        {
            ans = ans + MASS[i] + " "; 
        }
        return ans;
    }
    
    public void search(int a)
    {
        for (int i = MASS.length - 1, j = 0; i > 0; i--, j++) 
        {
            if (MASS[i] == a) 
            {
                System.out.println(j);
                break;
            }
        }
    }
}
