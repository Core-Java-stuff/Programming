package com.demo.split;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class Ft {
	public static String readFile(File file, Charset charset)
			throws IOException {
		return new String(Files.readAllBytes(file.toPath()), charset);
	}

	public static void main(String[] args) throws IOException {
		System.out.println(readFile(new File(
				"C:/Users/basanta.kumar.hota/Desktop/test.txt"), Charset
				.defaultCharset()));
	}
}
