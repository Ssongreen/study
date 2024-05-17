package poly.ex6;

public class SoundFlyMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();
		
		soundAnimal(chicken);
		soundAnimal(bird);
		soundAnimal(dog);
		
		moveAnimal(chicken);
		moveAnimal(bird);
		moveAnimal(dog);
		
		flyAnimal(chicken);
		flyAnimal(bird);
	}
	//변하지 않는 부분
		private static void soundAnimal(AbstractAnimal animal) {

			System.out.println("동물 소리 시작");
			animal.sound();
			System.out.println("동물 소리 종료");
		}
		
		//변하지 않는 부분
		private static void moveAnimal(AbstractAnimal animal) {
			
			System.out.println("이동");
			animal.sound();
			System.out.println("정지");
		}
		//fly 인터페이스가 있으면 사용 가능
		private static void flyAnimal(Fly fly) {
			System.out.println("날다");
			fly.fly();
			System.out.println("접다");
			
		}
}
