package com.codeones.sorting.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListElementSortingTest {
	public static void main(String[] args) {
		List<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("C");
		ll.add("B");
		ll.add("E");
		ll.add("D");
		ll.add("Z");

		System.out.println("BEFORE SORTING: " + ll);

		ll.sort((obj1, obj2) -> obj1.compareTo(obj2));

		System.out.println("AFTER SORTING TO ASCENDING ORDER : " + ll);

		ll.sort((obj1, obj2) -> obj2.compareTo(obj1));

		System.out.println("AFTER SORTING TO DESCENDING ORDER : " + ll);

	}

}
