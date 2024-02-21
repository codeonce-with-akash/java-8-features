package com.codeones.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiTest {
	public static void main(String[] args) {
		List<Integer> numbersAsList = Arrays.asList(1, 5, 2, 9, 12, 15, 19, 22, 25, 28, 31);
		
		List<Integer> duplicateNumbersAsList = Arrays.asList(1, 3, 5, 7, 1, 3, 5, 9, 11, 13, 9, 3, 5);
		
		List<List<Integer>> complexList = Arrays.asList(Arrays.asList(10, 20, 30), Arrays.asList(40, 50, 60), Arrays.asList(70, 80, 90));
		
		// original list
		System.out.println("Original List : [numbersAsList] "+ numbersAsList);
		
		//1. find even number
		List<Integer> evenNumbersAsList = numbersAsList.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers : "+evenNumbersAsList);
		
		//2. find greatest even number from even 
		Integer greatestEvenNum = evenNumbersAsList.stream().sorted((num1, num2) -> (num1 > num2) ? -1 : (num1 < num2) ? 1 : 0).collect(Collectors.toList()).get(0);
		System.out.println("Greatest Even Number : "+greatestEvenNum);
		
		//3. add value 10 into every element of even numbers list
		List<Integer> evenNumberPlus10 = numbersAsList.stream().filter((num) -> num % 2 == 0).map((num) -> num+10).collect(Collectors.toList());
		System.out.println("Even Numbers Plus 10 : "+evenNumberPlus10);
		
		//4. find distinct value from the given list
		List<Integer> distinctNumbersAsList = duplicateNumbersAsList.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Numbers From List : "+distinctNumbersAsList);
		
		//5. find minimum value from the numbersAsList 
		Optional<Integer> minOpt = numbersAsList.stream().min((num1, num2) -> num1.compareTo(num2));
		if (minOpt.isPresent()) 
			System.out.println("Minimum Value From numbersAsList : "+ minOpt.get());
		
		//6. find maximum value from the numbersAsList
		Optional<Integer> maxOpt = numbersAsList.stream().max((num1, num2) -> num1.compareTo(num2));
		if(maxOpt.isPresent())
			System.out.println("Maximum Value From numbersAsList : "+ maxOpt.get());
		
		//7. count the element of the numbersAsList
		long count = numbersAsList.stream().count();
		System.out.println("Numbers of elements are present in numbersAsList : "+count);

		//8. convert list into array
		Object[] array = numbersAsList.stream().toArray();
		for(Object arr : array) {
			System.out.println(arr);
		}
		
		//9. limit
		List<Integer> numbersWithLimitAsList = numbersAsList.stream().limit(5).collect(Collectors.toList());
		System.out.println(numbersWithLimitAsList);
		
		//10. flatMap method
		List<Integer> complexListWithFilterAndMap= complexList.stream().flatMap(list -> list.stream()).filter(num -> num % 2 == 0).map(num -> num + 10).collect(Collectors.toList());
		System.out.println("flatMap() Method : "+complexListWithFilterAndMap);
	}
}
