package poly.diamond;

public class DiamondMain {

	public static void main(String[] args) {
		InterfaceA a = new Child();
		
		a.methodA();
		a.mthodCommon();
	
		InterfaceB b = new Child();
		b.methodB();
		b.mthodCommon();
		
		Child c = new Child();
		c.methodA();
		c.methodB();
		c.mthodCommon();
	}
}
