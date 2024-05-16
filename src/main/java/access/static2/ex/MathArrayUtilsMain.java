package access.static2.ex;

public class MathArrayUtilsMain {
	
	public static void main(String[] args) {
		
		int[] values = {77,45,3,4,5,2,3,99,12,62346};
		System.out.println("sum = " + MathArrayUtils.sum(values));
		System.out.println("average = " + MathArrayUtils.average(values));
		System.out.println("min = " + MathArrayUtils.min(values));
		System.out.println("max = " + MathArrayUtils.max(values));
	}
}
