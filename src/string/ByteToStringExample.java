package string;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
                          		//6�� 74�� �ε��� ��ġ
		String str2 = new String(bytes, 6, 4);
	                                     //4�� 6�����ؼ� 4�� (����)
		System.out.println(str2);
	}
}
//byte�� 1����Ʈ char�� 2����Ʈ?? �³� Ȯ���غ���
