package poly.ex4;

public class Dog extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("개는 멍멍");
		
	}

	@Override
	public void move() {
		System.out.println("발발 개");
	}


}
