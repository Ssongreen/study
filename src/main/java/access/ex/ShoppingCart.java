package access.ex;

public class ShoppingCart {

	private Item[] items = new Item[10];
	private int itemCount;
	private int itemCartPrice;
	
	public void addItem(Item item) {
		
		
		if(itemCount >= items.length) {
			System.out.println("카트 초과입니다");
			return;
		}
		items[itemCount++] = item;
	}

	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			System.out.println("상품 :" + item.getName() + " 합계 :" + item.getTotalPrice());
			
		}
		System.out.println("전체 가격 합 " + calculateTotalPrice());
	}
	private int calculateTotalPrice() {
		int calculateTotalPrice = 0;
		for(int i = 0; i < itemCount; i++ ) {
			Item item = items[i];
			calculateTotalPrice += item.getTotalPrice();
		}
		return calculateTotalPrice;
		
	}
}
