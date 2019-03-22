/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package матрица;

/**
 *
 * @author milan
 */
public class Матрица {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        int[][] mass = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < mass.length; i++) 
        {
            for (int j = 0; j < mass.length; j++)
            {
                System.out.println(mass[i][j] + "\n Ряд: " + i + "\n Столбец: " + j);
                //System.out.println("Element: " + mass[i][j] + "\n Ряд: " + i + "\n Столбец: " + j);
            }
            System.out.println("");

            
        }

    } 
}
