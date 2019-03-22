/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author milan
 */
public class MyStack 
{
    private char MASS[];
    
    public MyStack() 
    {
        MASS = new char[0];
    }
    
    public void push(char a)
    {
        int l = MASS.length;
        char MASS2[] = new char[l + 1];
        for (int i = 0; i < l; i++) 
        {
            MASS2[i] = MASS[i];
        }
        MASS2[l] = a;
        MASS = MASS2;
    }
    
    public char pop()
    {
        if (MASS.length != 0) 
        {
            int l = MASS.length;
            char MASS2[] = new char[l - 1];
            for (int i = 0; i < l - 1; i++) 
            {
                MASS2[i] = MASS[i];
            }
            char n = MASS[l - 1];
            System.out.println(n);
            MASS = MASS2;
            return n;
        }
        return '!';        
    }
    
    public char peek() //pick
    {
        if (MASS.length != 0) 
        {
            //System.out.println(MASS[MASS.length - 1]);
            return MASS[MASS.length - 1];
        }
        return '!';
        
    }
    
    public void clear()
    {
        char MASS2[] = new char[0];
        MASS = MASS2;
    }
    
    public int length()
    {
        return MASS.length;
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
        if (MASS.length == 0) 
        {
            return "ничего-нет";
        }
        String ans ="";
        for (int i = 0; i < MASS.length; i++) 
        {
            ans = ans + MASS[i] + " "; 
        }
        return ans;
    }
    
    public int search(char a)
    {
        for (int i = MASS.length - 1, j = 0; i > 0; i--, j++) 
        {
            if (MASS[i] == a) 
            {
                return j;
            }
        }
        return -1;
    }
    
}
