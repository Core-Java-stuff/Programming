package com.interview.programming.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author basanta.kumar.hota
 * 
 *         Q. 2.write a program to read 5 characters from user and print the
 *         characters in reverse order.
 *
 */
public class ReadCharacterAndReverse {

	private static List<String> list = new ArrayList<>();;

	public static void reverseUsingJava7(Scanner scn) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter char : " + i);
			String ch = scn.nextLine();
			list.add(ch);
		}
		Collections.reverse(list);
		System.out.println(list);
	}

	public static List<String> reverseUsingJava8() {
		return list.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		reverseUsingJava7(new Scanner(System.in));
		System.out.println(reverseUsingJava8());
	}
}
