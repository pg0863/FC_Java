package ch08;

public class OrderTest {
	public static void main(String[] args) {
		Order myOrder = new Order();
		myOrder.orderID = "202011020003";
		myOrder.phoneNumber = "01023450001";
		myOrder.address = "서울시 종로구 필운동 197-1";
		myOrder.date = "2021-08-08";
		myOrder.time = "13:47";
		myOrder.price = 35000;
		myOrder.menuNumber = 0003;
		
		myOrder.getOrderInfo();
	}
}
