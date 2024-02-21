package com.codeones.test.sort.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingOfMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(20, "C");
		map.put(10, "A");
		map.put(30, "D");
		map.put(40, "B");
		map.put(50, "E");
		System.out.println("Before Sorting : " + map);

		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(20, "C");
		treeMap.put(10, "A");
		treeMap.put(30, "D");
		System.out.println("TreeMap Natural Sorting : " + treeMap); // TreeMap Natural Sorting : { 10=A, 20=C, 30=D }

		Map<Integer, String> descTreeMap = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		descTreeMap.put(20, "C");
		descTreeMap.put(10, "A");
		descTreeMap.put(30, "D");
		System.out.println("Customized Sorting : " + descTreeMap); // Customized Sorting : {30=D, 20=C, 10=A}
	}

}
