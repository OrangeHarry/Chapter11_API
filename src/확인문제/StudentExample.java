package 확인문제;

import java.util.HashMap;

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu1 = (Student) obj;
			if (this.studentNum == stu1.studentNum) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
//		int result = Integer.valueOf(studentNum);
		return studentNum.hashCode();
	}
}

public class StudentExample {
	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");

		// new Student("1)로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 = " + score);

	}
}
