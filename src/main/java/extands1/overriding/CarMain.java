package extands1.overriding;

public class CarMain {
	public static void main(String[] args) {
		ElectricCar electicCar = new ElectricCar();
		electicCar.move();
		electicCar.charge();
		electicCar.openDoor();
		
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();
		
		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.fillHydrogen();
		hydrogenCar.openDoor();
		
		
	}
}
