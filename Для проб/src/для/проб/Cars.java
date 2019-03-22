/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package для.проб;

/**
 *
 * @author Michael
 */
class Cars
{
    private String marka;
    private String color;
    private int power;
    private int kol;
    private String type;
    private int cena;
    
    public Cars(String marka, String color, int power, int kol, String type, int cena)
    {
        this.marka = marka;
        this.color = color;
        this.power = power;
        this.kol = kol;
        this.type = type;
        this.cena = cena;
    }
    
    public void setMarca(String marka, int password)
    { 
        if (password == 21121985)
        {
            this.marka = marka;
        }
        else
        {
            System.out.println("Error");
        }
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setPower(int power)
    {
        this.power = power;
    }
    
    public void setKol(int kol)
    {
        this.kol = kol;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setCena(int cena)
    {
        this.cena = cena;
    }
 
    public String getMarca()
    {
        return marka;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public int getPower()
    {
        return power;
    }
    
    public int getKol()
    {
        return kol;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getCena()
    {
        return cena;
    }
    
    public String toString()
    {
        return marka + "  " + color + " " + power + " " + kol + " " + type + " " + cena; 
    }
    
}
