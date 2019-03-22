/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package узнать.свой.ip.адрес;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author milan
 */
public class УзнатьСвойIPАдрес 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            InetAddress i1 = InetAddress.getLoopbackAddress();
            InetAddress inet = InetAddress.getLocalHost();
            InetAddress[] ips = InetAddress.getAllByName(inet.getCanonicalHostName());
            if (ips  != null ) 
            {
                for (int i = 0; i < ips.length; i++) 
                {
                    System.out.println(ips[i]);
                    System.out.println(i1.getAddress());
                }
            }
        } 
        catch (UnknownHostException e) 
        {

        }
          }
    
}
