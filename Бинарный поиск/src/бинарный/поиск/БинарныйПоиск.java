/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package бинарный.поиск;

import java.util.Arrays;

/**
 *
 * @author milan
 */
public class БинарныйПоиск {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] mass = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        for (int i = 0; i < mass.length; i++) 
        {
            System.out.print(mass[i] + " ");
        }
        Arrays.sort(mass);
        
        int min = 0;
        int max = mass.length;
        int midpoint = (min + max) / 2;
        int key = 15;
        
        while(min <= max)
        {
            if (mass[midpoint] < key) 
            {
                min = midpoint + 1;  
            }
            else if (key == mass[midpoint]) 
            {
                System.out.println(mass[midpoint]);
                return;
            }
            else
            {
                max = midpoint - 1;
            }
            midpoint = (min + max) / 2;    
        }
        System.out.println("ничего не найдено");
    }
    
}
