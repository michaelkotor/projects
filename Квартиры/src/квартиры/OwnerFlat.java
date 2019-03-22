/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package квартиры;

/**
 *
 * @author milan
 */
public class OwnerFlat implements Owner
{
    private String name;
    private int numberPeople;
    private int numberRooms;
    
    public String getName()
    {
        return this.name;
    }
    
    public int getNumberPeople()
    {
        return this.numberPeople;
    }
    
    public int getNumberRooms()
    {
        return this.numberRooms;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setNumberPeople(int numberPeople)
    {
        this.numberPeople = numberPeople;
    }
    
    public void setNumberRooms(int numberRooms)
    {
        this.numberRooms = numberRooms;
    }
    
    OwnerFlat(String name, int numberPeople, int numberRooms)
    {
        this.name = name;
        this.numberPeople = numberPeople;
        this.numberRooms = numberRooms;
    }
    
    public OwnerFlat(OwnerFlat e)
    {
        this.name = e.name;
        this.numberPeople = e.numberPeople;
        this.numberRooms = e.numberRooms;
    }
}
