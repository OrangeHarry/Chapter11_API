package Ȯ�ι���;

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
		Member member = new Member("blue", "���Ķ�");
		System.out.println(member);
	}
}
