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
public class Person extends Zex
{
    protected String name;
    protected int power;
    Person()
    {
        
    }
    Person(String name, int power, String nameZex, int powerZex, String namePerson, int powerPerson)
    {
        super(name, power, nameZex, powerZex);
        this.name = namePerson;
        this.power = powerPerson;
    }
    
    public String work()
    {
        return "i only work";
    }
    public String live()
    {
        return "i live";
    }
}
