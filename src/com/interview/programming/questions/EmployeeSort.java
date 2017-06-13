package com.interview.programming.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author basanta.kumar.hota
 * 
 *         Q. Create a list of 10 employees with name,id,sal as parameters. Sort
 *         the list depending on the employee's salary.
 *
 */
public class EmployeeSort {

	public static List<Employee> sortEmployeeUsingJava7(List<Employee> employees) {
		Collections.sort(employees);
		return employees;
	}

	public static List<Employee> sortEmployeeUsingJava8(List<Employee> employees) {
		employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.salary - e2.salary);
			}
		});
		return employees;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(26, "abc", 12345);
		Employee e2 = new Employee(98, "fvs", 1200);
		Employee e3 = new Employee(36, "ejf", 900);
		Employee e4 = new Employee(12, "wkw", 1600);
		Employee e5 = new Employee(37, "fjd", 1199);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println("Using Java7 :" + "\n"
				+ sortEmployeeUsingJava7(employees));

		System.out.println("Using Java8 :" + "\n"
				+ sortEmployeeUsingJava8(employees));
	}

}
