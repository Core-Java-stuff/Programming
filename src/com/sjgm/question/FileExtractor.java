package com.sjgm.question;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileExtractor {

	public static void find(String filePath1, String filePath2) {
		boolean flag = false;
		List<String> commonFiles = new ArrayList<>();
		List<String> unCommonFiles = new ArrayList<>();
		File file1 = new File(filePath1);
		String[] file1Data = file1.list();
		File file2 = new File(filePath2);
		String[] file2Data = file2.list();
		for (String data1 : file1Data) {
			for (String data2 : file2Data) {
				if (data1.equalsIgnoreCase(data2)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				unCommonFiles.add(data1);
			} else {
				flag = false;
				commonFiles.add(data1);
			}
		}
		System.out.println("COMMON : " + commonFiles);
		System.out.println("UNCOMMON : " + unCommonFiles);
	}

	public static void findJava8(String filePath1, String filePath2) {
		List<String> commonFiles = new ArrayList<>();
		List<String> unCommonFiles = new ArrayList<>();
		File file1 = new File(filePath1);
		String[] file1Data = file1.list();
		File file2 = new File(filePath2);
		String[] file2Data = file2.list();
		List<String> list1 = Arrays.asList(file1Data);
		List<String> list2 = Arrays.asList(file2Data);

		commonFiles = list1.stream().filter(list2::contains)
				.collect(Collectors.toList());
		unCommonFiles = list1.stream().filter(x -> !list2.contains(x))
				.collect(Collectors.toList());

		System.out.println("COMMON : " + commonFiles);
		System.out.println("UNCOMMON : " + unCommonFiles);
	}

	public static void main(String[] args) {

		/*
		 * find("C:/Users/basanta.kumar.hota/Desktop/Folder1",
		 * "C:/Users/basanta.kumar.hota/Desktop/Folder2");
		 */
		findJava8("C:/Users/basanta.kumar.hota/Desktop/Folder1",
				"C:/Users/basanta.kumar.hota/Desktop/Folder2");

	}
}
