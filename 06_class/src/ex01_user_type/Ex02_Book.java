package ex01_user_type;

class Book {

	// 필드는 자동으로 초기화 됨
	String title;			// null
	String author;			// null
	int price;				// 0
	int amout;				// 0
	boolean isBestSeller;	// false

}

public class Ex02_Book {

	public static void main(String[] args) {

		// 클래스 Book
		// 제목, 저자, 가격, 판매량, 베스트셀러 유무(판매량이 1,000이상 베스트셀러)

		Book myBook = new Book();

		myBook.title = "노인과 바다";
		myBook.author = "허밍웨이";
		myBook.price = 35000;
		myBook.amout = 10000;
		myBook.isBestSeller = myBook.amout >= 1000;

		System.out.println(myBook.title);
		System.out.println(myBook.author);
		System.out.println(myBook.price);
		System.out.println(myBook.amout);
		System.out.println(myBook.isBestSeller ? "베스트셀러" : "일반도서");

	}

}
