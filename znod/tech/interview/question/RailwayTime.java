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

	public static List<Integer> getHighestTime(Set<String> set)
			throws IllegalAccessException {
		List<Integer> times = new ArrayList<Integer>();
		for (String s : set) {
			if (!s.startsWith("4")) {
				if (!s.startsWith("3")) {
					times.add(Integer.valueOf(s));
				}
			} else {
				throw new IllegalAccessException("Invalid Input");
			}
		}
		Collections.sort(times);
		List<String> ts = formatTime(times);
		System.out.println("List of possible Times :" + ts);
		return times;
	}

	private static List<String> formatTime(List<Integer> times) {
		List<String> ts = new ArrayList<String>();
		String s = "";
		for (int i : times) {
			s = String.valueOf(i);
			ts.add(formater(s));
		}
		return ts;
	}

	private static String formater(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(0, 2)).append(":")
				.append(s.substring(2, s.length()));
		return sb.toString();
	}

	public static void main(String[] args) throws IllegalAccessException {
		String s2 = "1234";
		Set<String> set = permutationFinder(s2);
		List<Integer> times = getHighestTime(set);
		System.out.println("HighestTime :"
				+ formater(String.valueOf(times.get(times.size() - 1))));
	}
}
