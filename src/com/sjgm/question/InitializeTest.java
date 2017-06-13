package com.sjgm.question;

public class InitializeTest {
	public static String getdata() {
		String s = null;
		try {
			s = "Basant";
			return s;
		} catch (Exception e) {

		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(getdata());
	}
}
