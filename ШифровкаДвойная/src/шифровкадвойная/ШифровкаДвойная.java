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
public class ШифровкаДвойная 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Crypt crypt = new Crypt("ПРИЛЕТАЮСЕДЬМОГО", "4132", "3142");
        String text = crypt.Encrypt();
        
        Decrypt decrypt = new Decrypt(text, "4132", "3142");
        String text1 = decrypt.ComeBack();
        System.out.println(text1);

        
    }
    
}
