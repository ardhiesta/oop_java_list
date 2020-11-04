package oop.java.list;

import java.util.List;
import java.util.Vector;

// https://www.geeksforgeeks.org/list-interface-java-examples/
// contoh Vector
// Vector adalah class yang mengimplements interface List
/*
 * Vector is a class which is implemented in the collection framework implements a growable array of objects. 
 * Vector implements a dynamic array that means it can grow or shrink as required. 
 * Like an array, it contains components that can be accessed using an integer index. */
public class VectorDemo {
	public static void main(String[] args) {
		// Size of the vector 
        int n = 5; 
  
        // Declaring the List with initial size n 
        List<Integer> v = new Vector<Integer>(n); 
  
        // Appending the new elements 
        // at the end of the list 
        for (int i = 1; i <= n; i++) 
            v.add(i); 
  
        // Printing elements 
        System.out.println(v); 
  
        // Remove element at index 3 
        v.remove(3); 
  
        // Displaying the list after deletion 
        System.out.println(v); 
  
        // Printing elements one by one 
        for (int i = 0; i < v.size(); i++) 
            System.out.print(v.get(i) + " "); 
	}
}
