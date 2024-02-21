package com.codeonce.test.sort;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.codeonce.comparator.MyComparator;

public class MapAscDescSortTest {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<>(new MyComparator());
		treeMap.put(101, "A");
		treeMap.put(103, "B");
		treeMap.put(105, "C");
		treeMap.put(104, "D");
		treeMap.put(106, "E");
		treeMap.put(102, "F");
		System.out.println(treeMap); // { 106=E, 105=C, 104=D, 103=B, 102=F, 101=A }
	}

}
