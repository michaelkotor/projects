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
public class Method1 
{
    int l1;
    int l2;
    
    Method1(int l1, int l2)
    {
        this.l1 = l1;
        this.l2 = l2;
    }
    Method1(int l1)
    {
        this.l1 = l1;
        this.l2 = l1;
    }
    
    void s(int l1, int l2)
    {
        System.out.println(l1 * l2);
    }
    void s(int l1)
    {
        System.out.println(l1 * l1);
    }
}
