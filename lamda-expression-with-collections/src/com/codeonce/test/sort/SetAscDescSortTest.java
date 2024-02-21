package com.codeonce.test.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.codeonce.comparator.MyComparator;

public class SetAscDescSortTest {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		Set<Integer> t = new TreeSet<>();
		Set<Integer> ct = new TreeSet<>(new MyComparator());
		
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(50);
		s.add(40);
		s.add(60);
		System.out.println("Before Sorting: "+s); //Before Sorting: [50, 20, 40, 10, 60, 30]
		
		
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(40);
		t.add(60);
		t.add(50);
		System.out.println("Ascending Order: "+t); //Ascending Order: [10, 20, 30, 40, 50, 60]
		
		ct.add(10);
		ct.add(30);
		ct.add(20);
		ct.add(40);
		ct.add(50);
		ct.add(60);
		System.out.println("Descending Order: "+ct); //Descending Order: [60, 50, 40, 30, 20, 10]
		
	}

}
