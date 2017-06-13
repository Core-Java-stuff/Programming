package com.interview.programming.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author basanta.kumar.hota
 * 
 *         Q.write a program if give the numbers the output will be generated in
 *         the following way int number[]={80,45,65,80,45,45}; 
 *         output: 80 2 
 *                 45 3
 *                 65 1
 *
 */
public class FindNoOfDuplicates {

	public static void findUsingJava7(Integer[] no) {
		List<Integer> list = Arrays.asList(no);
		Set<Integer> set = new HashSet<>(list);
		for (int i : set) {
			int repeat = Collections.frequency(list, i);
			if (repeat >= 1) {
				System.out.println(i + " " + repeat);
			}
		}
	}

	public static void findUsingJava8(Integer[] no) {
		List<Integer> numbers = Arrays.asList(no);
		numbers.stream()
				.filter(i -> Collections.frequency(numbers, i) >= 1)
				.collect(Collectors.toSet())
				.forEach(
						i -> System.out.println(i + "  "
								+ Collections.frequency(numbers, i)));
	}

	public static void main(String[] args) {
		findUsingJava7(new Integer[] { 80, 45, 65, 80, 45, 45 });
		findUsingJava8(new Integer[] { 80, 45, 65, 80, 45, 45 });
	}
}
