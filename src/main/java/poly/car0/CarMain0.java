package poly.car0;

public class CarMain0 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		K3Car K3Car = new K3Car();
		
		driver.setK3Car(K3Car);
		driver.drive();
		
		Model3Car model3Car = new Model3Car();
		
		driver.setK3Car(null);
		driver.setModel3Car(model3Car);
		driver.drive();
	}
	
}
