package poly.diamond;

public class Child implements InterfaceA, InterfaceB {


	@Override
	public void mthodCommon() {
		System.out.println("common");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	@Override
	public void methodA() {
		System.out.println("methodA");
	}


}
