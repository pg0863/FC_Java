package ch04_05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.setStudentName("박의근");
		st1.address = "서울 종로구";
		st1.studentID = 01;
		
		Student st2 = new Student();
		st2.setStudentName("김정은");
		st2.address = "서울 동작구";
		st2.studentID = 02;
		
		st1.showStudentInfo();
		st2.showStudentInfo();
		
		System.out.println(st1);
		System.out.println(st2);
	}

}
