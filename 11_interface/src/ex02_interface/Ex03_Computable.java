package ex02_interface;

// 인터페이스 이름은 "~할 수 있는"이라는 이름을 종종 사용한다.

// 상속(extends)과 구현(implements)을 동시에 진행할 수 있다.
// 1. 상속은 다중 상속(2개 이상 클래스를 상속)이 불가능하다.
// 2. 자바의 다중 상속은 "상속+구현"으로 진행할 수 있다. 

// 상속 먼저, 구현 나중

class Phone {
	// field
	private String owner;
	// constructor
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	// method
	public void sendCall() {
		System.out.println(owner + "의 전화 걸기");
	}
	public void receiveCall() {
		System.out.println(owner + "의 전화 받기");
	}
}


interface Computable {
	public abstract void playGame();
	public abstract void playMusic();
}


// 상속 먼저, 구현 나중

class SmartPhone extends Phone implements Computable {

	// constructor
	public SmartPhone(String owner) {
		super(owner);
	}

	// method
	@Override
	public void playGame() {
		System.out.println("게임을 한다.");
	}
	@Override
	public void playMusic() {
		System.out.println("음악을 듣는다.");
	}
	
}

public class Ex03_Computable {
	public static void main(String[] args) {
		// 1. Phone타입으로 저장
		//    Phone 클래스의 메소드만 보임, Computable의 메소드는 캐스팅 후에 호출
		Phone phone1 = new SmartPhone("에밀리");
		phone1.sendCall();
		phone1.receiveCall();
		((Computable)phone1).playGame();
		((Computable)phone1).playMusic();
		// 2. Computable타입으로 저장
		//    Computable 인터페이스의 메소드만 보임, Phone의 메소드는 캐스팅 후에 호출
		Computable phone2 = new SmartPhone("앨리스");
		((Phone)phone2).sendCall();
		((Phone)phone2).receiveCall();
		phone2.playGame();
		phone2.playMusic();
		// 3. SmartPhone타입으로 저장
		SmartPhone phone3 = new SmartPhone("아만다");
		phone3.sendCall();
		phone3.receiveCall();
		phone3.playGame();
		phone3.playMusic();
	}
}