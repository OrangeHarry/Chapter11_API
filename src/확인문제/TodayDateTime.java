package Ȯ�ι���;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDateTime {
	public static void main(String[] args) {
		Date date = new Date();
//		String now = date.toString();
//		System.out.println(date);
		
		SimpleDateFormat today = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String now2 = today.format(date);
		System.out.println(now2);
	}
}
