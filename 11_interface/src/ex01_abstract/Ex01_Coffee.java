package ex01_abstract;

/*
 * 추상 메소드
 * 1. abstract method
 * 2. 형태가 없는 메소드
 * 3. 본문이 없는 메소드
 * 4. 작성 방법
 *    abstract 결과타입 메소드명(매개변수);
 * 
 * 추상 클래스
 * 1. abstract class
 * 2. 형태가 없는 클래스
 * 3. new가 불가능한 클래스
 * 4. 추상 메소드를 하나라도 가지고 있으면 추상 클래스
 * 5. 작성 방법
 *    abstract class 클래스명 {
 *        abstract 결과타입 메소드명(매개변수);
 *    }
 * 6. 추상 클래스를 상속 받는 서브클래스들은
 *    반드시 추상 메소드를 오버라이드 해야 한다.
 */

abstract class Coffee {
	// field
	private String beanOrigin;
	// constructor
	public Coffee(String beanOrigin) {
		super();
		this.beanOrigin = beanOrigin;
	}
	// method
	// 일반 메소드
	public void info() {
		System.out.println("커피원산지: " + beanOrigin);
	}
	// 추상 메소드 (본문을 작성할 필요가 없는 메소드)
	public abstract void taste();
}

class Espresso extends Coffee {
	// field
	private int water;
	// constructor
	public Espresso(String beanOrigin, int water) {
		super(beanOrigin);
		this.water = water;
	}
	// method
	// 일반 메소드는 오버라이드를 하던지 말던지 알아서 처리
	// 추상 메소드는 반드시 오버라이드를 해야 함
	@Override
	public void info() {
		super.info();  // 커피원산지
		System.out.println("물의 양: " + water);
	}
	@Override
	public void taste() {
		System.out.println("Espresso는 쓰다.");
	}
}

class Latte extends Espresso {
	// field
	private int milk;
	// constructor
	public Latte(String beanOrigin, int water, int milk) {
		super(beanOrigin, water);
		this.milk = milk;
	}
	// method
	@Override
	public void info() {
		super.info();  // 커피원산지, 물
		System.out.println("우유의 양: " + milk);
	}
	@Override
	public void taste() {
		System.out.println("Latte는 부드럽다.");
	}
}

public class Ex01_Coffee {

	public static void main(String[] args) {
		
		// new Coffee("콜롬비아");  // 추상 클래스는 new를 할 수 없다.
		
		Coffee[] list = new Coffee[2];  // 객체 생성하는 new가 아님
		
		list[0] = new Espresso("탄자니아", 30);
		list[1] = new Latte("케냐", 30, 150);
		
		for (Coffee coffee : list) {
			if (coffee != null) {
				coffee.info();
				coffee.taste();
			}
		}
		
	}

}