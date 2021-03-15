package ex02_user_type;

/*
 * 메소드
 * 1. 클래스 내부에 추가하는 함수(메소드)
 * 2. 메소드를 만드는 것을 "메소드 정의"라고 한다.
 * 3. 메소드 정의
 * 	결과타입   메소드이름(매개변수)   {
 * 			본문
 * 			return 결과;			// 결과가 없으면 생략
 * 	}
 */

// 결과 타입(int, double, void ...) 메소드 이름 ( 매개변수(외부에서 데이터가 들어올 때 연결해주는 매개체, 외부에서 데이터가 들어오는게 없을 경우 생략 가능)  ) {   실행문     }

public class Computer {
	
	// 필드
	String model;
	String manufacturer;
	int price;
	
	// 메소드
	// 1. 필드 정보를 출력하는 메소드
	// 	1) 결과타입     : void (없다)
	//	2) 메소드명     : info (개발자 마음대로)
	//	3) 매개변수     : 없다    (외부에서 전달되는 값이 없다) 
	
	void info() {
		System.out.println("컴퓨터 모델 : " + model);
		System.out.println("컴퓨터 제조사 : " + manufacturer); 
		System.out.println("컴퓨터 가격 : " + price);
	}
	
	// 2. 외부로부터 컴퓨터 정보를 받아서 필드에 전달하는 메소드
	//	1) 결과타입 : void 
	//	2) 메소드명 : save
	//	3) 매개변수 : String mo, String ma, int p (외부에서 save를 호출할 때는 2개 String 1개 int를 순서대로 전달해야 한다.
	
	void save(String mo, String ma, int p) {
		model = mo;
		manufacturer = ma;
		price = p;
	}
	

}

