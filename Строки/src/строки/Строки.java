/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package строки;

/**
 *
 * @author Michael
 */
public class Строки 
{

    public static void main(String[] args) 
    {
        //9.13
        /*
        String s = new String("rtbwvw");
        System.out.println(s.charAt(3));
        */
        
        //9.14
        /*
        String s = new String("hgvjb");
        System.out.println(s.charAt(s.length() - 1));
        */
        
        //9.15
        /*
        int k = 4;
        String s = new String("getrwgea");
        System.out.println(s.charAt(k - 1));
        */
        
        //9.16
        /*
        String s = new String("rhehthb");
        if (s.charAt(1) == s.charAt(3)) 
        {
            System.out.println("YES");
        }
        */
        
        //9.17
        /*
        String s1 = new String("sssssss");
        String s2 = new String("szzzzzs");
        if ((s1.charAt(0) == s2.charAt(0)) && (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1))) 
        {
            System.out.println("Начинаются и оканчиваются на одну и ту же букву");
        }
        */
        
        //9.18
        /*
        String s1 = new String("fthgjkl");
        String s2 = new String("koppkok");
        if (s1.charAt(0) == s2.charAt(s2.length() - 1))
        {
            System.out.println("YES");
        }
        */
        
        //9.19
        /*
        String s = new String("rgbvs");
        System.out.println(s.charAt(1) + "" + s.charAt(3));
        */
        
        //9.20
        /*
        String s = new String("etrvtvrt");
        System.out.println(s.charAt(2) + "" + s.charAt(s.length() - 1));
        */
        
        //9.21
        /*
        String s = new String("egvwcebrwv");
        System.out.println(s.charAt(1) + "" + s.charAt(2) + "" + s.charAt(3));
        */
        
        //9.22
        /*
        String s = new String("tyrbfv");
        int l = s.length() / 2;
        System.out.println(s.substring(0, l));
        */
        
        //9.23
        /*
        String s = new String("jhngbfv");
        int m = 2, k = 6;
        System.out.println(s.substring(m - 1, k));
        */
        
        //9.24
        /*
        String s = new String("яблоко");
        String s1 = s.substring(1, 5);
        System.out.println(s1);
        String s2 = s.substring(3, 6);
        System.out.println(s2);
        */
        
        //9.25
        /*
        String s = new String("информатика");
        System.out.println(s.substring(2, 7) + " " +  s.substring(7, 10));
        */
        
        //9.26
        /*
        String s = new String("вертикаль");
        System.out.println(s.substring(3, 5) + "" +s.substring(2, 3) + " " + s.substring(0, 2) + "" + s.substring(3, 4) + s.substring(5, 7));
        */
        
        //9.31
        /*
        String s = new String("вирус");
        System.out.println(s.replace("вир", "фок"));
        */
        
        //9.32
        /*
        String s = new String("курсор");
        System.out.println(s.replace("курс" , "танц"));
        */
        
        //9.33
        /*
        String s = new String("пробел");
        System.out.println(s.replace('б', 'д'));
        */
        
        //9.34
        /*
        String s = new String("строка");
        System.out.println(s.replace('к','ф'));
        */
        
        //9.37 a
        /*
        String s = new String("123456");
        s = (s.substring(s.length() / 2, s.length())).concat(s.substring(0, s.length() / 2));
        System.out.println(s);
        */
        
        //9.37 b
        /*
        String s = new String("456123");
        String s1 = new String();
        String s2 = new String();
        
        for (int i = 0; i < s.length() / 2; i++) 
        {
            s1 = s1.concat(s.substring(i, i + 1));
        }
        for (int i = s.length() / 2; i < s.length(); i++) 
        {
            s2 = s2.concat(s.substring(i, i + 1));
        }
        System.out.println(s2 + "" + s1);
        */
        
        //12.215
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
