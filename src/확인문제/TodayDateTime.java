package 확인문제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDateTime {
	public static void main(String[] args) {
		Date date = new Date();
//		String now = date.toString();
//		System.out.println(date);
		
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now2 = today.format(date);
		System.out.println(now2);
	}
}
