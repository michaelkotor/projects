/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package бинароне.дерево;

/**
 *
 * @author milan
 */
public class Node {
    int Date;
    Node leftChild;
    Node rightChild;
    
    
    Node() {};
    
    void displayNode() {
        System.out.println(Date + " ");
    }
    
    int getDate() {
       return Date; 
    }
}
