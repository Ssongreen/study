package extands1.ex;

public class Albim extends Item {

	private String artist;
	
	public Albim(String name, int price, String artist) {
		super(name, price);
		this.artist = artist;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("아티스트 " + artist);
	}
	
}
