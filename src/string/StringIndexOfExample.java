package string;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "���ڸ� ���� - V.O.SĿ��";

		int location = subject.indexOf("Ŀ��");
		System.out.println(location);
		
		if(subject.indexOf("���ڸ�") != -1) { //���ڿ��� ���� �Ǿ��ִ��� Ȯ�� (������ �ȵ������� -1�� ���ϵȴ�)
			System.out.println("���ڸ� ���� �뷡�� �±���");
		}else {
			System.out.println("���ڸ� ������ �ƴϾ��ݾ�!!");
		}
	}
}
