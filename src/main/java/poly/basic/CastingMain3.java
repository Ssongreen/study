package poly.basic;

public class CastingMain3 {
	
	public static void main(String[] args) {
		
		//upcasting, downcasting 비교
		
		Child child = new Child();
		Parent parent1 = (Parent) child; // 업 캐스팅은 생략 가능, 생략 권장
		Parent parent2 = child; // 업 캐스팅은 생략 가능, 생략 권장
		
		parent1.parentMethod();
		parent2.parentMethod();
	}
	
}
