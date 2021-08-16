package string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn1 = "931126-1311111";
		String ssn2 = "931126-2422222";
		
		char gender = ssn2.charAt(7);
		switch (gender) { //switch구문엔 정수랑 문자열만 오는게 가능하다.
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
