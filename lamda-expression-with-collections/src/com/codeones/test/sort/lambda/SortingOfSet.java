package com.codeones.test.sort.lambda;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingOfSet {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(20);
		s.add(10);
		s.add(40);
		s.add(30);
		System.out.println("Insertion Order Not Preserved : " + s); // Insertion Order Not Preserved : [50, 20, 40, 10]

		Set<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(50);
		System.out.println("Natural Sorting : " + ts); // Natural Sorting : [10, 20, 30, 40, 50]

		Set<Integer> tsc = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		tsc.add(20);
		tsc.add(10);
		tsc.add(40);
		tsc.add(30);
		tsc.add(50);
		System.out.println("Customized Sorting : " + tsc); // Customized Sorting : [50, 40, 30, 20, 10]

	}
}
