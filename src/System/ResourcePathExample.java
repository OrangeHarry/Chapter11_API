package System;

//리소스 절대 경로 얻기
public class ResourcePathExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
//당연히 파일을 안만들었으니깐 에러가 뜸