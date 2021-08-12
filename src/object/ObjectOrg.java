package object;

class Value{
	//필드
	int value;
	
	//재정의 메소드
	@Override
	public boolean equals(Object obj) {
		if(this.value == ((Value)obj).value) {//강제 형변환을 해야지 비교를 할 수 있잖아
			return true;
		}else {
			return false;
		}
	}
	
	//생성자
	public Value(int value) {
		this.value = value;
	}
}

public class ObjectOrg {
	public static void main(String[] args) {
		Value v1 = new Value(2012057030);
		Value v2 = new Value(2012057030);
		
		System.out.println(v1 instanceof Value); //true가 찍히지~
		System.out.println(v2 instanceof Value); //true
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v1 == v2); // 참조값이 같냐고 물어보는거(주소값)

		System.out.println(System.identityHashCode(v1)); //이게 진짜 고유한 주소(완전 근접함)라고 보면 된다.
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode()); //hash == 고유번호라고 생각하면 된다.
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); // Value클래스에서 재정의를 했기 때문에 true라는 결과값을 얻을 수 있다.
		
	}
}
