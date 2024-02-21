package com.codeones.lambda.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
	public static void main(String[] args) {
		//1. list of numbers
		List<Integer> list = Arrays.asList(20, 10, 30, 15, 25, 40, 35, 50, 5);
		
		//2. list of Strings
		List<String> names = Arrays.asList("AKASH", "KARAN", "DATTA", "SHUBHAM", "PRAFULL");
		
		//SORT: ASC
		
		//AP#1
		List<Integer> sortedList1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("SORTED LIST ASC AP#1 : "+ sortedList1);
		
		//AP#2
		Collections.sort(list);
		System.out.println("SORTED LIST ASC AP#2 : "+ list);
		
		//SORT: DESC
		
		//AP#1
		List<Integer> sortedList2 = list.stream().sorted((num1, num2)->(num1 > num2)?-1:(num1<num2)?1:0).collect(Collectors.toList());
		System.out.println("SORTED LIST DESC AP#1 : "+ sortedList2);
		
		//AP#2
		Collections.sort(list, (num1, num2) -> ( num1 > num2 ) ? -1 : (num1 < num2) ? 1 : 0);
		System.out.println("SORTED LIST DESC AP#2 : "+ list);
		
		System.out.println("-----NAMES-----------------------------------------------------------------");
		
		//SORT STRINGS
		
		//SORT: ASC
		Collections.sort(names);
		System.out.println("SORTED LIST NAMES ASC AP#1 : "+ names);
		
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("SORTED LIST NAMES ASC AP#2 : "+ sortedNames);
		
		//SORT: DESC
		Collections.sort(names, (name1, name2) -> name2.compareTo(name1));
		System.out.println("SORTED LIST NAMES DESC AP#1 : "+ names);
		
		List<String> sortedNames2 = names.stream().sorted((name1, name2) -> name2.compareTo(name1)).collect(Collectors.toList());
		System.out.println("SORTED LIST NAMES DESC AP#2 : "+ sortedNames2);
	}
}
