package ex03_method;

/*
 * 메소드 오버로딩 (method overloading)
 * 
 * 1. 메소드명이 같은 메소드를 여러 개 만들 수 있다.
 * 2. 반드시 매개변수가 달라야 한다.
 * 3. 결과타입은 전혀 상관 없음
*/

// 코드 재활용 장점 : 유지보수가 유리

class Book {
	
	// field 
	String title;			// 초기화 : null
	String author;			// 초기화 : null
	int price;				// 초기화 : 0
	
	// method
	
	// 1. 필드 정보 저장 메소드
	void setInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// 2. 필드 정보 저장 메소드
	void setInfo(String title, int price) {
		setInfo(title, "미상", price);
	}
	
	// 3. 필드 정보 저장 메소드
	void setInfo(String title, String author) {
		setInfo("겨울왕국", "박철수", 0);
	}
	
	// 4. 필드 정보 출력 메소드
	void Info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
	}
}


public class Ex03_method_overloading {

	public static void main(String[] args) {

		Book book1 = new Book();
		
		book1.setInfo("노인과 바다", "허밍웨이", 18000);
		book1.Info();
		
		Book book2 = new Book();
		book2.setInfo("미녀와 야수", 15000);
		book2.Info();
		
		Book book3 = new Book();
		book3.setInfo("겨울왕국", "박철수");
		book3.Info();
		
				
		
		
	}

}
