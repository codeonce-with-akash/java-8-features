package com.codeonce.test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.codeonce.comparator.MyComparator;

public class ListAscDescSortTest {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(30);
		i.add(40);
		i.add(20);
		i.add(60);
		i.add(50);
		System.out.println("Before Sorting: " + i); // Before Sorting: [10, 30, 40, 20, 60, 50]

		// Ascending Sorting Order
		Collections.sort(i);
		System.out.println("Ascending Order: " + i); // Ascending Order: [10, 20, 30, 40, 50, 60]

		// Descending Sorting Order
		Collections.sort(i, new MyComparator());
		System.out.print("Descending Order: " + i); // Descending Order: [60, 50, 40, 30, 20, 10]
	}
}
