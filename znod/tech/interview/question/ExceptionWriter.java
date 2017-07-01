package com.znod.tech.interview.question;

import java.io.FileNotFoundException;

public class ExceptionWriter {

	public void doSomething(int no) throws FileNotFoundException {
		if (no <= 10) {
			System.out.println(MyCustomException.getInstance().printException(
					"Value can't be less than 10"));
		} else {
			System.out.println("No Exception");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionWriter writer = new ExceptionWriter();
		writer.doSomething(5);
	}
}
