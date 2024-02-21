package com.codeonce.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("D");
		set.add("C");
		set.add("E");
		set.add("G");
		set.add("A");
		set.add("H");
		System.out.println(set); // [A, C, D, E, G, H]
	}

}
