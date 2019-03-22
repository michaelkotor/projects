/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сложные.данные;

import java.util.Arrays;

/**
 *
 * @author milan
 */
public class СложныеДанные 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Mass myMass = new Mass();
        for (int i = 0; i < 10; i++) {
            myMass.set(i, i);
            
        }
        
        
        myMass.print();
        System.out.println("");
        myMass.set(10, 134);
        myMass.print();
        System.out.println("");
        myMass.delete(5);
        System.out.println("");
        myMass.print();
        System.out.println("");
        myMass.add(5, 5);
        myMass.print();
        
        
        
    }
    
}
