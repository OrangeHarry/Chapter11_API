package System;

class Car {}

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// ù��° ���
//		Class clazz = Car.class;

		// �ι�° ���
		Class clazz = Class.forName("System.Car");

		// ����° ���
//		Car car = new Car();
//		Class clazz = car.getClass();

		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
