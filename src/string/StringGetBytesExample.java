package string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		// 기본 문자셋으로 인코딩과 디코딩
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length = " + bytes1.length); // 뭐야 왜 10이야..
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String = " + str1);

		try {
			// EUC-KR을 이용해서 인코딩 디코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length = " + bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("bytes2 -> String = " + str2);

			// **UTF-8을 이용해서 인코딩 및 디코딩**  //현재 이클립스 초기설정이 이게 아니라서 글이 깨질꺼야
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length = " + bytes3.length);
			String str3 = new String(bytes3);
			System.out.println("bytes3 -> String = " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
