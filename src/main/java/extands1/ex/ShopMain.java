package extands1.ex;

public class ShopMain {
	
	public static void main(String[] args) {
		
		Book book = new Book("JaVa", 10000, "남영", "66347");
		Albim albim = new Albim("뉴진세", 15000, "뉴시");
		Movie movie = new Movie("범죄도시5", 8880, "마짱", "마동석");
		
		book.print();
		albim.print();
		movie.print();
		
		int sum = book.getPrice() + albim.getPrice() + movie.getPrice();
		System.out.println("합계 " +sum);
		
	}
}
