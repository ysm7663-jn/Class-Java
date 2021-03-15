package ex01_oop;

// 같은 클래스에서 method끼리 정보 공유할때는 method();릂 사용

class BankAccount {

	String accNo;
	long balance;

	BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	void deposit(long money) { // 입금
		if (money <= 0)
			return;
		else
			balance += money;
	}

	// 출금
	// 1) 결과타입 : long (실제로 출금된 금액)
	// 2) 메소드명 : withdraw
	// 3) 매개변수 : long money (출금해야될 금액)
	long withdraw(long money) { // 출금
		if (money > balance || money <= 0)
			return 0; // 실제로 출금된 금액
		else {
			balance -= money;
			return money;
		}
	}

	void inquiry() {
		System.out.println("계좌번호 : " + accNo + " 잔액 : " + balance + "원");
	}

	void transfer(BankAccount to, long money) {
		// 이체
		// 1. 내 계좌에서 출금
		// 2. to 계좌에 입금
		// long withDrawMoney = withdraw(money);
		// to.deposit(withDrawMoney);
		to.deposit(withdraw(money));
	}

}

public class Ex09_BankAccount {

	public static void main(String[] args) {

		BankAccount me = new BankAccount("1234", 10000); // 계좌번호, 입금
		BankAccount mom = new BankAccount("4321", 100000);

		me.deposit(10000); // 10000 입금
		me.deposit(-100); // 불가능 작업

		me.withdraw(20000); // 20000 출금
		me.withdraw(100); // 불가능한 작업

		me.inquiry(); // 계좌번호 : 1234, 잔액 : 0원

		mom.transfer(me, 50000); // 엄마가 나한테 50000 계좌이체
		mom.transfer(me, -100); // 실패 작업
		mom.transfer(me, 100000000); // 실패 작업

		mom.inquiry(); // 계좌번호 : 1234, 잔액 : 50,000원
		me.inquiry(); // 계좌번호 : 4321, 잔액 : 50,000원

	}

}
