/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package шифровка;

/**
 *
 * @author Michael
 */
public class Шифровка 
{

    public static void main(String[] args) 
    {
        char[] ABC = new char[26]; //normal, real contains from 1 to 26 letters A...Z
        int[] abc = new int[26]; //give old numbers UNICODE
        int[] abcx = new int[26]; //give new numbers to old letters in INUCODE
        int a = 3; 
        int b = 4; 
        int j = 65;
        int m = 26;
        String s1 = new String("ATTACK AT DAWN");
        String s2 = new String();
        
        for (int i = 0; i < abc.length; i++) //i make numbers //works
        {
            abc[i] = j;
            j++;
        }

        for (int i = 0; i < ABC.length; i++) //i make ABC //works
        { 
            ABC[i] = (char) (abc[i]);
            
        }
        //System.out.println("");
        
        for (int i = 0; i < ABC.length; i++) 
        {
            //System.out.print(ABC[i] + " ");
            
        }
        
        //System.out.println("");
        for (int i = 0; i < abcx.length; i++) //works //we shif!
        {
            abcx[i] = (char) (a * i + b) % m;
        }

        for (int i = 0; i < abcx.length; i++) 
        {
            //System.out.print(abcx[i] + " ");
        }
        
        //System.out.println("");
        
        for (int i = 0; i < s1.length(); i++) 
        {
            for (int k = 0; k < abcx.length; k++) 
            {
                if ((s1.charAt(i)) == (ABC[k]))
                {
                    s2 = s2 + ABC[abcx[k]];
                    //System.out.println(ABC[abcx[k]]);
                } 
            }
        }
        System.out.println("s2 = " + s2);
        
        //Come back
        String s3 = new String("EJJEKIEJNESR");
        String s4 = new String();
        
        for (int i = 0; i < s3.length(); i++) 
        {
            for (int k = 0; k < abcx.length; k++) 
            {
                if (s3.charAt(i) == ABC[abcx[k]])
                {
                    //System.out.println(ABC[k]);
                    s4 = s4 + ABC[k];
                }
            }
        }
        System.out.println("s4 = " + s4);
        
    }
    
}
