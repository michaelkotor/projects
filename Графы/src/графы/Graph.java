/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package графы;


import java.util.Stack;

/**
 *
 * @author milan
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int[][] adjMat;
    private int nVerts;
    private Stack<Integer> theStack = new Stack();
    private Queue theQueue = new Queue();
    
    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        
    }
    
    void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }
    
    void addAge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }
    
    int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    
    void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        while( !theStack.isEmpty() ) {
            int v = getAdjUnvisitedVertex( theStack.peek() );
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
    
}
