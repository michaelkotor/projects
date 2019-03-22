/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сортирвка.минимум;

/**
 *
 * @author milan
 */
public class СортирвкаМинимум 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[] = {3,5,7,245,5,21,0,6,3,66,8,2,6,80,16};
        
        for (int i = 0; i < a.length -1; i++) 
        {
            int min = i;
            for (int j = min + 1; j < a.length; j++) 
            {
		if (a[j] < a[i]) 
                {
                    i = j;
                }
            }
	    int c = a[i];
	    a[i] = a[min];
	    a[min] = c;
	}
        
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        
    }
    
}
