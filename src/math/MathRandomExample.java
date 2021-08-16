package math;

public class MathRandomExample {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 눈 = " + num);
	}
}
//자바에선 Math.random()보다 사실상 그냥 Random이 더 정확하다.