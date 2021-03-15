package ex04_constuctor;

/*
 *  this() : 자신의 생성자
 *  
 *  다른 코드보다 먼저 호출되어야 한다.
 *  
 */

class Book {

	String title;
	String author;
	int price;

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	Book(String title, int price) {
		this(title, "미상", price);
	}


	Book(String title, String author) {
		this(title, author, 0);
	}

	void info() {
		System.out.println("제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + "원");

	}

}

public class Ex02_Book {

	public static void main(String[] args) {

		Book book1 = new Book("스프링5", "최범균", 26500);
		Book book2 = new Book("홍길동전", 15000);
		Book book3 = new Book("좋은생각", "박철수");

		book1.info();
		book2.info();
		book3.info();

	}

}
