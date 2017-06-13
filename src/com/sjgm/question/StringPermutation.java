package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
	// Using Recursion
	public static void permutationWithRecursion(String str) {
		getPermutation("", str);
	}

	private static void getPermutation(String value, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(value + ",");
		} else {
			for (int i = 0; i < n; i++)
				getPermutation(value + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	public static void permutationWithoutRecursion(String value) {
		List<String> results = new ArrayList<String>();
		char[] ch = value.toCharArray();
		results.add(new String("" + ch[0]));
		for (int j = 1; j < ch.length; j++) {
			char c = ch[j];
			for (int i = results.size() - 1; i >= 0; i--) {
				String strValue = results.remove(i);
				for (int l = 0; l <= strValue.length(); l++) {
					results.add(strValue.substring(0, l) + c
							+ strValue.substring(l));
				}
			}
		}
		System.out.println(results);
	}

	public static void main(String[] args) {
		permutationWithRecursion(("SJGM"));
		System.out.println();
		permutationWithoutRecursion("Basanta");
	}
}
