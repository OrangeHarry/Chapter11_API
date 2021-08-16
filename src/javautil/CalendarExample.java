package javautil;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //Calendar가 추상클래스라서 new로 생성을 할 수가 없거든 그래서 정적메소드인 getInstance()메소드를 이용해서 하위객체를 얻어옴

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch (week) {
		case Calendar.MONDAY:
			strweek = "월";
			break;
		case Calendar.TUESDAY:
			strweek = "화";
			break;
		case Calendar.WEDNESDAY:
			strweek = "수";
			break;
		case Calendar.THURSDAY:
			strweek = "목";
			break;
		case Calendar.FRIDAY:
			strweek = "금";
			break;
		case Calendar.SATURDAY:
			strweek = "토";
			break;
		default:
			strweek = "일";
		}

		int amPm = now.get(Calendar.AM_PM);
		String stramPm = null;
		if (amPm == Calendar.AM) {
			stramPm = "오전";
		} else {
			stramPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.println(day + "일");
		System.out.print(strweek + "요일 ");
		System.out.println(stramPm);
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초");
	}
}
