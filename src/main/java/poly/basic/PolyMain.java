package poly.basic;

public class PolyMain {
	public static void main(String[] args) {
		//부모 변수가 부모 인스턴스 참조
		System.out.println("Parent - > Parent ");
		Parent parent = new Parent();
		
		parent.parentMethod();
		
		//자식 변수가 자식 인스턴스 참조
		System.out.println("Child = > Child");
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		//부모 변수가 자식 인스턴스를 참조(다형적 참조)
		System.out.println("Parent - > Child");
		
		Parent poly = new Child();
		poly.parentMethod();
		
		
//		poly.childMethod(); 호출 불가  -> 상속 관계는 부모를 찾아 올라 갈 수 있지만 자식 정보는 찾을 수 없기 때문
	}
}
