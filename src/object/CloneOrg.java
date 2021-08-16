package object;

import java.util.Arrays;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CloneOrg {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arrCopy = arr.clone(); // 복사하는 코드

		for (int i : arrCopy) { // 자동으로 배열에 있는거를 꺼내서 순차적으로 출력한다.
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrCopy));//이야 대박이네 Arrays클래스를 그대로 사용하면 for구문을 직접 작성할 필요도 없네
	}
}
