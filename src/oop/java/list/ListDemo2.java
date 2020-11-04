package oop.java.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	// creating ArrayList
	List<String> al = new ArrayList<>(); 
	
	// add ArrayList elements
	void addToList() {
		al.add("S1"); 
        al.add("UNS"); 
        
        // menambahkan element di index 1
        al.add(1, "Informatika");
        
        // print ArrayList
        System.out.println(al);
	}
	
	void changeListElement() {
		// print ArrayList sebelum diubah
		System.out.println("Initial ArrayList " + al);
		
		// ubah element index 2
		al.set(2, "Universitas Sebelas Maret");
		
		// print ArrayList setelah diubah
		System.out.println("Updated ArrayList " + al); 
	}
	
	public static void main(String[] args) {
		ListDemo2 ld2 = new ListDemo2();
		ld2.addToList();
		ld2.changeListElement();
	}
}
