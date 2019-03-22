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
public class Vertex {
    char label;
    boolean wasVisited;
    
    Vertex(char lab) {
        this.label = lab;
        this.wasVisited = false;
    }
}
