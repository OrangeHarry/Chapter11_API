package object;

import bit.camp.common.BizNegativeNumberException;
import bit.camp.common.BizThousandOverException;
import bit.camp.common.Calculator;

class MyClass{
	
}


public class Program {
	public static void main(String[] args) {
		
	Object o1 = new MyClass(); // ��� Ŭ������ �Ϲ������� Object Ŭ������ ��ӹ޴´�.

	
	int var = 1;
	
	Integer var2 = new Integer(1);
	Integer var3 = new Integer("1"); //������ ������ Integer �巡���ؼ� F11Ű�� ������ Ȯ�� ����
	System.out.println(var);	
	System.out.println(var2.intValue());
	System.out.println(var3.valueOf("2"));
		
//////////////////////////////////////////////////////////////
		try {
			System.out.println(Calculator.add(-10000, 0));
		} catch (BizThousandOverException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
