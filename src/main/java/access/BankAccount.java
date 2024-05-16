package access;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BankAccount {
	private int balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	// public 메서드 : 입금
	public void deposit(int amount) {
		if (inAmoutValid(amount)) {
			balance += amount;
			
		} else {
			System.out.println("유효하지 않는 금액입니다.");
		}
	}
	
	private boolean inAmoutValid(int amout) {
		return amout > 0;
		
	}
	
	// public 메서드 출금	
	public void withdraw(int amount) {
		if(inAmoutValid(amount) && balance - amount >= 0) {
			balance -= amount;
		}else {
			System.out.println("유효하지 않는 금액이거나 잔액이 부족해요");
		}
			
	}
	
	public int getBalance() {
		return balance;
	}
	private boolean isAmountValid(int amount) {
		//금액이 0보다 커야함
		return amount > 0;
	}
}
