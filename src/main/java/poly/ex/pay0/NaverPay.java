package poly.ex.pay0;

public class NaverPay implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("카카오 페이 시스템과 연결중");
		System.out.println(amount+ "원 결제");
		return true;		
	}


}
