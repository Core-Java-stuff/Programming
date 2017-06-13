package com.interview.programming.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author basanta.kumar.hota
 * 
 *         Q.1.write a program to read the sentence from the user and if
 *         sentence is like(Roopa mam taught java very well vaman sir taught
 *         communications classes very well taught very very) then generate
 *         output in the following way 
 *         output: 
 *                 taught 3 
 *                 very 4 
 *                 well 2
 *
 */
public class CountWordFromSentence {

	public static void countWordUsingJava7(String sentence) {
		Map<String, Integer> wordMap = new HashMap<>();
		String[] strArray = sentence.split(" ");
		for (String s : strArray) {
			if (wordMap.containsKey(s)) {
				wordMap.put(s, (wordMap.get(s) + 1));
			} else {
				wordMap.put(s, 1);
			}
		}
		System.out.println(wordMap);
	}

	public static void countWordUsingJava8(String sentence) {
		List<String> list = Stream.of(sentence.split(" ")).collect(
				Collectors.toList());
		list.stream()
				.filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet())
				.forEach(
						i -> System.out.println(i + "-"
								+ Collections.frequency(list, i)));
	}

	public static void main(String[] args) {
		countWordUsingJava7("Roopa mam taught java very well vaman sir taught communications classes very well taught very very");
		countWordUsingJava8("Roopa mam taught java very well vaman sir taught communications classes very well taught very very");
	}
}
