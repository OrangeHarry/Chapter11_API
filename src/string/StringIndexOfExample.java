package string;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "제자리 걸음 - V.O.S커버";

		int location = subject.indexOf("커버");
		System.out.println(location);
		
		if(subject.indexOf("제자리") != -1) { //문자열이 포함 되어있는지 확인 (포함이 안되있으면 -1이 리턴된다)
			System.out.println("제자리 걸음 노래가 맞군요");
		}else {
			System.out.println("제자리 걸음이 아니었잖아!!");
		}
	}
}
