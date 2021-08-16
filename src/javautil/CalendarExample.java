package javautil;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //Calendar�� �߻�Ŭ������ new�� ������ �� ���� ���ŵ� �׷��� �����޼ҵ��� getInstance()�޼ҵ带 �̿��ؼ� ������ü�� ����

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null;
		switch (week) {
		case Calendar.MONDAY:
			strweek = "��";
			break;
		case Calendar.TUESDAY:
			strweek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strweek = "��";
			break;
		case Calendar.THURSDAY:
			strweek = "��";
			break;
		case Calendar.FRIDAY:
			strweek = "��";
			break;
		case Calendar.SATURDAY:
			strweek = "��";
			break;
		default:
			strweek = "��";
		}

		int amPm = now.get(Calendar.AM_PM);
		String stramPm = null;
		if (amPm == Calendar.AM) {
			stramPm = "����";
		} else {
			stramPm = "����";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println(day + "��");
		System.out.print(strweek + "���� ");
		System.out.println(stramPm);
		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.println(second + "��");
	}
}
