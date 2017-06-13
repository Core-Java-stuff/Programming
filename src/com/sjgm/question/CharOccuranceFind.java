package com.sjgm.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CharOccuranceFind {
	// Approach : 1
	@SuppressWarnings("resource")
	public static Map<String, Integer> findOccurance(String filePath)
			throws IOException {
		Map<String, Integer> charMap = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader(
				new File(filePath)));
		String line = null;
		while ((line = br.readLine()) != null) {
			line = line.replace("\\s", "");
			// if u want to count word then use
			/* line = line.replace("\\s", " "); */
			String[] s = line.split("");
			for (String value : s) {
				if (charMap.containsKey(value)) {
					charMap.put(value, (charMap.get(value) + 1));
				} else {
					charMap.put(value, 1);
				}
			}
		}
		return charMap;
	}

	// Approach : 2
	@SuppressWarnings("resource")
	public static Map<Character, Integer> findOccuranceUsingFrequency(
			String filePath) throws IOException {
		Map<Character, Integer> charMap = null;
		List<Character> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(
				new File(filePath)));
		String line = null;
		while ((line = br.readLine()) != null) {
			String data = line.replace("\\s", "");
			char[] ch = data.toCharArray();
			for (char c : ch) {
				list.add(c);
			}
			charMap = getCount(list);
		}
		return charMap;
	}

	public static Map<Character, Integer> getCount(List<Character> list) {
		Map<Character, Integer> charMap = new HashMap<>();
		Set<Character> set = new TreeSet<>(list);
		for (char ch : set) {
			int frequency = Collections.frequency(list, ch);
			if (frequency >= 1) {
				charMap.put(ch, frequency);
			}

		}
		return charMap;
	}

	public static void main(String[] args) {
		try {
			System.out.println(findOccurance("employee.txt"));
			System.out.println(findOccuranceUsingFrequency("employee.txt"));
		} catch (IOException e) {
			System.out.println("Given File Not Found");
			e.printStackTrace();
		}
	}
}
