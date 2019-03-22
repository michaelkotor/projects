/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работа.с.файлами;
import com.sun.istack.internal.logging.Logger;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
/**
 *
 * @author Michael
 */
public class Files 
{

    public static void main(String[] args) throws IOException 
    {
        //14.1
        /*
        FileWriter fw = new FileWriter("MyFile.txt");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
        {
            int j = sc.nextInt();
            fw.write(j + " ");
        }
        f.close();
        */
        
        //read
        /*
        FileReader fr = new FileReader("MyFile.txt");
        Scanner scan = new Scanner(fr);
        System.out.println(scan);
        scan.close();
        System.out.println("Журнал '%s'\n");*/
        
        //Создание класса
        
        String[] mas = new String[3];
        mas[0] = "hi";
        mas[1] = " i am ";
        mas[2] = " Michael";
        File file = new File("C:/Users/Michael/Documents/NetBeansProjects/File/new.txt");
        file.createNewFile();
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        for (int i = 0; i < mas.length; i++) 
        {
            out.append(mas[i]);
        }
        out.close();
        String[] mas1 = new String[3];
        StringBuffer sb = new StringBuffer();
        BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
        for (int i = 0; i < 3; i++) 
        {
            mas1[i] = in.readLine();
            sb.append(mas1[i] + " ");
        }
        System.out.println("!");
    }

    
}
