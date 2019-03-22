/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package бинароне.дерево;

import java.util.ArrayList;

/**
 *
 * @author milan
 */
public class Tree implements Needs {
    private Node root;
    ArrayList arrayList = new ArrayList();
    
    Tree() {
        root = null;
    }

    @Override
    public void insert(int Date) {
        Node newNode = new Node();
        newNode.Date = Date;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if (Date < current.Date) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        } 
    }

    @Override
    public Node find(int key) {
        Node current = root;
        if(root == null) {return null;}
        
        while(current != null) {
            if(key < current.Date) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            } 
            if (key == current.Date) {
                return current;
            }
        }
        return null;
    }

    private void inOrder(Node localRoot) {
        
        
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.Date + " ");
            arrayList.add(localRoot.Date);
            //arrayList.add(localRoot.Date);
            inOrder(localRoot.rightChild);
        }
    }
    
    @Override
    public int count() {
        System.out.println("");
        inOrder(root);
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + (Integer)arrayList.get(i);
            System.out.println("Now sum is " + sum);
        }
        arrayList.clear();
        return sum;
 
    }
}
