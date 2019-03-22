/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package графы;

/**
 *
 * @author milan
 */
public class Графы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        
        theGraph.addAge(0, 1);
        theGraph.addAge(1, 2);
        theGraph.addAge(0, 3);
        theGraph.addAge(3, 4);
        
        System.out.println("Visits: ");
        theGraph.dfs();
        System.out.println("");
        
    }
    
}
