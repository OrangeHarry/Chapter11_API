package string;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "931126-1311111";
		int ln = ssn.length(); 
		if(ln == 14) { //여기서 ln은 말그대로 문자열 길이라서 index처럼 0부터 시작하지 않는다.
			System.out.println("주민번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민번호 자릿수가 틀립니다.");
		}
	}
}
