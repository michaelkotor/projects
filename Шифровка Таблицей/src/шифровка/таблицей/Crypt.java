/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифровка.таблицей;

/**
 *
 * @author Michael
 */
public class Crypt 
{
    private String text;
    private String a;
    private String b;
    private int x;
    private String message;
    char Table[][];
    
    
    public Crypt()
    {
        
    }
    
    public Crypt(String text, String a, String b)
    {
        this.a = a;
        this.b = b;
        this.text = text;
        this.x = (int)(x / 4) + 1;
    }
    
    public String Encrypt()
    {
        System.out.println("hbhbhubkjbhkjh");
        for (int i = 1; i < x; i++) 
        {
            Table[0][i] = a.charAt(i - 1);
            Table[i][0] = b.charAt(i - 1);
        }
        int ch = 0;
        for (int i = 1; i < x; i++)
        {
            for (int j = 1; j < x; j++) 
            {
                Table[i][j] = text.charAt(ch++);
            }
        }
        
        
        for (int i = 1; i < x; i++) 
        {
            for (int j = i; j < x; j++) 
            {
                if (Table[0][j] > Table[0][j + 1])
                {
                    for (int k = 0; k < x; k++) 
                    {
                        char c1 = Table[k][j];
                        Table[k][j] = Table[k][j + 1];
                        Table[k][j + 1] = c1;
                    }
                }
            }
        }
        /*
        for (int i = 1; i < x; i++) 
        {
            for (int j = i; j < x; j++) 
            {
                if (Table[j][0] > Table[j + 1][0])
                {
                    for (int k = 0; k < x; k++) 
                    {
                        char c1 = Table[k][j];
                        Table[k][j] = Table[k][j + 1];
                        Table[k][j + 1] = c1;
                    }
                }
            }
        }
        */
        Crypt c = new Crypt();
        c.Print(Table);
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
