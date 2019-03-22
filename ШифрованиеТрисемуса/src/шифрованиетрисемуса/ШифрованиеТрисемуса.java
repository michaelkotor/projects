/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифрованиетрисемуса;

/**
 *
 * @author Michael
 */
public class ШифрованиеТрисемуса 
{
    public static void main(String[] args) 
    {
        String key = new String("РАБОТА");
        String message = new String("ПРИЛЕТАЮЗАВТРА");
        int a = 4; int b = 8;
        char[][] Table = new char[a][b];
        String s5 = "";
        boolean b1;
        System.out.println(key);
        String x = "";
        char[] Old = new char[32];
        int ch = 1040;  
        for (int i = 0; i < 32; i++) //normal alphabet
        {
            Old[i] = (char)(ch++);
        }
        for (int i = 0; i < key.length(); i++) //i short the key DO NOT WORK
        {
            char c = key.charAt(i);
            for (int j = i + 1; j < key.length(); j++) 
            {
                if (c == key.charAt(j)) 
                {
                    for (int k = 0; k < key.length(); k++) 
                    {
                        if (k != j) 
                        {
                            x = x + key.charAt(k);
                        }
                        else
                        {
                            k++;
                        }
                    }
                    s5 = x; 
                }
            }
        }      
        key = s5;
        System.out.println(key);
        char[] KEY = new char[key.length()];
        for (int i = 0; i < KEY.length; i++) //in mass
        {
            KEY[i] =  key.charAt(i);
        }
        char[] KEY1 = new char[key.length()];
        KEY1 = KEY;
        for (int i = 0; i < KEY1.length - 1; i++) //sort
        {
            if (KEY1[i] > KEY1[i + 1]) 
            {
                char c = KEY1[i + 1];
                KEY1[i + 1] = KEY1[i];
                KEY1[i] = c;
            }
        }
        boolean b3;
        int j7 =0;
        char[] New = new char[32 - KEY1.length + j7];
        for (int i = 0; i < New.length + j7; i++) //alpha ithout letters of key
        {
            char c = Old[i];
            for (int j = 0; j < KEY1.length; j++) 
            {
                b3 = false;
                if (KEY1[j] != c) 
                {
                    b3 = true;     
                }
                else
                {
                    j7++;
                    break;
                }
                if ((b3 == true) && (j == KEY1.length - 1)) 
                {
                    New[i - j7] = Old[i];
                }
            }
        }
        for (int i = 0; i < New.length; i++)
        {
            System.out.print(New[i] + " ");
        }
        int m = 0;
        int j5 = 0;
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < b; j++)
            {
                if ((i == 0) && ((j >= 0) && (j < KEY.length))) 
                {
                    Table[i][j] = key.charAt(m++);
                }
                else
                {
                    Table[i][j] = New[j5++];
                }
                
            }
        }
        System.out.println("");
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < b; j++) 
            {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
        String ans = "";
        for (int i1 = 0; i1 < message.length(); i1++) 
        {
            char c = message.charAt(i1);
            for (int i = 0; i < a; i++) 
            {
                System.out.println("c = " + c);
                for (int j = 0; j < b; j++) 
                {
                    if (c == Table[i][j]) 
                    {
                        if (i == a - 1) 
                        {
                            ans = ans + Table[0][j];
                        }
                        else
                        {
                            ans = ans + Table[i + 1][j];
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        String m1 = "";
        //Come back
        for (int i1 = 0; i1 < ans.length(); i1++) 
        {
            char c = ans.charAt(i1);
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < b; j++) 
                {
                    if (c == Table[i][j]) 
                    {
                        if (i == 0) 
                        {
                            m1 = m1 + Table[a - 1][j];
                        }
                        else
                        {
                            m1 = m1 + Table[i - 1][j];
                        }
                    }
                }
            }
        }
        System.out.println(m1);
        
        
    }
    
}
