/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package бинароне.дерево;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author milan
 */
public class БинаронеДерево {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        int mas[] = {500, 23, 45, 65, 1, 2, 4, 6, 8, 9, 9};
        ArrayList<Integer> array = new ArrayList();
        for (int i = 0; i < mas.length; i++) {
            tree.insert(i);
            array.add(i);
        }
        
        array.add(null);
        System.out.println(Arrays.stream(mas).sum());
        System.out.println(tree.count());
        
    }
    
}
