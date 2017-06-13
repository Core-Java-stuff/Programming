package com.demo.split;

public class SplitSentence {
	public static void main(String[] args) {

		String s1 = "Get me status of all the invoices under Supplier - B&E";
		s1.replaceAll("\\s", "-");
		int count = 0;
		for (char ch : s1.toCharArray()) {
			if (ch == '-') {
				count++;
			}
		}
		System.out.println(s1.split("-")[count]);

	}
}
