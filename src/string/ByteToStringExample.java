package string;

//����Ʈ�迭�� ���ڿ��� ��ȯ
public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes); //byte�� 1����Ʈ char(���ڿ�)�� 2����Ʈ�� �ڵ�����ȯ����
		System.out.println(str1);
		
                          		//6�� 74�� �ε��� ��ġ
		String str2 = new String(bytes, 6, 4);
	                                     //4�� 6�����ؼ� 4�� (����)
		System.out.println(str2);
	}
}
