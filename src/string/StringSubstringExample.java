package string;

//문자열 추출하기
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "931126-1311111";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String seconfNum = ssn.substring(7);
		System.out.println(seconfNum);
	}
}
