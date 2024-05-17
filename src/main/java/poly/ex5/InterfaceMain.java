package poly.ex5;

public class InterfaceMain {

	public static void main(String[] args) {
		
		//인터페이스 생성 불가
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Caw caw = new Caw();
		
		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(caw);
		
		moveAnimal(cat);
		moveAnimal(dog);
		moveAnimal(caw);
	}
	
	
	//변하지 않는 부분
	private static void soundAnimal(InterfaceAnimal animal) {

		System.out.println("동물 소리 시작");
		animal.sound();
		System.out.println("동물 소리 종료");
	}
	
	//변하지 않는 부분
	private static void moveAnimal(InterfaceAnimal animal) {
		
		System.out.println("이동");
		animal.sound();
		System.out.println("정지");
	}
	
}
