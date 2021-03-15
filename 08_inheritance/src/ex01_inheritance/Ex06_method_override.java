package ex01_inheritance;

/*
 * 메소드 오버라이드 (method override)
 * 
 * 1. 슈퍼클래스의 메소드를 서브클래스는 사용할 수 있다. (코드의 재활용)
 * 2. 슈퍼클래스의 메소드를 서브클래스가 다시 만들어서 사용할 수 있다. (오버라이드)
 * 3. 슈퍼클래스의 메소드와 원형(결과 타입 + 메소드 명 + 매개변수)이 모두 같아야 한다.
 * 4. 애너테이션 (Annotation) @Override 를 추가하는 것이 좋다.
 */

// 슈퍼클래스
class Espreeso {

	// field
	String beanOrigin; // 커피원산지
	int water; // 물의 양

	// constructor
	Espreeso(String beanOrigin, int water) {
		this.beanOrigin = beanOrigin;
		this.water = water;
	}

	// method
	void taste() {
		System.out.println("쓰다.");
	}

}

// 서브클래스
class Latte extends Espreeso {
	
	// field
	int milk;
	
	// constructor
	Latte(String beanOrigin, int water, int milk) {
		super(beanOrigin, water);	// Espresso(String beanOrigin, int water) { ... } 호출
		this.milk = milk;
	}
	
	// method
	
	// Espresso 클래스에 taste 메소드가 있지만, 
	// Latte 클래스가 사용하기에는 부적절하다.
	
	// 이런 경우에는 taste 메소드를 다시 만들어서(오버라이드) 사용한다.
	// 1. 동일한 원형으로 만들어야 한다.
	// 2. 애너테이션 @Override 를 추가해 준다. (권장)
	
	// @Override의 역할
	// 1. 자바에게 이 메소드가 오버라이드 한 메소드임을 알린다.
	// 	오버라이드 규칙에 위배되면 에러가 발생한다. (개발자에게 도움을 주는 역할)
	// 2. 다른 개발자에게 오버라이드 한 메소드임을 알린다.
	
	@Override
	void taste() {
		System.out.println("부드럽다.");
	}
} 

public class Ex06_method_override {

	public static void main(String[] args) {
		
		Latte cafeLatte = new Latte("조지아", 100, 10);
		cafeLatte.taste();	// Latte 클래스의 taste 메소드가 호출된다.

	}

}
