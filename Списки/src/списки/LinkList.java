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
public class LinkList 
{
    public Link first;
    
    public LinkList()
    {
        this.first = null;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    public void insertFirst(int iValue, double dValue)
    {
        Link newLink = new Link(iValue, dValue);
        newLink.next = first;
        first = newLink;
    }
    
    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayList()   
    {
        System.out.print("List (first-->last): " + "\n");
        Link current = first;       
        while(current != null)
        {      
            current.displayLink();  
            current = current.next;
        }  
        System.out.println("");   
    }
    
    public Link find(int key)
    {
        Link current = first;
        while(current.dValue != key)
        {
            if (current.next == null) 
            {
                return null;
            }
            else
            {
                current = current.next;
            }
        }
        return current;
    }
    
    public Link delete(int key)
    {
        Link current = first;
        Link previous = first;
        while(current.dValue != key)
        {
            if (current.next == null) 
            {
                return null;
            }
            else
            {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) 
        {
            first = first.next;
        }
        else
        {
            previous.next = current.next;
            return current;
        }
    }
}