package ref;

public class MethodChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		System.out.println("메서드 호출전 " + dataA.value);
		changePrimitive(dataA);
		System.out.println("메서드 호출후 " + dataA.value);
		
		
	}
	
	static void changePrimitive(Data dataX) {
		dataX.value = 20;
	}
}