package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class DisSimilarExtractService {

	public static void find(String[] array1, String[] array2) {
		List<String> list1 = new ArrayList<>(Arrays.asList(array1));
		List<String> list2 = new ArrayList<>(Arrays.asList(array2));
		list1.addAll(list2);
		// in java 8
		list1.stream().filter(obj -> Collections.frequency(list1, obj) == 1)
				.collect(Collectors.toList()).forEach(System.out::println);
		// in java 7

		Set<String> set = new HashSet<>(list1);
		for (String s : set) {
			int count = Collections.frequency(list1, s);
			if (count == 1) {
				System.out.println(s);
			}
		}

	}

	public static void find3(String[] array1, String[] array2) {
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
		find(new String[] { "a", "b", "c", "r" }, new String[] { "a", "b", "d",
				"m" });

	}
}
