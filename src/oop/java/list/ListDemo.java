package oop.java.list;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/list-interface-java-examples/
// demo list di Java
public class ListDemo {
	public static void main(String[] args) {
		// membuat list
		// Creating a list
		List<Integer> l1 = new ArrayList<Integer>();

		// menambahkan element list
		// Adds 1 at 0 index
		l1.add(0, 1);

		// Adds 2 at 1 index
		l1.add(1, 2);
		System.out.println("list l1: "+l1);

		// Creating another list
		List<Integer> l2 = new ArrayList<Integer>();

		l2.add(1);
		l2.add(2);
		l2.add(3);

		// menambahkan list l2 ke l1 di index 1
		// Will add list l2 from 1 index
		l1.addAll(1, l2);
		System.out.println("list l1 after l2 added: "+l1);

		// menghapus element l1 di index 1
		// Removes element from index 1
		l1.remove(1);
		System.out.println("list l1 after 1 removed: "+l1);

		// menampilkan element l1 di index 3
		// Prints element at index 3
		System.out.println("element of l1 at index 3: "+l1.get(3));

		// mengganti element l1 di index 0 dengan nilai 5
		// Replace 0th element with 5
		l1.set(0, 5);
		System.out.println("list l1 after 0th element replaced with 5: "+l1);
	}
}
