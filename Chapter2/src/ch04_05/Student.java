package ch04_05;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public String setStudentName(String name) {
		studentName = name; 
		return studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID+"�й��� �̸��� "+studentName+"�̰�, �ּҴ� "+address+"�Դϴ�.");
	}
}
