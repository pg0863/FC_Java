package ch08;

public class Order {
	public String orderID;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public int price;
	public int menuNumber;
	
	public void getOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : "+orderID);
		System.out.println("�ֹ� �ڵ��� ��ȣ : "+phoneNumber);
		System.out.println("�ֹ� �� �ּ� : "+address);
		System.out.println("�ֹ� ��¥ : "+date);
		System.out.println("�ֹ� �ð� : "+time);
		System.out.println("�ֹ� ���� : "+price);
		System.out.println("�޴� ��ȣ : "+menuNumber);
	}
}
