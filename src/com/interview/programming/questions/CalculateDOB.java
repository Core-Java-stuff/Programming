package com.interview.programming.questions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author basanta.kumar.hota
 *
 *         Q. Write a simple java class to calculate the age of a person where
 *         input is date of birth.
 */
public class CalculateDOB {
	public static int getDOB(String dateOfBirth) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int days = 0;
		int avgDate = 1;
		try {
			Date startDate = sdf.parse(dateOfBirth);
			Date endDate = sdf.parse(sdf.format(new Date()));
			long diff = endDate.getTime() - startDate.getTime();
			days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			days = days + avgDate;
		} catch (Exception e) {
		}
		return days;
	}

	public static void main(String[] args) {
		int days = getDOB("1993-02-15");
		System.out.println((days / 365) + " year");
	}
}
