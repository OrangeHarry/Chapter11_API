package object;

public class HashCOdeOrg {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		String str3 = "Hello";
		String str4 = "Hello";

		System.out.println(str1 == str2); // false
		System.out.println("abc" == "abc"); // true

		/*
		 * "StringŬ����"�� ���ڿ��� ������ ������, 
		 * ������ �ؽ��ڵ带 ��ȯ�ϵ��� �������̵� �Ǿ��ִ�.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		/*
		 * Object Ŭ������ hashCode()�� ���� 
		 * ��ü�� �ּҰ����� �ؽ��ڵ带 ����
		 */
		System.out.println(System.identityHashCode(str1)); // ���� �ּҰ�(��������)
		System.out.println(System.identityHashCode(str2));
	}
}
