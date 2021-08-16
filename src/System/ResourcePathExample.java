package System;

//리소스 절대 경로 얻기
public class ResourcePathExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
                                               //폴더명
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
//당연히 파일을 안만들었으니깐 에러가 뜸.. 그래서 jpg파일 만들어서 넣어줬어
//모든 클래스의 경로를 확인할 수 있다. 같은 패키지내에서 실행시키는 것은