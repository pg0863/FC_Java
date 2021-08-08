package ch06;

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1.showStudentInfo());
		
		Student st2 = new Student(123, "kim", 3);
		System.out.println(st2.showStudentInfo());
	}
}
