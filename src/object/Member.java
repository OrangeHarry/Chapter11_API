package object;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 매개값이 Member타입인지 확인
			Member member = (Member) obj; // Member 타입으로 강제변환
			if (id.equals(member.id)) { // id필드값이 동일한지 검사한후
				return true;            // 동일하다면 true를 리턴
			}
		}
		return false; // 매개값이 Member타입이 아니거나 id필드값이 다른 경우
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}

