package object;

import java.util.HashMap;


public class KeyExample {
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String���� �����ϴ� HashMap��ü ����
		HashMap<Key, String> hasMap = new HashMap<Key, String>();
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hasMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű new Key(1)�� "ȫ�浿"�� �о��
		String value = hasMap.get(new Key(1));
		System.out.println(value);
	}
}
