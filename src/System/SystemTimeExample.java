package System;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime(); // 시작 시간 읽기 (타임스탬프를 찍는다고 생각하자)

		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}

		long time2 = System.nanoTime(); // 끝 시간 읽기 (타임스탬프를 찍는다고 생각하자)

		System.out.println("1~1000000까지의 합 = " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
	}
}
//나노초는 그냥 1초랑 비교하면 거의 십억분의 1정도의 크기네...(그놈의 나노)