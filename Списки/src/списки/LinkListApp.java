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
public class LinkListApp  
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        System.out.println("I work");
        LinkList theList = new LinkList(); 
        theList.insertFirst(22, 2.99);    
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        theList.displayList();
 
    }
    
}
