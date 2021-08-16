package string;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		byte[] bytes = new byte[100]; // ���� ����Ʈ�� �����ϱ� ���� �迭 ����

		System.out.print("�Է� = ");
		try {
			// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
			int readByteNo = System.in.read(bytes);
			// �迭�� ���ڿ��� ��ȯ
			String str = new String(bytes, 0, readByteNo - 2); // \r+\n(13,10) ���� �ʿ䰡 ��� -2�� ���ذ��̴�.
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
