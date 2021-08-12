package object;

class Value{
	//�ʵ�
	int value;
	
	//������ �޼ҵ�
	@Override
	public boolean equals(Object obj) {
		if(this.value == ((Value)obj).value) {//���� ����ȯ�� �ؾ��� �񱳸� �� �� ���ݾ�
			return true;
		}else {
			return false;
		}
	}
	
	//������
	public Value(int value) {
		this.value = value;
	}
}

public class ObjectOrg {
	public static void main(String[] args) {
		Value v1 = new Value(2012057030);
		Value v2 = new Value(2012057030);
		
		System.out.println(v1 instanceof Value); //true�� ������~
		System.out.println(v2 instanceof Value); //true
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v1 == v2); // �������� ���İ� ����°�(�ּҰ�)

		System.out.println(System.identityHashCode(v1)); //�̰� ��¥ ������ �ּ�(���� ������)��� ���� �ȴ�.
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode()); //hash == ������ȣ��� �����ϸ� �ȴ�.
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); // ValueŬ�������� �����Ǹ� �߱� ������ true��� ������� ���� �� �ִ�.
		
	}
}
