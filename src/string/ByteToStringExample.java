package string;

//바이트배열을 문자열로 변환
public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes); //byte는 1바이트 char(문자열)는 2바이트라서 자동형변환이지
		System.out.println(str1);
		
                          		//6은 74의 인덱스 위치
		String str2 = new String(bytes, 6, 4);
	                                     //4는 6포함해서 4개 (갯수)
		System.out.println(str2);
	}
}
