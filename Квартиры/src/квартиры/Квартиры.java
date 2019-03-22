/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package квартиры;

/**
 *
 * @author milan
 */
public class Квартиры {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data friends = new Data();
        friends.addOwner(true, "Michael", 10, 3);
        friends.addOwner(true, "Bob", 4, 80);
        friends.addOwner(false, "Bill", 2, 100);
        friends.addOwner(false, "Lemon", 6, 150);
        friends.printFlat();
        System.out.println("");
        friends.printHouse();
        System.out.println("");
        friends.sortFlatbyPeople();
        friends.printFlat();
        
    }
    
}
