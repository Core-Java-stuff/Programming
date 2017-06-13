package com.sjgm.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Frequency {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		Set<String> s = new HashSet<>(list);
		for(String sdata:s){
		int frequency=Collections.frequency(list, sdata);
			if(frequency>1){
				System.out.println(sdata+" : "+frequency);
			}
		}
	}
}
