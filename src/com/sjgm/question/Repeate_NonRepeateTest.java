package com.sjgm.question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeate_NonRepeateTest {

	public static Map<Character, Integer> findChar(String text) {
		Map<Character, Integer> dataMap = new HashMap<>();
		for (char key : text.toCharArray()) {
			if (dataMap.containsKey(key)) {
				dataMap.put(key, dataMap.get(key) + 1);
			} else {
				dataMap.put(key, 1);
			}
		}
		return dataMap;
	}

	public static void main(String[] args) {

		Set<Map.Entry<Character, Integer>> set = findChar("tetter").entrySet();
		Iterator<Map.Entry<Character, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> map = itr.next();
			if (map.getValue() > 1) {
				System.out.println("Repeat : " + map.getKey());
			} else {
				System.out.println("Non Repeat : " + map.getKey());
			}
		}
	}
}
