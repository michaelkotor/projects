/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифрование.системой.вижинера;

/**
 *
 * @author Michael
 */
public class ШифрованиеСистемойВижинера 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        String[][] Table = new String[33][33];
        char[] Old = new char[32];
        int j1 = 0;
        int ch = 1040;
        String message = "ПРИЛЕТАЮДЕСЯТОГО";
        String key = "РАБОТА";
        
        Table[0][0] = "!";
        for (int i = 1; i < 33; i++) 
        {
            Table[0][i] = Character.toString((char)(ch++));
            Table[i][0] = String.valueOf(j1++);
        }
        ch = 1040;
        for (int i = 0; i < 32; i++) 
        {
            Old[i] = (char)(ch++);
        }
        for (int i = 1; i < 33; i++) 
        {
            Table[i][1] = String.valueOf(Old[i - 1]);
            Table[1][i] = String.valueOf(Old[i - 1]);
        }
        for (int i = 2; i < 33; i++) 
        {
            for (int j = 2; j < 33; j++) 
            {
                char c = Table[i][j - 1].charAt(0);
                if (c == Old[31]) 
                {
                    c = 1040;
                }
                else
                {
                    c++;
                }
                
                Table[i][j] = String.valueOf(c);
            }
        }
        for (int i = 0; i < 33; i++) 
        {
            for (int j = 0; j < 33; j++)
            {
                if ((i <= 10) && (j == 0))
                {
                    System.out.print(Table[i][j] + "  ");
                }
                else
                {
                    System.out.print(Table[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        String[][] Table2 = new String[5][message.length()];
        for (int i = 0; i < message.length(); i++) 
        {
            Table2[0][i] = String.valueOf(message.charAt(i));
        }
        System.out.println("message  + " + message.length());
        int j2 = 0 ;
        while(j2 < message.length() - 1)
        {
            for (int i = 0; i < key.length(); i++) 
            {
                if (j2 < message.length()) 
                {
                    Table2[2][j2] = String.valueOf(key.charAt(i));
                    j2++;
                }
                
            }
        }
        
        for (int i = 0; i < message.length(); i++) 
        {
            String s = String.valueOf(message.charAt(i));
            for (int j = 1; j < 33; j++) 
            {
                if (s.equals(Table[1][j])) 
                {
                    Table2[1][i] = Integer.toString(j);
                }
            }
        }
        
        for (int i = 0; i < message.length(); i++) 
        {
            String s = Table2[2][i];
            for (int j = 1; j < 33; j++) 
            {    
                if (s.equals(Table[j][1])) 
                {
                    Table2[3][i] = Integer.toString(j);
                }
            }
        }
        for (int i = 0; i < message.length(); i++) 
        {
            Table2[4][i] = Table[Integer.parseInt(Table2[1][i])][Integer.parseInt(Table2[3][i])];
        }
                
        System.out.println("me");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < message.length(); j++) 
            {
                System.out.print(Table2[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        //Come back
        System.out.println("COMEBACK!!!!!!!");
        System.out.println("");
        System.out.println("");
        key = "РАБОТА";
        String crypt = "ЯРЙЩЧТРЮЕУГЯВОДЬ";
        String ans = "";
        //We use Table, because we do not chance it.
        String[][] Table3 = new String[5][crypt.length()];
        
        for (int i = 0; i < crypt.length(); i++) 
        {
            Table3[4][i] = String.valueOf(crypt.charAt(i));
        }
        
        j2 = 0;
        while(j2 < crypt.length() - 1)
        {
            for (int i = 0; i < key.length(); i++) 
            {
                if (j2 < crypt.length()) 
                {
                    Table3[2][j2] = String.valueOf(key.charAt(i));
                    j2++;
                }
                
            }
        }
        
        for (int i = 0; i < message.length(); i++) 
        {
            String s = Table3[2][i];
            for (int j = 1; j < 33; j++) 
            {    
                if (s.equals(Table[j][1])) 
                {
                    Table3[3][i] = Integer.toString(j);
                }
            }
        }
        
        for (int i = 0; i < message.length(); i++) 
        {
            String snow = String.valueOf(message.charAt(i));
            for (int j = 1; j < 33; j++) 
            {
                if (snow.equals(Table[i][j])) 
                {
                    ans = ans + snow;
                }
            }
            
        }
        System.out.println("");
        
        
        
        System.out.println("");
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < message.length(); j++) 
            {
                System.out.print(Table3[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(ans);
        
    }
    
}
