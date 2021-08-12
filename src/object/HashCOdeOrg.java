package object;

public class HashCOdeOrg {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		String str3 = "Hello";
		String str4 = "Hello";

		System.out.println(str1 == str2); // false
		System.out.println("abc" == "abc"); // true

		/*
		 * "String클래스"는 문자열의 내용이 같으면, 
		 * 동일한 해시코드를 반환하도록 오버라이딩 되어있다.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		/*
		 * Object 클래스의 hashCode()와 동일 
		 * 객체의 주소값으로 해시코드를 생성
		 */
		System.out.println(System.identityHashCode(str1)); // 실제 주소값(완전근접)
		System.out.println(System.identityHashCode(str2));
	}
}
