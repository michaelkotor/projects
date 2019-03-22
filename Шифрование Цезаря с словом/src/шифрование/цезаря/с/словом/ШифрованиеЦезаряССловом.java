/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифрование.цезаря.с.словом;

/**
 *
 * @author Michael
 */
public class ШифрованиеЦезаряССловом 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char[] Old = new char[32];
        char[] New = new char[32];
        int[] Number = new int[32];
        int k = 5;
        String crypt = "ПРИЛЕТАЮЗАВТРА";
        String key = "РАБОТА";
        int ch = 1040;
        String s5 = new String();
        //work with a string
        for (int i = 0; i < key.length(); i++) 
        {
            char c = key.charAt(i);
            for (int j = i; j < key.length(); j++) 
            {
                if (key.charAt(j) != c) 
                {
                    s5 = s5 + c;
                    break;
                }
            }
        }
        key = s5;
        char[] KEY = new char[key.length()];
        for (int i = 0; i < KEY.length; i++) 
        {
            KEY[i] = key.charAt(i);
        }
        System.out.println(key);
        for (int i = 0; i < Old.length; i++) 
        {
            Old[i] = (char)(ch++);
        }
        
        for (int i = 0; i < Number.length; i++) 
        {
            Number[i] = i;
        }
        int j1 = 0;
        for (int i = k; i < key.length() + k; i++) 
        {
            New[i] = KEY[j1++];
        }
        
        ch = 1040;
        boolean b = true;
        int m = 0;
        char[] KEY1 = new char[KEY.length];
        KEY1 = KEY;
        for (int i = 0; i < KEY1.length - 1; i++) 
        {
            if(KEY1[i] > KEY1[i + 1])
            {
                char c = KEY1[i];
                KEY1[i] = KEY1[i + 1];
                KEY1[i + 1] = c;
            }
        }
        for (int i = 0; i < KEY1.length - 1; i++) 
        {
            if (KEY1[i] == 'А') 
            {
                m = 1;
            }
            if ((KEY1[i + 1] - KEY1[i]) == 1) 
            {
                m++;
            }
            else
            {
                break;
            }
        }
        System.out.println("m = " + m);
        for (int i = 0; i < KEY1.length; i++) 
        {
            System.out.print(KEY1[i] + " ");
        }
        System.out.println("");
        b = false;
        int j5 = 0;
        for (int i = k + KEY.length; i < New.length;i++) 
        {
            for (int j = 0; j < KEY1.length; j++) 
            {
                b = false;
                if (Old[i - k - m - 1] != KEY1[j]) 
                {
                    
                    b = true;
                }
                else
                {
                    b = false;
                    j5++;
                    break;
                }
                if ((b == true) && (j == KEY1.length - 1)) 
                {
                    
                    New[i - j5] = Old[i - k - m - 1];
                    ;
                }
                
            }
        }
        
        for (int i = New.length - j5; i < New.length; i++) 
        {
            for (int j = 0; j < KEY1.length; j++) 
            {
                b = false;
                if (Old[i - k] != KEY1[j]) 
                {
                    
                    b = true;
                }
                else
                {
                    b = false;
                    j5++;
                    break;
                }
                if ((b == true) && (j == KEY1.length - 1)) 
                {
                    
                    New[i] = Old[i - k];
                    
                }
                
            }
        }
        
        for (int i = 0; i < k; i++) 
        {
            for (int j = 0; j < KEY1.length; j++) 
            {
                b = false;
                if (Old[29 - k - KEY1.length + i] != KEY1[j]) 
                {
                    
                    b = true;
                }
                else
                {
                    b = false;
                    break;
                }
                if ((b == true) && (j == k - 1)) 
                {
                    
                    New[i] = Old[32 - KEY1.length + i];
                }
                
            }
        }
        
        
        //sout
        for (int i = 0; i < Old.length; i++) 
        {
            System.out.print(Old[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < New.length; i++) 
        {
            System.out.print(New[i] + " ");
        }
        System.out.println("");
        System.out.println(New[31] + " !!");
        
        String ans = new String();
        for (int i = 0; i < crypt.length(); i++) 
        {
            char c = crypt.charAt(i);
            for (int j = 0; j < Old.length; j++) 
            {
                if (Old[j] == c) 
                {
                    ans = ans + New[j];
                }
            }
        }
        System.out.println(ans);
        
        //come back
        
        for (int i = 0; i < ans.length(); i++) 
        {
            char c = ans.charAt(i);
            for (int j = 0; j < New.length; j++) 
            {
                if (New[j] == c) 
                {
                    System.out.print(Old[j] + " ");
                }
                
            }
        }
    }
    
}
