package com.demo.split;

public class SplitString {

	public static String spliter(String data) {
		int count = 0;

		char[] ch = data.toCharArray();
		for (char c : ch) {
			if (c == '.') {
				count++;
			}
		}
		return data.split("\\.")[count];
	}

	public static void main(String[] args) {
		System.out.println(spliter("com.dugu.abc.pqr.a.b.add(int a,int b)"));
		
		String str="com.dugu.abc.pqr.a.b.add(int a,int b)";
		String res=str.substring(str.lastIndexOf(".")+1);
		System.out.println(res);
	}
}
