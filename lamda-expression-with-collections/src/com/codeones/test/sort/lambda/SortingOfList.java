package com.codeones.test.sort.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOfList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		System.out.println("Before Sorting : " + list); // Before Sorting : [20, 10, 40, 30, 50]

		Collections.sort(list);
		System.out.println("After Sorting : " + list); // After Sorting : [10, 20, 30, 40, 50]

		Collections.sort(list, (i1, i2) -> i1 > i2 ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("Customized Sorting : "+ list); //Customized Sorting : [50, 40, 30, 20, 10]
	}

}
