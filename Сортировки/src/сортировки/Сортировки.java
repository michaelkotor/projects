/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package сортировки;

/**
 *
 * @author milan
 */
public class Сортировки 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MASS a = new MASS(10);
        a.insert();
        a.print();
        System.out.println("");
        a.sort();
        a.print();
        a.insert();
        System.out.println("");
        a.print();
        a.sort2();
        System.out.println("");
        a.print();
        System.out.println("");
        a.sort3();
    }
    
}
