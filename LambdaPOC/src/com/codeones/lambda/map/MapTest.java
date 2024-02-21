package com.codeones.lambda.map;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		/**
		 * TreeMap provides default natural sorting order based on KEYS 
		 */
		//Map<Integer, String> students = new TreeMap<>((num1, num2) -> num1 > num2 ? -1 : (num1 < num2) ? 1 : 0);
		Map<Integer, String> students = new TreeMap<>((num1, num2) -> num2.compareTo(num1));
		students.put(103, "Datta");
		students.put(101, "Akash");
		students.put(104, "Karan");
		students.put(102, "Shubham");
		students.put(106, "Prafull");
		students.put(105, "Sandesh");
		System.out.println(students);
		
		//Sort the map based on values
		students.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
