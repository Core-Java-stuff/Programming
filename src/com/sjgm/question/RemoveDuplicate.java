package com.sjgm.question;

import java.util.Arrays;

public class RemoveDuplicate {
	// using java 7
	public static String removeDuplicate1(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			}
		}
		return result;
	}

	// using java 8
	public static void removeDuplicate2(String s) {
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}

	public static void main(String[] args) {
		removeDuplicate2("employee");
		System.out.println(removeDuplicate1("employee"));
	}
}
