package ex01_upcasting;

// 모든 coffee를 저장할 수 있는 Coffee 타입 생성

class Coffee {

	private String beanOrigin;

	public Coffee(String beanOrigin) {
		this.beanOrigin = beanOrigin;
	}

	public String getBeanOrigin() {
		return beanOrigin;
	}

	public void setBeanOrigin(String beanOrigin) {
		this.beanOrigin = beanOrigin;
	}

	public void info() {
		System.out.print("커피 원산지 : " + beanOrigin);
	}

	public void taste() {
		// Espresso, Latte 에서 호출하려면 내용이 없더라도 메소드는 있어야 한다.
	}

}

class Espresso extends Coffee {

	private int water;

	public Espresso(String beanOrigin, int water) {
		super(beanOrigin);
		this.water = water;
	}

	@Override
	public void info() {
		super.info();
		System.out.print(", 물의 양 : " + water);
	}

	@Override
	public void taste() {
		System.out.println("  Espresso는 쓰다.");
	}

}

class Latte extends Espresso {

	private int milk;

	public Latte(String beanOrigin, int water, int milk) {
		super(beanOrigin, water);
		this.milk = milk;
	}

	@Override
	public void info() {
		super.info();
		System.out.print(", 우유량 : " + milk);
	}

	@Override
	public void taste() {
		System.out.println("  Latte는 부드럽다.");
	}

}

public class Ex03_coffee {

	public static void main(String[] args) {

		// 모든 Coffee는 Coffee 클래스의 서브클래스이므로, Coffee 클래스 타입으로 저장할 수 있다.

		// 1. Coffee 클래스의 info 메소드를 찾아서 호출 여부를 기다린다.
		// 2. new Espresso()를 통해서 생성된 객체를 확인한 뒤 Espresso 클래스의 info 메소드를 호출하기로 정한다.

		/*
		 * Coffee coffee1 = new Espresso("~", 30);
		 * 
		 * 1. 컴파일 타임(C++, 정적바인딩) 
		 * Coffee coffee1만 실행 Coffee 클래스 메모리에 coffee1 생성 Coffee
		 * 클래스만 봄 -> info 메소드 확인
		 * 
		 * 2. 실행 타임 (f11)(Java, 동적바인딩) 
		 * coffee1 = new Espresso("~", 30); 을 실행 coffee1에 실제
		 * 주소지가 들어감 -> Espresso 클래스 메모리에 메모리 할당
		 */

		Coffee[] coffeeList = new Coffee[3];

		coffeeList[0] = new Espresso("케냐", 100);
		coffeeList[1] = new Latte("조지아", 100, 30);
		coffeeList[2] = new Espresso("콜롬비아", 150);

		for (Coffee coffee : coffeeList) {
			coffee.info();
			coffee.taste(); // 슈퍼클래스에 메소드 작성하기 애매하다고 안 만들어 놓으면, 서브클래스에서 쓰이는 메소드가 작동하지 않는다.
		}

	}

}
