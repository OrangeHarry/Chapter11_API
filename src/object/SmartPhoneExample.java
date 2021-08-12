package object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("애플", "IOS");

		String strObj = myPhone.toString(); // 재정의된 toString() 호출
		System.out.println(strObj);

		System.out.println(myPhone); // 재정의된 toString()을 호출하고 리턴값을 받아 출력
	}
}
