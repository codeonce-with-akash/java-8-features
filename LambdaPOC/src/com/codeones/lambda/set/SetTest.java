package com.codeones.lambda.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(15);
		numbers.add(10);
		numbers.add(25);
		numbers.add(20);
		numbers.add(35);
		numbers.add(30);
		
		System.out.println("NUMBERS ARE : "+numbers);
		
		numbers.stream().sorted((num1, num2) -> num1 > num2 ? 1 : (num1 < num2) ? -1 : 0).forEach(System.out::println);
		
		Set<Integer> nums = new TreeSet<>(numbers);
		System.out.println("NUMBERS WITH TREESET ARE : "+ nums);
		
		nums.stream().sorted((num1, num2) -> num1 > num2 ? -1 : (num1 < num2) ? 1 : 0).forEach(System.out::println);;
	}
}
