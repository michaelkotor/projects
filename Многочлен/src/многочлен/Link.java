/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package многочлен;

/**
 *
 * @author milan
 */
public class Link 
{
    public int factor;
    public int power;
    public Link next;
    
    public Link(int factor, int power)
    {
        this.factor = factor;
        this.power = power;
        this.next = null;
    }
    
    public int getFactor() {
        return this.factor;
    }
    
    public int getPower() {
        return this.power;
    }
    
    public void displayLink()
    {
        System.out.println(this.factor + " " + this.power);
    }
}
