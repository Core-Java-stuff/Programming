package com.sjgm.question;

public class SwitchCaseTest {
	public static void getGrade(int mark) {
		int i=(int) mark / 10;
		System.out.println(i);
		switch (i) {
		case 1:
			System.out.println("10-19");
			break;
		case 2:
			System.out.println("20-29");
			break;
		case 3:
			System.out.println("30-39");
			break;
		case 4:
			System.out.println("40-49");
			break;
		case 5:
			System.out.println("50-45");
			break;
		case 6:
			System.out.println("60-69");
			break;
		case 7:
			System.out.println("70-79");
			break;
		case 8:
			System.out.println("80-89");
			break;
		case 9:
			System.out.println("40-49");
			break;
		default:
			break;

		}
	}

	public static void main(String[] args) {
		getGrade(72);
	}
}
