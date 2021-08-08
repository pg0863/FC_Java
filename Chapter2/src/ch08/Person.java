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
		System.out.print("키가 "+height+"이고 몸무게가 "+weight+" 킬로인 "+sex+"이 있습니다."
			+ " 이름은 "+name+"이고 나이는 "+age+"세입니다.");
	}
}
