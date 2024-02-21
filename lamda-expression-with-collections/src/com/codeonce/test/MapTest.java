package com.codeonce.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "AKASH");
		map.put("K", "KARAN");
		map.put("Y", "YASH");
		map.put("D", "DATTA");
		map.put("S", "SHUBHAM");
		System.out.println(map); // {A=AKASH, S=SHUBHAM, D=DATTA, Y=YASH, K=KARAN}
	}
}
