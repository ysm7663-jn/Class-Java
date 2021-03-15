package ex01_oop;

class BreadAndChange {
	
	int bread;
	int change;

	BreadAndChange(int bread, int change) {
		this.bread = bread;
		this.change = change;
	}

}

class Bakery {

	int breadCount;
	int breadPrice;
	int bakeryMoney;

	Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}

	// return 빵과 잔돈, sell(고객돈)
	BreadAndChange sell(int customerMoney) {
		// 판매할 빵 개수
		int sellBread = customerMoney / breadPrice;
		// 잔돈
		int change = customerMoney % breadPrice;

		// 고객에게 돌려 줄 BreadAndChange 객체 생성
		BreadAndChange bnc = new BreadAndChange(sellBread, change);

		// Bakery 판매처리 (빵은 줄고, 돈은 늘고)
		breadCount -= sellBread;
		bakeryMoney += (customerMoney - change);

		// 고객에게 빵과 잔돈 전달
		return bnc;

	}

	void info() {
		System.out.println("빵 : " + breadCount + "개, 자본금 : " + bakeryMoney + "원");
	}

}

class Customer {

	int customerBread;
	int customerMoney;

	Customer(int customerMoney) {
		this.customerMoney = customerMoney;
	}

	// 1. 결과타입 : void
	// 2. 메소드명 : buy
	// 3. 매개면수 : Bakery bakery, int customerMoney
	void buy(Bakery bakery, int customerMoney) {
		// bakery에 customerMoney를 전달하고, 빵과 잔돈을 받는다
		BreadAndChange bnc = bakery.sell(customerMoney);

		// 받은 빵과 잔돈 처리
		this.customerBread += bnc.bread;
		this.customerMoney += bnc.change;

		this.customerMoney -= customerMoney;

		System.out.println("가진 빵 : " + this.customerBread + "개, 남은 돈 : " + this.customerMoney + "원");
	}

}

public class Ex10_Bakery {

	public static void main(String[] args) {

		Bakery paris = new Bakery(100, 500, 10000); // 빵 100개, 개당 500원, 자본금 10,000원
		Bakery tour = new Bakery(50, 1000, 10000); // 빵 50개, 개당 1000원, 자본금 10,000원

		Customer customer = new Customer(20000); // 수중 20000원

		// 첫 번째 빵집 방문
		customer.buy(paris, 10000); // 가진빵 20개, 남은 돈 10000원

		// 두 번째 빵집 방문
		customer.buy(tour, 10000); // 가진빵 30개, 남은 돈 0원

		// 첫 번째 빵집 상황
		paris.info(); // 빵 80개, 자본금 20000원

		// 두 번째 빵집 상황
		tour.info(); // 빵 40개, 자본금 20000원

	}

}
