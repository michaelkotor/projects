/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package квартиры;

import java.util.ArrayList;

/**
 *
 * @author milan
 */
public class Data 
{
    private ArrayList<OwnerFlat> FlatList;
    private OwnerFlat[] FLATMASS;
    private int FlatLength;
    private ArrayList<OwnerHouse> HouseList;
    private OwnerHouse[] HOUSEMASS;
    private int HouseLength;
    
    Data(boolean b, int length)
    {
        if(b)
        {
            this.FlatList = new ArrayList<OwnerFlat>();
            this.FlatLength = length;
        }
        else
        {
            this.HouseList = new ArrayList<OwnerHouse>();
            this.HouseLength = length;
        }
    }
    
    public Data()
    {
        this.FlatList = new ArrayList<OwnerFlat>();
        this.FlatLength = 0;
        this.HouseList = new ArrayList<OwnerHouse>();
        this.HouseLength = 0;
    }
    
    Data(int length1, int length2)
    {
        FlatList = new ArrayList<OwnerFlat>();
        FLATMASS = new OwnerFlat[length1]; 
        this.FlatLength = length1;
        
        HouseList = new ArrayList<OwnerHouse>();
        HOUSEMASS = new OwnerHouse[length2];
        this.HouseLength = length2;
    }
    
    public OwnerFlat findOwnerFlat(boolean b, String name)
    { 
        for (int i = 0; i < FlatLength; i++) 
        {
            if (FlatList.get(i).getName().equals(name)) 
            {
                return FlatList.get(i);
            }
        }
        System.out.println("ничего не найдено");
        return null;
        
    }
    
    public void addOwner(boolean b, String name, int numberPeople, int numberFlat)
    {
        if(b)
        {
            OwnerFlat e = new OwnerFlat(name, numberPeople, numberFlat);
            FlatList.add(e);
            FlatLength++;
        }
        else
        {
            OwnerHouse e = new OwnerHouse(name, numberPeople, numberFlat);
            HouseList.add(e);
            HouseLength++;
        }
    }
    
    public void sortFlatbyRooms()
    {
        for (int i = 0; i < FlatLength - 1; i++) 
        {
            for (int j = 0; j < FlatLength - 1; j++) 
            {
                if (FlatList.get(j).getNumberRooms() > FlatList.get(j + 1).getNumberRooms()) 
                {
                    OwnerFlat e1 = new OwnerFlat(FlatList.get(j));
                    OwnerFlat e2 = new OwnerFlat(FlatList.get(j + 1));
                    FlatList.get(j + 1).setName(e1.getName());
                    FlatList.get(j + 1).setNumberPeople(e1.getNumberPeople());
                    FlatList.get(j + 1).setNumberRooms(e1.getNumberRooms());

                    FlatList.get(j).setName(e2.getName());
                    FlatList.get(j).setNumberPeople(e2.getNumberPeople());
                    FlatList.get(j).setNumberRooms(e2.getNumberRooms());
                }
            } 
        }
    };
    
        public void sortFlatbyPeople()
    {
        for (int i = 0; i < FlatLength - 1; i++) 
        {
            for (int j = 0; j < FlatLength - 1; j++) 
            {
                if (FlatList.get(j).getNumberPeople() > FlatList.get(j + 1).getNumberPeople()) 
                {
                    OwnerFlat e1 = new OwnerFlat(FlatList.get(j));
                    OwnerFlat e2 = new OwnerFlat(FlatList.get(j + 1));
                    FlatList.get(j + 1).setName(e1.getName());
                    FlatList.get(j + 1).setNumberPeople(e1.getNumberPeople());
                    FlatList.get(j + 1).setNumberRooms(e1.getNumberRooms());

                    FlatList.get(j).setName(e2.getName());
                    FlatList.get(j).setNumberPeople(e2.getNumberPeople());
                    FlatList.get(j).setNumberRooms(e2.getNumberRooms());
                }
            } 
        }
    };
    
    public void sortHousebyPeople()
    {
        for (int i = 0; i < HouseLength - 1; i++) 
        {
            for (int j = 0; j < HouseLength - 1; j++) 
            {
                if (HouseList.get(j).getNumberPeople() > HouseList.get(j + 1).getNumberPeople()) 
                {
                    OwnerHouse e1 = new OwnerHouse(HouseList.get(j));
                    OwnerHouse e2 = new OwnerHouse(HouseList.get(j + 1));
                    HouseList.get(j + 1).setName(e1.getName());
                    HouseList.get(j + 1).setNumberPeople(e1.getNumberPeople());
                    HouseList.get(j + 1).setNumberRooms(e1.getNumberRooms());

                    HouseList.get(j).setName(e2.getName());
                    HouseList.get(j).setNumberPeople(e2.getNumberPeople());
                    HouseList.get(j).setNumberRooms(e2.getNumberRooms());
                }
            } 
        }
    };
    
    public void sortHousebyRooms()
    {
        for (int i = 0; i < HouseLength - 1; i++) 
        {
            for (int j = 0; j < HouseLength - 1; j++) 
            {
                if (HouseList.get(j).getNumberRooms() > HouseList.get(j + 1).getNumberRooms()) 
                {
                    OwnerHouse e1 = new OwnerHouse(HouseList.get(j));
                    OwnerHouse e2 = new OwnerHouse(HouseList.get(j + 1));
                    HouseList.get(j + 1).setName(e1.getName());
                    HouseList.get(j + 1).setNumberPeople(e1.getNumberPeople());
                    HouseList.get(j + 1).setNumberRooms(e1.getNumberRooms());

                    HouseList.get(j).setName(e2.getName());
                    HouseList.get(j).setNumberPeople(e2.getNumberPeople());
                    HouseList.get(j).setNumberRooms(e2.getNumberRooms());
                }
            } 
        }
    };
    
    public void printFlat()
    {
        for (int i = 0; i < FlatLength; i++) 
        {
            System.out.println(FlatList.get(i).getName() + " " 
                    + FlatList.get(i).getNumberPeople() + " "
                    + FlatList.get(i).getNumberRooms());
        }
    }
    
    public void printHouse()
    {
        for (int i = 0; i < HouseLength; i++) 
        {
            System.out.println(HouseList.get(i).getName() + " " 
                    + HouseList.get(i).getNumberPeople() + " "
                    + HouseList.get(i).getNumberRooms());
        }
    }
}
