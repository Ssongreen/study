package productOrder;

public class ProductOrderMain {
	public static void main(String[] args) {
		
		
		ProductOrder topu = new ProductOrder();
		topu.prodrctName = "두부";
		topu.price = 2000;
		topu.quantity = 2;
		
		
		ProductOrder coke = new ProductOrder();
		
		coke.prodrctName = "콜라";
		coke.price = 1300;
		coke.quantity = 3;
		
		ProductOrder kimch = new ProductOrder();
		kimch.prodrctName = "김치";
		kimch.price = 13000;
		kimch.quantity = 4;
	
		ProductOrder[] orders = {topu,coke,kimch};
		int totalAmount = 0;
		
		for(ProductOrder order : orders) {
			System.out.println("상품명: " + order.prodrctName + " 가격 : " + order.price + " 수량 "  + order.quantity);
			
			totalAmount += order.price * order.quantity;
		}
		System.out.println("총 결제 금액"+ totalAmount);
	}

}
