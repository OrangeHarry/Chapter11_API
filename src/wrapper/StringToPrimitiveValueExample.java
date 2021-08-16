package wrapper;

//문자열을 기본타입 값으로 변환
public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
//		boolean value3 = Boolean.parseBoolean("ggg"); //false가 찍힘
		
		System.out.println("value1 = "+value1);
		System.out.println("value2 = "+value2);
		System.out.println("value3 = "+value3);
		
		System.out.println(value1+value2);
	}
}
