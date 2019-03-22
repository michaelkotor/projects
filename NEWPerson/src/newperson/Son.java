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
public class Son extends Nas
{
    String SonName;
    String dolSun;
    
    Son()
    {
        
    }
    
    public Son(String name, String education, String dol) 
    {
        super(name, education, dol);
    }
    
    public String runMoto()
    {
        return "i am running Moto";
    }
}
