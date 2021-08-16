package Ȯ�ι���;

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
		// Student Ű�� ������ �����ϴ� HashMap ��ü����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");

		// new Student("1)�� ������ �о��
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ���� = " + score);

	}
}
