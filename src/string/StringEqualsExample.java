package string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("하헌민");
		String strVar2 = "하헌민";

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}
//String에서 equal은 동일한 문자열인가를 비교하므로 별다른 재정의가 필요없다.