/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифровкадвойная;

/**
 *
 * @author Michael
 */
public class Crypt 
{
    private String text;
    private String a;
    private String b;
    private String message;
    private char[][] Table;
    private int length;
    
    public Crypt(String text, String a, String b)
    {
        this.a = a;
        this.b = b;
        this.text = text;
        this.length = text.length();
        this.length = (int)(length / 4) + 1;
        this.message = "";
    }
    public Crypt()
    {
        
    }
    
    String Encrypt()
    {
        
        Table = new char[length][length];
        Table[0][0] = ';';
        for (int i = 1; i < length; i++)
        {
            Table[0][i] = a.charAt(i - 1);
            Table[i][0] = b.charAt(i - 1);
        }
        int k = 0;
        for (int i = 1; i < length; i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                Table[i][j] = text.charAt(k++);
            }
        }
        
        for (int i = 1; i < length; i++) 
        {
            for (int j = i; j < length - 1; j++) 
            {
                if (Table[0][j] > Table[0][j + 1])
                {
                    for (int l = 0; l < length; l++) 
                    {
                        char c2 = Table[l][j];
                        Table[l][j] = Table[l][j + 1];
                        Table[l][j + 1] = c2;
                    }
                }
            }
        }
        
        for (int i = 1; i < length; i++) 
        {
            for (int j = i; j < length - 1; j++) 
            {
                if (Table[j][0] > Table[j + 1][0])
                {
                    for (int l = 0; l < length; l++) 
                    {
                        char c2 = Table[j][l];
                        Table[j][l] = Table[j + 1][l];
                        Table[j + 1][l] = c2;
                    }
                }
            }
        }
        Crypt s1 = new Crypt();
        s1.Print(Table);
        
        for (int i = 1; i < length; i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                message = message +Table[i][j];
            }
        }
        
        return message;
    }
    
    public void Print(char[][] mas)
    {
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
}
