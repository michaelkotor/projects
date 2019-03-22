/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package криптосистема.rsa;

import static java.lang.Math.pow;
import static java.lang.Math.round;
import java.util.Random;



/**
 *
 * @author Michael
 */
public class Simple 
{
    private double N;
    private double s;
    private double t;
    private double a;
    
    public Simple()
    {
        full();
    }
    
    public void changeN()
    {
        Random random = new Random();
        
        this.N = 12313; //Random
    }
    
    public void point1()
    {
        double s1 = 0;
        double t1 = -1; 
        while(t1 == round(t1))
        {
            t = (N - 1) / (pow(2, s1));
        }
        System.out.println("We have found s and t!");
    }
    public boolean point2()
    {
        a = 234234; //Random
    }
    public boolean point3()
    {
        if (N % a == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean point4()
    {
        if ((a * t) % N == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void point5()
    {
        //look for k;
    }
    public boolean point6()
    {
        double x = N / a;
        if (x == round(x)) 
        {
            return true;
        }
        else
        {
            return false;
        }
  
    }
    
    public final void full()
    {
        
    }
}
