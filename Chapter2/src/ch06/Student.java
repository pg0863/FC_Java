package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// 생성자(constructor) 오버로딩
	public Student() {}
	// main클래스에서 객체 생성을 위해 사용, 사용하지 않으면 main에서 객체 생성시 오류.
	
	// 생성자를 직접 만드는 경우
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName+" 학생의 학번은 "+studentNumber+"이고, "
				+grade+"학년입니다";
	}
}
