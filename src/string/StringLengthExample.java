package string;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "931126-1311111";
		int ln = ssn.length(); 
		if(ln == 14) { //���⼭ ln�� ���״�� ���ڿ� ���̶� indexó�� 0���� �������� �ʴ´�.
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}
	}
}
