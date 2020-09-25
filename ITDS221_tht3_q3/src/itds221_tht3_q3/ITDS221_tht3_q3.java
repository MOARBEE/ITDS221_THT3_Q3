
package itds221_tht3_q3;

import java.util.*;

public class ITDS221_tht3_q3 {

    public static void main(String[] args) {
        
        //create a hastable which accepts integers for the ID and a string for the user name (dummy data)
        Hashtable<Integer, String> hTable = 
               new Hashtable<Integer, String>();
        
        hTable.put(1, "Joe");
        hTable.put(2, "Michael");
        hTable.put(3, "Thando");
        hTable.put(4, "Kelly");
        hTable.put(5, "Dwayne");
        hTable.put(6, "Amanda");
        hTable.put(7, "Jordan");
        hTable.put(8, "Travis");
        
        //converting it to a toString so that it can be displayed
        System.out.println("Hash table: " + hTable.toString());
        System.out.println(); //To make a space
        
        
        //This is to give a value for a new key which is absent using the .computeIfAbsent
        hTable.computeIfAbsent(9, k -> "James");
        hTable.computeIfAbsent(10, k -> "Husnaa");
        
        
        //This will display the hash table with the new inserted values.
        System.out.println("Hash table with inserted values: " + hTable);
        System.out.println();
        
        
        //remove
      hTable.remove(3);
      hTable.remove(6);
      hTable.remove(9);
      
      //Display the hash table with the 3,6 and 9 having been deleted
        System.out.println("Hash table with deleted values" + hTable);
        
    }
    
}
