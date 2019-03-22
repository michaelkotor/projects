package автосервис;

import java.util.ArrayList;

class Car
{
    private int clas;
    private String type;
    private int cost;

    Car(int clas, String type, int cost)
    {
        this.clas = clas;
        this.type = type;
        this.cost = cost;
    }
    
    Car(int cost)
    {
        this.cost = cost;
    }
    
    Car()
    {
        this.clas = 9;
        this.type = "MERSEDESS";
        this.cost = 8;
    }
    
    //Set
    
    void setCost(int cost)
    {
        this.cost = cost;
    }
    void setType(String type)
    {
        this.type = type;
    }
    void setClas(int c)
    {
        this.clas = c;
    }
    
    //Print
    
    void PrintCost()
    {
        System.out.println("Cost of the car: " + this.cost);
    }
    void PrintType()
    {
        System.out.println("Type of the car: " + this.type);
    }
    void PrintClas()
    {
        System.out.println("Class of the car: " + clas);
    }
    
    //Get
    
    int getClas()
    {
        return this.clas;
    }
    String getType()
    {
        return this.type;
    }
    int getCost()
    {
        return this.cost;
    }
    
}

class Client
{
    private int age;
    private int type;
    private int rich;
    
    Client(int age, int type, int rich)
    {
        this.age = age;
        this.type = type;
        this.rich = rich;
    }
    Client()
    {
        this.age = 18;
        this.rich = 20000;
        this.type = 0;
    }
    
    //Set
    
    void setAge(int age)
    {
        this.age = age;
    }
    void setRich(int rich)
    {
        this.rich = rich;
    }
    void setType(int type)
    {
        this.type = type; 
    }
    
    //Print
    
    void PrintAge()
    {
        System.out.println("Age of the client: " + this.age);
    }
    void PrintType()
    {
        System.out.println("Type of the client: " + this.type);
    }
    void PrintRich()
    {
        System.out.println("Richness of a client: " +this.rich);
    }
    
    //Get
    
    int getAge()
    {
        return this.age;
    }
    int getType()
    {
        return this.type;
    }
    int getRich()
    {
        return this.rich;
    }
     
    
}

public class Автосервис 
{

    public static void main(String[] args) 
    {
        Car[] a = new Car[10];
        Client[] b = new Client[10]; 
        int la = a.length;
        int lb = b.length;
        
        int cost = 10000;
        int rich = 15000;
        
        
        for (int i = 0; i < lb; i++) 
        {
            b[i] = new Client();
            b[i].setRich(rich);
            rich += 9000;
            
            for (int j = 0; j < la; j++) 
            {
                a[i] = new Car();
                a[i].setCost(cost);
                cost += 10000;
                if (b[i].getRich() > a[i].getCost()) 
                {
                    System.out.println("Client " + i + " can buy " + a[i].getType() + " because he has: " + b[i].getRich() + " and this more than " + a[i].getCost() + " (cost of the car)");
                }
                else
                {
                    System.out.println("Client " + i + " can not buy " + a[i].getType() + " beacuse he has: " + b[i].getRich() + " and this less than " + a[i].getCost() + " (cost of the car)" );
                }
            }
            cost = 10000;
        }
        
        
        
    }
    
}
