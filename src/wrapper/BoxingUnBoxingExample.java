package wrapper;

//�⺻Ÿ���� ���� �ڽ��ϰ� ��ڽ��ϱ�
public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// �ڽ�
		Integer obj1 = new Integer(100); //IntegerŬ�������� final value���� 100�� ��.
		Integer obj2 = new Integer("200"); // ���ڿ��� �־ ���ڷ� �ٲ��ֳ�
		Integer obj3 = Integer.valueOf("300"); //static�޼ҵ�� new�ʿ����

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1 + obj2 + obj3);

		// ��ڽ�
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		System.out.println(value1 + value2 + value3);
	}
}
