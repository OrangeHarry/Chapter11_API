package 확인문제;

class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		String result = id + ":" + name;
		return result;
	}
}

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}
}
