/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package двоичныедеревья;

/**
 *
 * @author milan
 */
public class Node {
    public int iDate;
    public double dDate;
    public Node leftChild;
    public Node rightChild;
    
    public void dispalyNode() {
        System.out.println('{');
        System.out.println(iDate);
        System.out.println(", ");
        System.out.println(dDate);
        System.out.println("} ");
    }
    
}

