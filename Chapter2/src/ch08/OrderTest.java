package ch08;

public class OrderTest {
	public static void main(String[] args) {
		Order myOrder = new Order();
		myOrder.orderID = "202011020003";
		myOrder.phoneNumber = "01023450001";
		myOrder.address = "����� ���α� �ʿ 197-1";
		myOrder.date = "2021-08-08";
		myOrder.time = "13:47";
		myOrder.price = 35000;
		myOrder.menuNumber = 0003;
		
		myOrder.getOrderInfo();
	}
}
