package wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// �ڵ��ڽ�
		Integer obj = 100;
//		Integer obj = new Integer(100) �̰Ŷ�� �����ؾߵ�
		System.out.println("value = " + obj.intValue());

		// ���Խ� �ڵ� ��ڽ�
		int value = obj;
		System.out.println("value = " + value);

		// ����� �ڵ� ��ڽ�
		int result = obj /*obj.intValue()*/ + 100;
		System.out.println("result = " + result);
	}
}
