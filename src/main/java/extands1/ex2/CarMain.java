package extands1.ex2;

public class CarMain {
	public static void main(String[] args) {
		ElectricCar electicCar = new ElectricCar();
		electicCar.move();
		electicCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}
