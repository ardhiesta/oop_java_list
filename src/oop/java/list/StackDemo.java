package oop.java.list;

import java.util.List;
import java.util.Stack;

// https://www.geeksforgeeks.org/list-interface-java-examples/
// class ini menunjukkan conoh implementasi Stack
/*
 * Stack is a class which is implemented in the collection framework and extends the vector class models 
 * and implements the Stack data structure. 
 * The class is based on the basic principle of last-in-first-out. 
 * In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek.*/
public class StackDemo {
	// Declaring the List
	List<Integer> s = new Stack<Integer>();

	void createStack() {
		// Size of the stack
		int n = 5;

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= n; i++)
			((Stack<Integer>) s).push(i);

		// Printing elements
		System.out.println(s);
	}

	void searchStack() {
		System.out.println("Does the stack contains '5'? " + ((Stack<Integer>) s).search(5));

		// Checking for the element "4"
		System.out.println("Does the stack contains '1'? " + ((Stack<Integer>) s).search(1));
		// Checking for the element "Hello"
		System.out.println("Does the stack contains 'Hello'? " + ((Stack<Integer>) s).search("Hello"));
	}

	void printStack() {
		// Printing elements one by one
		for (int i = 0; i < s.size(); i++)
			System.out.print(s.get(i) + " ");
	}

	public static void main(String[] args) {
		StackDemo sd = new StackDemo();
		sd.createStack();
		sd.searchStack();
		sd.printStack();
	}
}
