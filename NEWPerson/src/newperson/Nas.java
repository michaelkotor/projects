/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newperson;

/**
 *
 * @author Michael
 */
public class Nas 
{
    String name;
    String education;
    String dol;
    
    Nas(String name, String education, String dol)
    {
        this.dol = dol;
        this.education = education;
        this.name = name;
    }
    
    Nas()
    {
        
    }
    
    public String run1()
    {
        return "i am running";
    }
    public String write1()
    {
        return "i am writting";
    }
}
