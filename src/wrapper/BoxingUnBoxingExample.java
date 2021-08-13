package wrapper;

//기본타입의 값을 박싱하고 언박싱하기
public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// 박싱
		Integer obj1 = new Integer(100); //Integer클래스에서 final value값에 100이 들어감.
		Integer obj2 = new Integer("200"); // 문자열을 넣어도 숫자로 바꿔주넹
		Integer obj3 = Integer.valueOf("300"); //static메소드라 new필요없어

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1 + obj2 + obj3);

		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		System.out.println(value1 + value2 + value3);
	}
}
