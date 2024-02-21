package com.codeones.lambda.basic;

public class Test {
	
	public static void main(String[] args) {
		Interf i = (a, b) -> a+b;
		System.out.println("SUM: "+ i.add(10, 20));
	}
}
