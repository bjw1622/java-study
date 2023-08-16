package chapter04;

import java.util.Calendar;

// class에 final은 상속 금지
public class CalendarTest {

	// 오버라이딩 금지
	public final void m() {

	}

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		// 상수 선언
		final int i = 10;
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11); // 12월(month - 1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2022, 10, 26);
		cal.add(Calendar.DATE, 100);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0~11, +1
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int hours = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);

		System.out.println((year) + "/" + (month + 1) + "/" + (date + " ") + DAYS[day - 1] + "요일 " + hours + ":"
				+ minutes + ":" + seconds);

	}
}
