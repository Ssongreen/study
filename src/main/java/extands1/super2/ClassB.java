package extands1.super2;

public class ClassB extends ClassA {
	
	public ClassB(int a) {
		super();
		System.out.println("classB 생성자 " + a);
		
	}
	public ClassB(int a, int b) {
		super();
		System.out.println("ClassB 생성자 " + a + " b = " +b);
	}
}
