package poly.ex.pay0;

public class PayMain0 {
	public static void main(String[] args) {
		
		PayService payService = new PayService();
		
		//kakao결제
		String payOtion1 = "kakao";
		int amount1 = 5000;
		payService.processPay(payOtion1, amount1);
		
		//naver결제
		String payOtion2 = "naver";
		int amount2 = 7000;
		payService.processPay(payOtion2, amount2);
		
		//잘못된결제
		String payOtion3 = "fail";
		int amount3 = 15000;
		payService.processPay(payOtion3, amount3);
		
		String payOtion5 = "new";
		int amount5 = 7000;
		payService.processPay(payOtion5, amount5);
	}
}
