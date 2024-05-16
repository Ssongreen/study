package ref;

public class VarChange2 {
	
	public static void main(String[] args) {
		
		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;
		
//		System.out.println("A 참조값" + dataA);
//		System.out.println("B 참조값" + dataB);
//		System.out.println("a.value 참조값" + dataA.value);
//		System.out.println("b.value 참조값" + dataB.value);
		
		//A는 20
		dataA.value = 20;
//		System.out.println("A 참조값" + dataA);
//		System.out.println("B 참조값" + dataB);
//		System.out.println("a.value 참조값" + dataA.value);
//		System.out.println("b.value 참조값" + dataB.value);
		
		//dataB
		dataB.value = 30;
		System.out.println("A 참조값" + dataA);
		System.out.println("B 참조값" + dataB);
		System.out.println("a.value 참조값" + dataA.value);
		System.out.println("b.value 참조값" + dataB.value);
	}
}
