package poly.ex3;

public class AbstractMain {

	public static void main(String[] args) {
		//추상 클래스 생성 불가
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		cat.sound();
		cat.move();
		
		soundAnimal(caw);
		soundAnimal(dog);
		soundAnimal(cat);
	}
	
	//변하지 않는 부분
	private static void soundAnimal(AbstractAnimal animal) {

		System.out.println("동물 소리 시작");
		animal.sound();
		System.out.println("동물 소리 종료");
	}
}
