/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package легкая.промышленность;

/**
 *
 * @author Michael
 */
public class Zex extends Plant
{
    protected String name;
    protected int power;
    
    Zex()
    {
        
    }
    
    Zex(String name, int power, String nameZex, int powerZex)
    {
        super(name, power);
        this.name = nameZex;
        this.power = powerZex;
    }
    
    public String work()
    {
        return "i make only cakes";
    }
    
    public String work(int i)
    {
        return "i work for " + i + " hours";
    }
}
