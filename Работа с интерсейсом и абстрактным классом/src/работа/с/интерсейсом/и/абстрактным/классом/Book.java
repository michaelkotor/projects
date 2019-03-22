/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работа.с.интерсейсом.и.абстрактным.классом;

/**
 *
 * @author Michael
 */
public abstract class Book implements Writing
{
    protected String name;
    protected String color;
    protected static boolean EXIT = true;
    Book()
    {
        
    }
    
    Book(String name, String color)
    {
        this.color = color;
        this.name = name;
    }
    
    public static void changeEXIT()
    {
        if (EXIT) 
        {
            EXIT = false;
        } 
        else
        {
            EXIT = true;
        }
    }
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return color;
    }
    public String getName()
    {
        return name;
    }
    

    public abstract void openBook();
}
