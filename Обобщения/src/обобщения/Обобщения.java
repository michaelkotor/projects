/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package обобщения;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author milan
 */
public class Обобщения {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("D://Прошлая версия/NetBeansProjects/Обобщения/file.jpg");
        //file.createNewFile();
        System.out.println("Yes");
        ArrayList<Integer> like1 = new ArrayList();
        ArrayList<Integer> like2 = new ArrayList();
        like1.add(0);
        like1.add(1);
        like2.add(0);
        like2.add(1);
        boolean flag = true;
        if (Math.min(like1.size(), like2.size()) == Math.max(like1.size(), like2.size())) {
            flag = false;
        }
        for (int i = 0; i < Math.min(like1.size(), like2.size()); i++) {
            if (!like1.get(i).equals(like2.get(i))) {
                flag = false;
                break;
            }
        }
        System.out.println(like1.equals(like2));
        
        ArrayList in = new ArrayList<>();
        in = null;
        
        
    }
    public static int countNum(int[] x)
    {
        int count = 0;
        for (int i = 0; i < x.length;i++)
        {
            if (x[i] == 99)
            {
                count++;
                double y = 90000000000.; 
            } 
        }
    return count;
    }
    
    
}
