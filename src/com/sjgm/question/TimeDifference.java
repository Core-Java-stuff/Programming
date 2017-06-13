package com.sjgm.question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDifference {
	private static final String FORMAT = "%02d:%02d:%02d";
	private static SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

	public static String getTotalWorkHour(String enterTime, String leaveTime)
			throws ParseException {
		String totalWorHour = "";
		Date start = format.parse(enterTime);
		Date end = format.parse(leaveTime);
		long millis = end.getTime() - start.getTime();
		totalWorHour = String.format(
				FORMAT,
				TimeUnit.MILLISECONDS.toHours(millis),
				TimeUnit.MILLISECONDS.toMinutes(millis)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
								.toHours(millis)),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
								.toMinutes(millis)));
		return totalWorHour;
	}

	public static void main(String[] args) throws ParseException {
		String time1 = "07:00:00";
		String time2 = "08:10:00";
		System.out.println("Total time count : "
				+ getTotalWorkHour(time1, time2));
	}
}
