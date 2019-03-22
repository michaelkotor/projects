/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package списки;

/**
 *
 * @author milan
 */
public class Link 
{
    int iValue;
    double dValue;
    Link next;
    
    public Link(int iValue, double dValue)
    {
        this.dValue = dValue;
        this.iValue = iValue;
        this.next = null;
    }
    
    public void displayLink()
    {
        System.out.println("{ "+ this.iValue + " "+ this.dValue +" }");
    }
}
