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

	void iterateListELement() {
		// Using the Get method and the
		// for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : al)
			System.out.print(str + " ");
	}

	void removingListElement() {
		// print list awal
		System.out.println("Initial ArrayList " + al);

		// hapus list element index 1
		al.remove(1);

		// print list
		System.out.println("After the 1st Index Removal " + al);

		// hapus element S1
		al.remove("S1");

		// print list
		System.out.println("After the Object Removal " + al);
	}

	public static void main(String[] args) {
		ListDemo2 ld2 = new ListDemo2();
		ld2.addToList();
		ld2.changeListElement();
		ld2.iterateListELement();
		ld2.removingListElement();
	}
}
