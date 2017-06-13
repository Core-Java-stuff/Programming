package com.interview.programming.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author basanta.kumar.hota
 * 
 *         Q.Read the date from input.txt file and write the data into
 *         output.txt file but skip the fifth line.
 *
 */
public class FileReadWrite {

	public static void readAndWrite(String inputFilePath, String outputFilePath)
			throws IOException {
		try (PrintWriter pw = new PrintWriter(new File(outputFilePath));
				BufferedReader br = new BufferedReader(new FileReader(new File(
						inputFilePath)))) {
			String removedLine = "";
			String line = null;
			int count = 0;
			while ((line = br.readLine()) != null) {
				count++;
				if (count == 5) {
					removedLine = line;
				}
				if (line.equals(removedLine)) {
					line.replace(line, "");
				} else {
					pw.write(line + "\n");
				}
			}
		}
		System.out.println("Read&Write Success..");
	}

	public static void main(String[] args) {
		try {
			readAndWrite("input.txt", "output.txt");
		} catch (IOException e) {
			System.out.println("Exception : " + e.getLocalizedMessage());
		}
	}
}
