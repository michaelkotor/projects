/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package многочлен;

import java.util.Arrays;

/**
 *
 * @author milan
 */
public class Poly 
{
    private int MASS[];
    private int length;
    
    public Poly(int max)
    {
        this.MASS = new int[max];
        this.length = max;
    }
    
    public int getLength()
    {
        return MASS.length;
    }
    
    public int[] getMass()
    {
        return MASS;
    }
    
    public void add(int power, int index)
    {
        MASS[power] = index;
    }
    
    public boolean Equality(Poly a, Poly b)
    {
        return (Arrays.equals(a.getMass(), b.getMass()));      
    }
    
    public int Meaning(Poly a, int x)
    {
        int a1[] = a.getMass();
        int ans = 0;
        for (int i = 0; i < a1.length; i++) 
        {
            ans = (int) (ans + (int)((Math.pow(x, i) * a1[i])));
        }
        return ans;
    }
    
    public Poly Add(Poly a, Poly b)
    {
        int a1[] = a.getMass();
        int b1[] = b.getMass();
        int c[] = new int[Math.max(a.getLength(), a.getLength())];
        
        for (int i = 0; i < Math.min(a.getLength(), a.getLength()); i++) 
        {
            c[i] = a1[i] + b1[i];
            
        }
        
        for (int i = Math.min(a.getLength(), a.getLength()); i < Math.max(a.getLength(), a.getLength()); i++) 
        {
            if (a.getLength() > b.getLength()) 
            {
                c[i] = a1[i];
            }
            else
            {
                c[i] = b1[i];
            }
        }
        
        Poly ans = new Poly(Math.max(a.getLength(), a.getLength()));
        for (int i = 0; i < ans.getLength(); i++) 
        {
            ans.add(i, c[i]);
        }
        return ans;
    }
}
