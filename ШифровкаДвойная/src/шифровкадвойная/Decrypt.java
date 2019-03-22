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
public class Decrypt 
{
    private String message;
    private String text;
    private char Table[][];
    private String a;
    private String b;
    int length;
    public Decrypt()
    {
        
    }
    public Decrypt(String message, String a, String b)
    {
        this.a = a;
        this.b = b;
        this.message = message;
        length = message.length();
        length = (int)(length / 4) + 1;
        text = "";
        
    }
    
    public String ComeBack()
    {
        Table = new char[length][length];
        int ch = 49;
        Table[0][0] = ';';
        for (int i = 1; i < length; i++) 
        {
            Table[0][i] = (char)ch;
            Table[i][0] = (char)ch;
            ch++;
        }
        ch = 0;
        for (int i = 1; i < length; i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                Table[i][j] = message.charAt(ch++);
            }
        }
        
        //main
        
        for (int i = 0; i < b.length(); i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                if (b.charAt(i) == Table[j][0])
                {
                    for (int k = 0; k < length; k++) 
                    {
                        char c = Table[i + 1][k];
                        Table[i + 1][k] = Table[j][k];
                        Table[j][k] = c;
                    }
                }
            }
        }
        
        
        for (int i = 0; i < a.length(); i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                if (a.charAt(i) == Table[0][j])
                {
                    for (int k = 0; k < length; k++) 
                    {
                        char c = Table[k][i + 1];
                        Table[k][i + 1] = Table[k][j];
                        Table[k][j] = c;
                    }
                }
            }
        }
        
        for (int i = 1; i < length; i++) 
        {
            for (int j = 1; j < length; j++) 
            {
                text = text + Table[i][j];
            }
        }
        
        Crypt c = new Crypt();
        c.Print(Table);
        return text;
    }
    
    
}
