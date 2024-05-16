package productOrder;

import java.util.Iterator;
import java.util.Scanner;

public class ProductOrderMain3 {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("입력할 주문의 개수를 입력 하세요");
	int s = scanner.nextInt();
	scanner.nextLine();
	
	ProductOrder[] orders = new ProductOrder[s];
	
	for (int i = 0; i < orders.length; i++) {
		System.out.println((i+1) + "번째 주문을 입력하세요");
		
		System.out.println("상품명");
		String productName = scanner.nextLine();
		
		System.out.println("가격");
		int price = scanner.nextInt();
		
		System.out.println("수량");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		orders[i] = createOrder(productName, price , quantity);
		
	}
		
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
