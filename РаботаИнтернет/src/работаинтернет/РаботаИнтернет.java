/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package работаинтернет;

import java.io.IOException;

/**
 *
 * @author milan
 */
public class РаботаИнтернет {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("netsh wlan disconnect"); 
        //Runtime.getRuntime().exec("");
        //System.out.println();
        //Runtime.getRuntime().exec("netsh");
        //System.out.println(Runtime.getRuntime().exec("ping"));
        
    }   
}
