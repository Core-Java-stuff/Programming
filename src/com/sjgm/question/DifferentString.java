package com.sjgm.question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class DifferentString {

	public static void find(String[] array1, String[] array2) {
		List<String> list1 = Arrays.asList(array1);
		List<String> list2 = Arrays.asList(array2);
		Set<String> unCommon = new CopyOnWriteArraySet<>(list1);

		// Approach 1 using java 7
		for (String s1 : list2) {
			if (unCommon.contains(s1)) {
				unCommon.remove(s1);
			}
		}
		System.out.println(unCommon);

		// Approach 2 using java 8

		list2.stream().filter(unCommon::contains)
				.forEach(u -> unCommon.remove(u));
		System.out.println(unCommon);
	}

	public static void main(String[] args) {
		find(new String[] { "avi", "asish", "sasmi", "sasmita" }, new String[] {
				"sasmi", "sasmita" });
	}
}
