/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

import java.util.ArrayList;

/**
 *
 * @author milan
 */
public class main 
{
    public static void main(String[] args) 
    {
        MyStack m = new MyStack();
        m.empty();
        m.push(2);
        
        m.empty();
        m.push(0);
        m.push(4);
        System.out.println(m.toString());
        m.search(0);
        System.out.println(new int[][] { { 1,2,7}, {3,4,5}}[1][2]);
    }
}
