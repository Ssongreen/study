package poly.car1;

public class NewCar implements Car {

	@Override
	public void startEngine() {
		System.out.println("새로운 카 ");
	}

	@Override
	public void offEngine() {
		System.out.println("종료");
	}

	@Override
	public void pressAccelerator() {
		System.out.println("accelerator new Car");
	}
	
}
