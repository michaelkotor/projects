/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Michael
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Method1 m1 = new Method1(12, 23);
        m1.s(m1.l1, m1.l2);
        Method1 m2 = new Method1(12);
        m2.s(m2.l1);
    }
    
}
