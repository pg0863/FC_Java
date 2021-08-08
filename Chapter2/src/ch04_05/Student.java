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
		System.out.println(studentID+"학번의 이름은 "+studentName+"이고, 주소는 "+address+"입니다.");
	}
}
