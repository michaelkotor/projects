/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сортировка.пузырьком;

/**
 *
 * @author milan
 */
public class СортировкаПузырьком 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[] = {3,5,7,245,5,21,0,6,3,66,8,2,6,8,16};
        int n = 2, k = 0;
        while(n > 1)
        {
            k = 0;
            for (int i = 0; i < a.length - 1;) 
            {
                if (a[i] > a[i + 1]) 
                {
                    int c = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = c;
                    
                    i++;
                    k++;
                }
                else 
                {
                    i++;
                }
            }
            n = k;
        }
        
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        
    }
    
}
