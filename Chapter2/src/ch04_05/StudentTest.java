package ch04_05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.setStudentName("���Ǳ�");
		st1.address = "���� ���α�";
		st1.studentID = 01;
		
		Student st2 = new Student();
		st2.setStudentName("������");
		st2.address = "���� ���۱�";
		st2.studentID = 02;
		
		st1.showStudentInfo();
		st2.showStudentInfo();
		
		System.out.println(st1);
		System.out.println(st2);
	}

}
