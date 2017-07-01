package com.znod.tech.interview.question;

import java.util.HashSet;
import java.util.Set;

public class RailwayTime {

	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<String>();
		if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	public static void main(String[] args) {

		String s2 = "1234";
		Set<String> set = permutationFinder(s2);
		for (String s : set) {
			if (!s.startsWith("4")) {
				if (!s.startsWith("3")) {
					System.out.println(s);
				}
			}
		}
	}
}