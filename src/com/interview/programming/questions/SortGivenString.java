package com.interview.programming.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author basanta.kumar.hota
 * 
 *         Q.write a program to arrange the string in sorting order if given
 *         string "ranjith roopa vaman prashanth"
 *
 */
public class SortGivenString {

	public static void sortByusingJava7(String senetence) {
		List<String> list = Arrays.asList(senetence.split(" "));
		Collections.sort(list);
		System.out.println(list);
	}

	public static void sortByusingJava8(String senetence) {
		Stream.of(senetence.split(" ")).sorted().forEach(System.out::println);
	}

	public static void main(String[] args) {
		sortByusingJava7("ranjith roopa vaman prashanth");
		sortByusingJava8("ranjith roopa vaman prashanth");
	}
}
