/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифровка.таблицей;

import java.util.Random;

/**
 *
 * @author Michael
 */
public class ШифровкаТаблицей 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char[][] Table = new char[6][6];
        String shif = "ПРИЛЕТАЮ СЕДЬМОГО В ПОЛДЕНЬ";
        String key = new String("КОРОВА");
        int ch = 0; 
        for (int i = 0; i < 6; i++) //i fill the key to the first row
        {
            Table[0][i] = key.charAt(i);
        } //end
        
        char ch11 = 49;
        for (int i = 0; i < 6; i++) //i fill numbers from 1 to 6 to key word
        {
            Table[1][i] = ch11;
            System.out.println("?. " + ch11);
            ch11++;
        }
        
        for (int j = 0; j < 6; j++) //i fill the cipher to Table from up to down
        {
            for (int i = 2; i < 6; i++) 
            {
                if (shif.charAt(ch) == ' ') 
                {
                    ch++;
                }
                Table[i][j] = shif.charAt(ch);
                ch++;
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 6; i++)  //System.out.println("");
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < 6; i++)  // i encrypt by sorting the key word and its coloms   
        {
            for (int j = 0; j < 5; j++) 
            {
                if (Table[0][j] > Table[0][j + 1])
                {
                    for (int k = 0; k < 6; k++) // i change each raw
                    {
                        char c1;
                        c1 = Table[k][j];
                        Table[k][j] = Table[k][j + 1];
                        Table[k][j + 1] = c1;
                    }
                }
            }
        }
        
        System.out.println("");
        for (int i = 0; i < 6; i++) //System.out.println("");      
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        String s5 = new String();
        
        for (int i = 2; i < 6; i++) // i take back the string normaly
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table[i][j] + " ");
                s5 = s5 + Table[i][j];
            }
        }
        
        System.out.println("chipher: " + s5);
        System.out.println("");
        System.out.println("NOOOOOOOOOOOOOOOOO");
        System.out.println("");
        
        for (int i = 0; i < 6; i++) //System.out.println("");
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Come back
        //i come back
        
        char[][] Table2 = new char[6][6];
        
        //i fill the table2
        
        for (int i = 0; i < 6; i++) //write key into 
        {
            Table2[0][i] = key.charAt(i);
        }
        
        System.out.println("here");
        for (int i = 0; i < 6; i++) //out
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table2[i][j] + " ");
            }
            System.out.println("");    
        }
        
        ch11 = 49;
        for (int i = 0; i < 6; i++) //put numbers
        {
            Table2[1][i] = ch11++;
        }
        int ix = 0;
        for (int i = 2; i < 6; i++) //fill in the cipher
        {
            for (int j = 0; j < 6; j++) 
            {
                Table2[i][j] = s5.charAt(ix++);
            }
        }
        
        
        ch11 = 49;
        
        for (int i = 0; i < 6; i++) //here i sort the first two raws who it was
                                    //in a real one
        {
            for (int j = 0; j < 5; j++) 
            {
                if(Table2[0][j] > Table2[0][j + 1])
                {
                    for (int k = 0; k < 2; k++) 
                    {
                        char c1;
                        c1 = Table2[k][j];
                        Table2[k][j] = Table2[k][j + 1];
                        Table2[k][j + 1] = c1;
                    }
                }
            }
        }

        //now i sort it back, how it was some timw before, by sorting numbers
        
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if (Table2[1][j] > Table2[1][j + 1])
                {
                    for (int k = 0; k < 6; k++) 
                    {
                        char c1 = Table2[k][j];
                        Table2[k][j] = Table2[k][j + 1];
                        Table2[k][j + 1] = c1; 
                    }
                }
            }
        }
        
        System.out.println("now we are here");
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Table2[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(""); 
        for (int j = 0; j < 6; j++) 
        {
            for (int i = 0; i < 6; i++) 
            {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
        String ans = new String(); //our dear message
        for (int j = 0; j < 6; j++) 
        {
            for (int i = 2; i < 6; i++) 
            {
                ans = ans + Table2[i][j];
            }
        }
        System.out.println(ans);
    }
    
}
