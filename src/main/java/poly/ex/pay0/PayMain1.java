package poly.ex.pay0;

import java.util.Scanner;

public class PayMain1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		
		while(true) {
			
			System.out.println("결제 수단을 입력해주세용");
			String payOption = scanner.nextLine();
			
			if(payOption.equals("end")) {
				System.out.println("종료");
				return;
			}
			
			System.out.println("금액을 입력해주세요");
			int amount = scanner.nextInt();
			
			scanner.nextLine();
			
			payService.processPay(payOption, amount);
		}
		
	}
}
