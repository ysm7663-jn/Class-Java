package ex02_user_type;

public class MainClass {

	public static void main(String[] args) {

		// Computer 객체 생성
		Computer myCom = new Computer();
		
		myCom.save("GRAM", "LG", 180);							// save 메소드 호출
	//	myCom.info();											// info 메소드 호출
		
		// Book 객체 생성
		Book mybook = new Book();
		
		mybook.setInfo("노인과바다", "허밍웨이", 15000, 10000);		// info 메소드에 값 저장
	//	mybook.print();											// Book클래스 print 메소드 실행
		
		// Person 객체 생성
		Person p = new Person();
		
		p.save("홍길동", 25, '남', 175.5, myCom, mybook);
		p.info();
 		
	}

}

// 동일한 패키지에서 같은 클래스명을 만들 수 없다.
// 패키지가 달라지면 같은 클래스명 사용 가능

// 모든 클래스 한 번에 저장 : Ctrl + Shift + s 