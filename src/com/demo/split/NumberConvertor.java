package com.demo.split;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberConvertor {
	public static void main(String[] args) {
		long l = 100000;
		Locale locale = new Locale("en", "IN");

		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String no = numberFormat.format(l);
		System.out.println(no);
		if(no.endsWith("")){
			throw new IllegalAccessError("gdfhsgf");
		}
	}
}
