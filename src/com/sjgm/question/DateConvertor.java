package com.sjgm.question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yy");

	public static String getDF() throws ParseException {
		StringBuilder buf = new StringBuilder();
		String value = "1170517".substring(1);
		for (int i = 0; i < value.length(); i += 2) {
			buf.append(value.substring(i, i + 2));
			buf.append("-");
		}
		String textDate = buf.toString().substring(0, buf.length() - 1);
		System.out.println(textDate);
		Date actualDate = null;
		try {
			actualDate = sdf1.parse(textDate);
		} catch (ParseException pe) {
			System.out.println(pe.toString());
		}
		System.out.println("2nd : " + sdf2.format(actualDate));
		Date d = sdf2.parse(sdf2.format(actualDate));
		return sdf3.format(d);
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(getDF());

	}
}