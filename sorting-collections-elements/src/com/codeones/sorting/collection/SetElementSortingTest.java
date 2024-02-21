package com.codeones.sorting.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetElementSortingTest {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(20);
		s.add(7);
		s.add(7);

		System.out.println("BEFORE SORTING OREDER : " + s);

		List<Integer> list = s.stream().sorted((obj1, obj2) -> obj1.compareTo(obj2)).collect(Collectors.toList());
		
		System.out.println("AFTER SORTING OREDER : " + list);
	}
}
