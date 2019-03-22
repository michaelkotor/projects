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
class Generate
{
    private String s;
    private double a;
    private char c;
    
    Generate()
    {
        this.a = 0;
        this.s = "";
        this.c = 0;
    }
    
    String createName()
    {
        int j = 1;
        while(j != 0)
        {
            a = Math.random();
            a = a * 100;
            a = (int) a;
            if ((a >= 65) && (a <= 90)) 
            {   
                c = (char)a;
                j--;
            }
        }
        s = s + c;
        for (int i = 0; i < 5;) 
        {
            a = Math.random();
            a = a * 100;
            a = (int) a;
            if ((a >= 97)&&(a <= 122)) 
            {
                c = (char) a;
                s = s + c;
                i++;
            }  
        }
        return s;
    }
    
    String createName(int n)
    {
        for (int i = 0; i < 5;) 
        {
            a = Math.random();
            a = a * 100;
            a = (int) a;
            if ((a >= 49)&&(a <= 57)) 
            {
                c = (char) a;
                s = s + c;
                i++;
            }  
        }
        return s;
    }
    void clean()
    {
        s = "";
        c = 0;
        a = 0;
    }
}
