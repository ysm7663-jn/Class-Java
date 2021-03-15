package ex02_user_type;

//필드
public class Book {

	String title;
	String author;
	int price;
	int amount;
	boolean isBestSeller;

// 메소드
// 1. 필드 정보 출력 메소드
// 1) 결과타입 : void
// 2) 메소드명 : print
// 3) 매개변수 : 없음
	void print() {
		System.out.println("책 제목 : " + title);
		System.out.println("책 저자 : " + author);
		System.out.println("책 가격 : " + price + "원");
		System.out.println("판매량  : " + amount + "권");
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}

// 2. 필드 정보를 저장하는 메소드
// 1) 결과타입 : void
// 2) 메소드명 : setInfo
// 3) 매개변수 : String t, String au, int p, int am

	void setInfo(String t, String au, int p, int am) {
		title = t;
		author = au;
		price = p;
		amount = am;
		isBestSeller = am >= 1000;

	}
}
