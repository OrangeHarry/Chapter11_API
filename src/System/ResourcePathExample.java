package System;

//���ҽ� ���� ��� ���
public class ResourcePathExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
                                               //������
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
//�翬�� ������ �ȸ�������ϱ� ������ ��.. �׷��� jpg���� ���� �־����
//��� Ŭ������ ��θ� Ȯ���� �� �ִ�. ���� ��Ű�������� �����Ű�� ����