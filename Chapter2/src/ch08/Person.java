package ch08;

public class Person {
	public int height;
	public int weight;
	public int age;
	public String sex;
	public String name;
	
	public void setPersonInfo(int height, int weight, int age, String sex, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.sex = sex;
		this.name = name;
	}

	public void getPersonInfo() {
		System.out.print("Ű�� "+height+"�̰� �����԰� "+weight+" ų���� "+sex+"�� �ֽ��ϴ�."
			+ " �̸��� "+name+"�̰� ���̴� "+age+"���Դϴ�.");
	}
}
