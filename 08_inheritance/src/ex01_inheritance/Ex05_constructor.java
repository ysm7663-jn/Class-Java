package ex01_inheritance;

// 슈퍼클래스
class Father {

	// field
	String fName;

	// constructor
	Father(String fName) {
		this.fName = fName;
	}

}

// 서브클래스
class Son extends Father {

	// feild
	String sName;

	// constructor
	Son(String fName, String sName) {

		// "반드시" 슈퍼클래스의 constructor를 호출해야 한다.
		super(fName); // Father(String fName( { ... } 호출

		this.sName = sName;

	}
	
	void sonInfo() {
		System.out.println("아빠 이름 : " + fName);
		System.out.println("아들 이름 : " + sName);
	}

}

public class Ex05_constructor {

	public static void main(String[] args) {

		Son s = new Son("철수", "짱구");
		s.sonInfo();
		
	}

}
