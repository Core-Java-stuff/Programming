package com.znod.tech.interview.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static MyCustomException myCustomException;

	private MyCustomException() {

	}

	public String printException(String message) throws FileNotFoundException {
		try (PrintWriter pw = new PrintWriter(new File("dummyFile.txt"));) {
			pw.write(message);
		}
		return "Exception Logged";
	}

	public synchronized static MyCustomException getInstance() {
		if (myCustomException == null) {
			return new MyCustomException();
		} else {
			return myCustomException;
		}
	}

}
