/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сортировки;

import java.util.Random;

/**
 *
 * @author milan
 */
public class MASS 
{
    private int[] mass;
    
    public MASS(int a)
    {
        this.mass = new int[a];
    }
    
    private void change(int j)
    {
        int c = mass[j];
        mass[j] = mass[j + 1];
        mass[j + 1] = c;
    }
    
    public void sort()
    {
        int end = mass.length - 1, start = 0;
        for (int i = end; i >= 0; i--) 
        {
            for (int j = start; j < end; j++) 
            {
                if (mass[j] > mass[j + 1]) 
                {
                    change(j);
                }
            }
        }
    }
    
    public void sort2()
    {
        for (int start = 0; start < mass.length - 1; start++) 
        {
            int min = start;
            for (int j = start + 1; j < mass.length; j++) 
            {
                if (mass[min] > mass[j]) 
                {
                    min = j;
                }
                
            }
            int c = mass[start];
            mass[start] = mass[min];
            mass[min] = c;
	}
    }
    
    public void sort3()
    {
        for (int i = 0; i < mass.length; i++) 
        {
            for (int j = 0; j < mass.length; j++) 
            {
                
            }
        }
    }
    
    public void insert()
    {
        for (int i = 0; i < mass.length - 1; i++) 
        {
            mass[i] = (int) (Math.random() * 100);
        }
    }
    
    public void print()
    {
        for (int i = 0; i < mass.length; i++) 
        {
            System.out.print(mass[i] + " ");
        }
    }
}
