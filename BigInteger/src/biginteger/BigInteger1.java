/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Michael
 */
public class BigInteger1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger m1 = new BigInteger("322222222222222222");
        BigInteger m2 = new BigInteger("2");
        Random r = new Random();
        System.out.println(r.nextInt(5) + 3);
        System.out.println(m2.pow(768));
        //System.out.println(m2.intValue());
        //System.out.println(BigInteger.probablePrime(3, new Random()));
        
    }
    
}
