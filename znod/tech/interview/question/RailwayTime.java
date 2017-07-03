package com.znod.tech.interview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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

	public static List<Integer> getHighestTime(Set<String> set) {
		List<Integer> times = new ArrayList<Integer>();
		for (String s : set) {
			if (!s.startsWith("4")) {
				if (!s.startsWith("3")) {
					times.add(Integer.valueOf(s));
				}
			}
		}
		Collections.sort(times);
		List<String> ts = formatTime(times);
		System.out.println("List of possible Times :" + ts);
		if (ts.size() != 0) {
			System.out.println("HighestTime :"
					+ formater(ts.get(ts.size() - 1)));
		} else {
			System.out.println("Invalid output");
		}
		return times;
	}

	private static List<String> formatTime(List<Integer> times) {
		List<String> ts = new ArrayList<String>();
		for (int i : times) {
			String s = formater(String.valueOf(i));
			if ((Integer.valueOf(s.split(":")[0]) <= 23)
					&& (Integer.valueOf(s.split(":")[1]) <= 60)) {
				ts.add(formater(String.valueOf(i)));
			}
		}
		return ts;
	}

	private static String formater(String s) {
		return new StringBuffer().append(s.substring(0, 2)).append(":")
				.append(s.substring(2, s.length())).toString();

	}

	public static void main(String[] args) {
		String s2 = "3624";
		Set<String> set = permutationFinder(s2);
		getHighestTime(set);

	}
}
