package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();

		printDate01(now);
		printDate02(now);
	}

	private static void printDate01(Date d) {
		// 2023-08-11 15:00:00
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}

	private static void printDate02(Date d) {
		int year = d.getYear();

		int month = d.getMonth();

		int date = d.getDate();

		int hours = d.getHours();

		int minutes = d.getMinutes();

		int seconds = d.getSeconds();

		System.out.println(
				(year + 1900) + "/" + (month + 1) + "/" + (date + " ") + hours + ":" + minutes + ":" + seconds);

	}

}
