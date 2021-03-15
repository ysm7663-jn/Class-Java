package ex01_oop;

class Book {

	// field
	String title;
	String author;

	// constructor

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	Book(String title) {
		this(title, "미상");
	}

	// method
	void info() {
		System.out.println(title + ", " + author);
	}

}

class Person {

	// field
	String name;
	Book book;

	// constructor
	Person(String name, String title, String author) {
		this.name = name;
		this.book = new Book(title, author);
	}

	Person(String name, String title) {
		this.name = name;
		this.book = new Book(title);
		// 방법 2. 다른 생성자를 이용 : this 이용
		// this(name, title, "미상"); // 첫번째 자리가 아니기 때문에 오류, this는 맨 앞이여야 함
	}

	Person(String name, Book book) {
		this.name = name;
		this.book = book;
	}

	// method
	void info() {
		System.out.print(name + ", ");
		book.info();
	}
}

public class Ex03_Person {

	public static void main(String[] args) {

		Person p1 = new Person("짱구", "자바책", "김영희");
		Person p2 = new Person("철수", "홍길동전");
		Person p3 = new Person("맹구", new Book("스프링5", "김철수"));
		Person p4 = new Person("유리", new Book("구미호전"));

		p1.info(); // 짱구, 자바책, 김영희
		p2.info(); // 철수, 홍길동전, 미상
		p3.info(); // 맹구, 스프링5, 김철수
		p4.info(); // 유리, 구미호전, 미상

	}

}
