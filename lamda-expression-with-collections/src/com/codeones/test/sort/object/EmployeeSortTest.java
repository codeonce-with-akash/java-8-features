package com.codeones.test.sort.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(103, "C"));
		list.add(new Employee(101, "B"));
		list.add(new Employee(102, "A"));
		list.add(new Employee(104, "D"));
		System.out.println("Befor Sort: " + list);

		Collections.sort(list, (e1, e2) -> (e1.getEno() > e2.getEno()) ? -1 : (e1.getEno() < e2.getEno()) ? 1 : 0);
		System.out.println("After Sort Based On ENO : " + list);

		
		// Sort by name.
		// Approach#1
		Comparator<Employee> c = (e1, e2) -> e1.getEname().compareTo(e2.getEname());
		list.stream().sorted(c).forEach(System.out::println);

		System.out.println("-----------------------");

		// Approach#2
		list.stream().sorted(Comparator.comparing(Employee::getEname)).forEach(System.out::println);

		System.out.println("-----------------------");

		// Approach#3
		list.sort(Comparator.comparing(Employee::getEname));
		list.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		// Approach#4
		list.sort((e1, e2) -> e1.getEname().compareTo(e2.getEname()));
		list.forEach(System.out::println);
	}

}
