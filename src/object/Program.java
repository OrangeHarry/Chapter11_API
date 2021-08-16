package object;

import bit.camp.common.BizNegativeNumberException;
import bit.camp.common.BizThousandOverException;
import bit.camp.common.Calculator;

class MyClass{
	
}


public class Program {
	public static void main(String[] args) {
		
	Object o1 = new MyClass(); // 모든 클래스는 암묵적으로 Object 클래스를 상속받는다.

	
	int var = 1;
	
	Integer var2 = new Integer(1);
	Integer var3 = new Integer("1"); //가능한 이유는 Integer 드래그해서 F11키로 눌러서 확인 가능
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
