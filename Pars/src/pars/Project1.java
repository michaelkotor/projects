/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pars;

/**
 *
 * @author User
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parsing s=new Parsing("-51x^55-57x^8+78+x^2+5x");
        s.p();
        System.out.println("");
        s.p1();
        s.mass();
        
        
        // TODO code application logic here
    }
    
}
