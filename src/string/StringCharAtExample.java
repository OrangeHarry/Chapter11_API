package string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn1 = "931126-1311111";
		String ssn2 = "931126-2422222";
		
		char gender = ssn2.charAt(7);
		switch (gender) { //switch������ ������ ���ڿ��� ���°� �����ϴ�.
		case '1':
		case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�.");
			break;
		}
	}
}
