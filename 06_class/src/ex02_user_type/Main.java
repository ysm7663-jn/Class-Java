package ex02_user_type;

public class Main {

	public static void main(String[] args) {
		
		// Computer 객체 생성
		Computer myCom = new Computer();
		myCom.model = "GRAM";
		myCom.manufacturer = "LG";
		myCom.price = 180;
		
		// Book 객체 생성
		Book myBook = new Book();
		myBook.title = "노인과 바다";
		myBook.author = "허밍웨이";
		myBook.price = 18000;
		myBook.amount = 1000000;
		myBook.isBestSeller = myBook.amount >= 1000;
		
		// Person 객체 생성
		Person p = new Person();
		p.name = "홍길동";
		p.age = 25;
		p.gender = '남';
		p.height = 175.5;
		p.isAdult = p.gender >= 20;
		p.computer = myCom;
		p.book = myBook;
		
		// 출력
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.height);
		System.out.println(p.isAdult ? "성인" : "미성년자");
		System.out.println(p.computer.model);
		System.out.println(p.computer.manufacturer);
		System.out.println(p.computer.price);
		System.out.println(p.book.title);
		System.out.println(p.book.author);
		System.out.println(p.book.price);
		System.out.println(p.book.amount);
		System.out.println(p.book.isBestSeller ? "베스트셀러" : "일반 도서");
	}

}

