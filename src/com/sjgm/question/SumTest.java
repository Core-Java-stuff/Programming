package com.sjgm.question;

import java.util.Scanner;

public class SumTest {
	int sum = 0, j = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter all the elements you want:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		SumTest obj = new SumTest();
		int x = obj.add(a, a.length, 0);
		System.out.println("Sum:" + x);
	}

	int add(int a[], int n, int i) {
		if (i < n) {
			return a[i] + add(a, n, ++i);
		} else {
			return 0;
		}
	}
}
