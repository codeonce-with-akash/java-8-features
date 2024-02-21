package com.codeones.sorting.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.codeones.sorting.collection.comp.MyComparator;

public class ListElementSortingTest {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(15);
		l.add(20);
		
		// Collections.sort(l);
		
		// List<Integer> sortedList = l.stream().sorted((obj1, obj2) -> obj2.compareTo(obj1)).collect(Collectors.toList());
		
		/*
		List<Integer> sortedList = l.stream()
									.sorted((obj1, obj2) -> (obj1 < obj2) ? -1 : (obj1 > obj2) ? 1 : 0)
									.collect(Collectors.toList());
		*/
		
		//l.sort(new MyComparator());
		
		//l.sort( (obj1, obj2)-> (obj1<obj2)?1:(obj1>obj2)?-1:0 );
		//l.sort( (obj1, obj2)-> obj1.compareTo(obj2) );
		
		System.out.println(l);
	}
}
