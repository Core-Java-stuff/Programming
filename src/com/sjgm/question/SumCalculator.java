package com.sjgm.question;

public class SumCalculator {
	public static int sumOfDigitsFrom1ToN(int i, int n) {
		int result = 0;
		for (int x = i; x <= n; x++)
			result += sumOfDigits(x);

		return result;
	}

	public static int sumOfDigits(int x) {
		int sum = 0;
		while (x != 0) {
			sum += x % 10;
			if (x % 10 == 0) {
				sum = sum + x;
			}
			x = x / 10;
			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigitsFrom1ToN(5, 11));
	}
}
