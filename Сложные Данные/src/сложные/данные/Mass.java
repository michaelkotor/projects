/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сложные.данные;

/**
 *
 * @author milan
 */
public class Mass {
    private int[] MASS = new int[1000];
    private int findNumber;
    private int deleteNumber;
    private int LENGTH;
    
    public Mass() 
    {
        LENGTH = 20;
        int[] MASS = new int[LENGTH];
    }
    
    public int get(int index)
    {
        return MASS[index];
    }
    
    public void find(int i)
    {
        for (int j = 0; j < LENGTH; j++) 
        {
            if (i == MASS[i]) 
            {
                findNumber = i;
                System.out.println("We have found it!");
            }
        }
    }
    
    public void set(int index, int newnumber)
    {
        MASS[index] = newnumber;
    }
    
    public void delete(int number)
    {
        for (int i = 0; i < LENGTH; i++) 
        {
            if (number == MASS[i]) 
            {
                deleteNumber = i;
            }
        }
        for (int i = deleteNumber; i < MASS.length - 1; i++) 
        {
            MASS[i] = MASS[i + 1];
        }
        LENGTH--;
    }
    
    public void print()
    {
        for (int i = 0; i < LENGTH; i++) 
        {
            System.out.print(MASS[i] + " ");
        }
    }
    
    public void add(int index, int number)
    {
        LENGTH++;
        //do not work;
        for (int i = index; i < LENGTH - 1; i++) 
        {
            MASS[i - 1] = MASS[i];
            
        }
        MASS[index] = number;
    }
    
    
}
