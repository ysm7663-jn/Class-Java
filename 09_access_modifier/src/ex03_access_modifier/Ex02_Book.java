package ex03_access_modifier;

class Book {
	private String title; // null
	private String author; // null
	private int price; // 0
	private int amount; // 0
	private boolean isBestSeller; // false

	// setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAmout(int amount) {
		this.amount = amount;
		setBestSeller(this.amount >= 1000);
	}

	// setter에서 is가 붙은 boolean일경우 is를 생략하여 작성한다.
	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}

	// getters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getprice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	// getter에서 boolean 데이터는 get를 쓰지 않고 그대로 작성한다.
	public boolean isBestSeller() {
		return isBestSeller;
	}

}

public class Ex02_Book {

	public static void main(String[] args) {

		Book myBook = new Book();

		myBook.setTitle("노인과 바다");
		myBook.setAuthor("허밍웨이");
		myBook.setPrice(35000);
		myBook.setAmout(10000);
		// setBestSeller를 할 필요가 없음.

		System.out.println(myBook.getTitle());
		System.out.println(myBook.getAuthor());
		System.out.println(myBook.getprice());
		System.out.println(myBook.getAmount());
		System.out.println(myBook.isBestSeller() ? "베스트셀러" : "일반도서");

	}

}
