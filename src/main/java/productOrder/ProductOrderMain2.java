package productOrder;

import java.util.Iterator;

public class ProductOrderMain2 {
	
public static void main(String[] args) {
	ProductOrder[] orders = new ProductOrder[3];
		
		
		orders[0] = createOrder("두부", 2000, 4);
		orders[1] = createOrder("콜라", 2200, 5);
		orders[2] = createOrder("김치", 13000, 2);
	
		printOrders(orders);
		int totalAmount= getTotalAmount(orders);
		
		System.out.println("총 결제 금액"+ totalAmount);
	}

	static ProductOrder createOrder(String productName, int price, int quantity) {

		ProductOrder order = new ProductOrder();
		
		order.prodrctName = productName;
		order.price = price;
		order.quantity = quantity;
		
		return order;
		
	}
	static void printOrders(ProductOrder[] orders) {
		
		for (ProductOrder order : orders) {
			System.out.println("상품명: " + order.prodrctName + " 가격 : " + order.price + " 수량 "  + order.quantity);
			
		}
	}
	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
}
