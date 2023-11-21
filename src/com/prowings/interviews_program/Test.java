package com.prowings.interviews_program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();

		list.add(new Employee(10, "Shree", 24, 50000.0, "Developer"));
		list.add(new Employee(20, "Komal", 26, 60000.0, "DevOps"));
		list.add(new Employee(30, "Priyanka", 27, 70000.0, "Electrical"));
		list.add(new Employee(40, "Vaibhav", 28, 75000.0, "Manager"));
		list.add(new Employee(50, "Marish", 25, 65000.0, "Developer"));

		Optional<Employee> max = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(max);

//		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println); 

	     list.stream().sorted(Comparator.comparing(Employee::getDept).thenComparing(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);

//		list.stream().sorted((e1, e2) -> e1.getAge().compareTo(e2.getAge())
//				+ e1.getName().compareTo(e2.getName()) + e1.getSalary().compareTo(e2.getSalary()))
//				.collect(Collectors.toList());

		// System.out.println(collect);

		Double collect2 = list.stream().collect(Collectors.averagingInt(Employee::getAge));
//		System.out.println(collect2);

		Double collect3 = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//		System.out.println(collect3);

		list.stream().filter(e -> e.age > 25).forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * 0.10)));
//		System.out.println(list);

	}

}
