package access.static2;

public class DecoMain1 {
	public static void main(String[] args) {
		
	String s = "Hello Java";
	DecoUtil utils = new DecoUtil();
	String deco = utils.deco(s);
	
	System.out.println("before " + s);
	System.out.println("afer " + deco);
}
}
