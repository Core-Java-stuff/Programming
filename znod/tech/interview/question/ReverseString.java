package com.znod.tech.interview.question;

public class ReverseString {

	public static String print(String input) {
		StringBuffer sb = new StringBuffer();
		String revWrd = "";
		for (String s : input.split(" ")) {
			revWrd = reverse(s);
			sb.append(revWrd).append(" ");
		}

		return sb.toString();
	}

	public static String reverse(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(print("i am String!"));
	}
}
