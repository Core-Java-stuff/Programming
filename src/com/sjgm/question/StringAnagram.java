package com.sjgm.question;

import java.util.Arrays;

public class StringAnagram {

	public static boolean checkAnagram(String strValue1, String strValue2) {
		boolean isAnagaram = false;
		String s1 = strValue1.replace("\\s", "");
		String s2 = strValue2.replace("\\s", "");
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				isAnagaram = true;
			}
		}
		return isAnagaram;
	}

	public static void main(String[] args) {
		System.out.println(checkAnagram("madam", "madam"));
	}
}
