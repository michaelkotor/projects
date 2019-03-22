
package pkg5.pkg1.pkg5.pkg26;

import static java.lang.Double.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) 
    {
        //All
        Scanner sc = new Scanner(System.in);
        
        //5.1
        /*for(int i = 0; i < 6; i++)
        {
            System.out.print(20 + " ");
        }*/
        
        //5.2
        /*int n = sc.nextInt();
        for (int i = 0; i <= n; i++)
        {
            System.out.println(20 + " ");
        }*/
        
        //5.12
        /*double p;
        double e = 2.71828182846;
        double p0 = 1.29;
        double z = 1.25 * pow(10, -4);
        for (int h = 0; h <= 1000; h = h + 100)
        {
            p = p0 * pow(e, - h * z);
            System.out.println(p);
        }*/
        
        //5.15
        /*int n = sc.nextInt();
        for (int i = 0; i <= 9; i++)
        {
            System.out.println(i * n);
        }*/
        
        //5.33
        /*double sum = 0;
        for (double i = 2; i < 11; i++)
        {
            sum = sum + (i) / (i + 1);
        }
        System.out.println(sum);*/
        
        //5.34
        /*double ans = 0;
        int a = 0;
        for (int i = 0; i <= 8; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                
                a = a * 3;
                ans = ans + 1.0 / (3 * a);
            }
        }*/
        //не знаю
        
        //5.36
        /*double ans = 0;
        double x = 2;
        
        for (int i = 1; i <=11; i = i + 2)
        {
            ans = ans + pow(x, i) / i;
        }
        System.out.println(ans);*/
        
        //5.37
        /*double ans = 1;
        double x = 2;
        for (double i = 2, j = 1 ; i <= 11; i++, j = j * -1)
        {
            
            ans = ans - j * (i) / (i + 1) * pow(x, i - 1);
        }
        System.out.println(ans);*/
        
        //5.66
        /*long a = 1;
        long b = 0;
        long k = sc.nextInt();
        long sum =0;
        for (long i = 0; i < k;)
        {
            a = a + b;
            sum += a;
            i++;
            if (i == k)
            {
                System.out.println(sum);
                break;
            }
            b = a + b;
            sum += b;
            i++;
            if (i == k)
            {
                System.out.println(sum);
                break;
            }
        }
        if (sum % 2 == 0)
        {
            System.out.println("YES");
        } else System.out.println("NO");*/
        
        
        //5.67
        /*int a = 1;
        int b = 0;
        int x = 1;
        
        double  k = sc.nextDouble();
        for (int i = 0; i < k; i++)
        {
            x = a + b;
            a = a + b;
            b = a + b;
            System.out.print(x + "/" + a);
            
            System.out.print(" + " + x + "/" + b + " + ");
            
        }*/
        
        
        
        
}
    
}
