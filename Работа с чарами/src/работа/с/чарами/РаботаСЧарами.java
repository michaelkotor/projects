/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работа.с.чарами;

/**
 *
 * @author milan
 */
public class РаботаСЧарами {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[] = new int[10];
        
        char d[] = new char[10];
        
        char g ='a';
        for (int i = 0; i < 10; i++) 
        {
            d[i] = g++;
        }
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(d[i] + "   ");
        }
        
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            a[i] = d[i]; 
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
