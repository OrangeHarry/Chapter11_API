package System;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime(); // ���� �ð� �б� (Ÿ�ӽ������� ��´ٰ� ��������)

		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}

		long time2 = System.nanoTime(); // �� �ð� �б� (Ÿ�ӽ������� ��´ٰ� ��������)

		System.out.println("1~1000000������ �� = " + sum);
		System.out.println("��꿡 " + (time2 - time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
//�����ʴ� �׳� 1�ʶ� ���ϸ� ���� �ʾ���� 1������ ũ���...(�׳��� ����)