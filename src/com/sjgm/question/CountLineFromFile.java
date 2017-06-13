package com.sjgm.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLineFromFile {
	public static int count(String inputFilePath) throws FileNotFoundException,
			IOException {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				inputFilePath)))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		System.out.println("Total Number of lines in given input file : "
				+ count("input.txt"));
	}
}
