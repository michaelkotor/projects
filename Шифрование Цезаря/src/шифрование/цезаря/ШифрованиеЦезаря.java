/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифрование.цезаря;

/**
 *
 * @author Michael
 */
public class ШифрованиеЦезаря 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] Number = new int[33]; //numbers of letters
        for (int i = 0; i < Number.length; i++) 
        {
            Number[i] = i;
        }
        char[] Old = new char[33];
        char[] New = new char[33];
        int k = 3;
        for (int i = 0, j = 1040; i < Old.length; i++) 
        {
            Old[i] = (char)(j++);
        }
        
        String s3 = "ПРИЛЕТАЮСЕГОДНЯ";
        String s5 = new String();
        
        
        for (int i = 0, j = 1040 + k; i < New.length - k; i++) 
        {
            New[i] = (char)(j++);
        }
        for (int i = New.length - k - 1, j = 1040; i < New.length; i++) 
        {
            New[i] = (char)(j++);
        }
        
        for (int i = 0; i < New.length; i++) //sout 
        {
            System.out.print(New[i] + " ");
        }
        int ans = -1;
        for (int i = 0; i < s3.length(); i++) 
        {
            char c = s3.charAt(i);
            for (int j = 0; j < Old.length; j++) 
            {
                if (Old[j] == c)
                {
                    ans = j;
                }
            }
            
            s5 = s5 + New[ans];
        }
        System.out.println("");
        System.out.println(s5);
    }
    
}
