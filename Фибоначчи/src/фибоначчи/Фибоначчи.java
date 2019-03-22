/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package фибоначчи;


public class Фибоначчи {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*int a = 1;
        int b = 1;
        int n = 5;
        System.out.println(1);
        System.out.println(1);
        for (int i = 0; i < n - 2;)
        {
            if (i < n - 2)
            {
                a = a + b;
                System.out.println(a);
                i++;
            }
            else
            {
                break;
            }
            if (i < n - 2)
            {
                b = a + b;
                System.out.println(b);
                i++;
            }
            else
            {
                break;
            }
            
        }*/
        
        
        // вывод конкретного числа
        /*int a = 1;
        int b = 1;
        int n = 7;
        int sum = 0;
        
        for (int i = 0; i < n - 2;)
        {
            if (i < n - 2)
            {
                a = a + b;
                sum += a;
                i++;
                if (i == n - 2)
                {
                    System.out.println(a);
                    break;
                }
            }
            
            if (i < n - 2)
            {
                b = a + b;
                sum += b;
                i++;
                
                if (i == n - 2)
                {
                    System.out.println(b);
                    break;
                }
            }
            
        }
        System.out.println(sum);
        */
        
        //5.67 b
        /*
        int a1 = 1;
        int b1 = 2;
        int a2 = 1;
        int b2 = 1;
        int n = 7;
        int sum = 0;
        
        System.out.println(a1 + " / " + a2);
        System.out.println(b1 + " / " + b2);
        for (int i = 0; i < n - 2;)
        {
            if (i < n - 2)
            {
                
                a2 = a2 + b2;
                b2 = a2 + b2;
                i++;
                System.out.println(a2 + " / " + b2);
            }
            else
            {
                break;
            }
            if (i < n - 2)
            {
                a1 = a1 + b1;
                b1 = a1 + b1;
                i++;
                System.out.println(a1 + " / " + b1);
            }
            else
            {
                break;
            }
            
            
        }*/
        
        //5.67 a
        /*
        int a1 = 1;
        int b1 = 2;
        int a2 = 1;
        int b2 = 1;
        int n = 7;
        int sum = 0;
        
        //System.out.println(a1 + " / " + a2);
        //System.out.println(b1 + " / " + b2);
        for (int i = 0; i < n - 2;)
        {
            if (i < n - 2)
            {
                
                a2 = a2 + b2;
                b2 = a2 + b2;
                i++;
                if (i == n - 2)
                {
                    System.out.println(a2 + " / " + b2);
                    break;
                }
            }
            else
            {
                break;
            }
            if (i < n - 2)
            {
                a1 = a1 + b1;
                b1 = a1 + b1;
                i++;
                if (i == n - 2)
                {
                    System.out.println(a1 + " / " + b1);
                    break;
                }
            }
            
            
        }*/
        
        //5.67 v
        
        /*double a1 = 1;
        double b1 = 2;
        double a2 = 1;
        double b2 = 1;
        double n = 7;
        double sum = 0;
        
        sum = a1 / a2 + b1 / b2;
        //System.out.println(a1 + " / " + a2);
        //System.out.println(b1 + " / " + b2);
        for (int i = 0; i < n - 2;)
        {
            if (i < n - 2)
            {
                
                a2 = a2 + b2;
                b2 = a2 + b2;
                i++;
                sum =sum + a2 / b2;
                
            }
            else
            {
                break;
            }
            if (i < n - 2)
            {
                a1 = a1 + b1;
                b1 = a1 + b1;
                i++;
                sum = sum + a1 / b1;
            }
            
            
        }
        System.out.println(sum);*/
        
        //5.69
        /*
        int t = 6;
        int ans = 1;
        for (int i = 0; i < t; i = i + 3)
        {
            ans = 2 * ans;
            
        }
        System.out.println(ans);*/
        
        //5.70
        /*double n = 1000;
        double pro = 0.02;
        
        int t = 7;
        for (int i = 0; i < t - 1;)
        {
            if (i < t - 1)
            {
                n = n + n * pro;
                i++;
                if (i == t - 1)
                {
                    System.out.println(n - 1000 - n * pro);
                }
            }
            else
            {
                break;
            }
            
        }*/
        
        //5.71
        
        /*double dist = 10;
        double pro = 0.1;
        int n = 5;
        for (int i = 0; i < n - 1;)
        {
            if (i < n - 1)
            {
                dist = dist + dist * pro;
                i++;
                if (i == n - 1)
                {
                    System.out.println(dist - 10 - dist * pro);
                }
            }
            else
            {
                break;
            }
        }*/
        
        //5.72
        /*double s = 100;
        double ds = 0.05;
        double best = 20;
        double dbest = 0.02;
        int n = 6;
        for (int i = 0; i < n - 1;)
        {
            if ( i < n - 1)
            {
                s = s + s * ds;
                best = best + best * dbest;
                i++;
                if (i == n - 1)
                {
                    System.out.println(s * best);
                }
            }
        }*/
        
        //5.74
        /*double ans = 0;
        for (int i = 0; i <= 10; i++)
        {
            ans = ans + Math.pow(2, i);
        }
        System.out.println(ans);*/
        
        //5.75
        /*double a = 5;
        double ans = 0;
        double n = 10;
        for (int i = 0; i <= n; i++)
        {
            //a = Math.pow(a, i);
            System.out.println(Math.pow(a, i));
        }*/
        
        //5.76
        /*double ans = 0;
        for (double i = 1, j = -1; i <= 10; j = j  *(-1))
        {
            ans  = ans + j * Math.pow(i, 2);
            i++;
        }
        System.out.println(ans);*/
        
        //5.77
        /*double x = 1;
        double y = 1;
        double h = 0;
        double s =0;
        double c = 0.01;
        for (double i = 2.666; i <= 6; i = i + c)
        {
            h = (3.0 / 10.0) * (i - 1) * (i - 1);
            s = s + h * c;
            System.out.println(s);
        }
        System.out.println(s * 2);*/
        
        
        double x = 1;
        double y = 1;
        double h = 0;
        double s =0;
        double c = 0.000000001;
        for (double i = 3; i <= 7; i = i + c)
        {
            h = Math.sin(i) +10;
            s = s + h * c;
            
        }
        System.out.println(s);
        
        
    }
    
}
