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
public class Plant 
{
    protected String name;
    protected int power;
    
    Plant()
    {
        
    }
    Plant(String name, int power)
    {
        this.name = name;
        this.power = power;
    }
    
    public String work()
    {
        return "i do everything";
    }
    public String work(int time)
    {
        return "i do everuthing " + time;
    }
}
