package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// ������(constructor) �����ε�
	public Student() {}
	// mainŬ�������� ��ü ������ ���� ���, ������� ������ main���� ��ü ������ ����.
	
	// �����ڸ� ���� ����� ���
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName+" �л��� �й��� "+studentNumber+"�̰�, "
				+grade+"�г��Դϴ�";
	}
}
