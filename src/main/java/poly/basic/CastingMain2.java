package poly.basic;

public class CastingMain2 {
	public static void main(String[] args) {
		
		// 부모 변수가 자식 인스턴스 참조
		Parent poly = new Child();
		
		//다운 캐스팅
//		Child child = (Child) poly;
//		child.childMethod();
		
		//일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅 , 연산자 우선 순위를 넣어서 다운 캐스팅을 하면 된다.
		((Child) poly).childMethod();
		
	} 
}
