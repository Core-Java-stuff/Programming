package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

public class FinalSumOfDigtsTest {

	public static int find(int n1, int n2) {
		List<Integer> list = new ArrayList<>();
		for (; n1 <= n2; n1++) {
			list.add(n1);
		}
		int[] no = toIntArray(list);
		int sum = sumOfArray(no, no.length - 1);
		return sum;
	}

	private static int[] toIntArray(List<Integer> list) {
		int[] ret = new int[list.size()];
		int i = 0;
		for (Integer e : list)
			ret[i++] = e.intValue();
		return ret;
	}

	public static int sumOfArray(int[] a, int n) {

		if (n == 0)
			return a[n];
		else
			return a[n] + sumOfArray(a, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(find(9, 19));
	}

}
