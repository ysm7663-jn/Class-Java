package ex01_inheritance;

// 슈퍼 클래스
class Mother {
	
	// constructor
	Mother() {
		System.out.println("엄마가 태어났다.");
	}
	
}

// 서브 클래스
class Daughter extends Mother {
	
	// super
	// 1. 슈퍼클래스의 참조 값이다.
	// 2. super의 활용 
	//  1) 멤버 : super.필드,    super.메소드()
	//  2) 생성자 : super()
	
	
	// constructor
	Daughter() {
		
		// "반드시" 슈퍼 클래스의 constructor가 먼저 호출되어야 한다.
		// 단, 디폴트 생성자(매개변수가 없음)는 생략이 가능하다. 자동으로 생성 가능 
		
		super();	// 슈퍼클래스의 constuctor 호출 방법
		
		System.out.println("딸이 태어났다.");
	}
}

public class Ex04_consturtor {

	public static void main(String[] args) {
		
		// 서브 클래스만 생성한다.
		
		@SuppressWarnings("unused")		// 애너테이션, unused 가지고 경고 띄우지 마라
		Daughter d = new Daughter();	// 서브클래스의 constructor를 호출하면, 
										// 실제로는 슈퍼클래스의 constructor가 함께 호출된다.
		
		
				
		
		

	}

}
