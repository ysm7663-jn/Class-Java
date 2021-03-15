package ex01_thread;

// Thread일 때
class Pistol extends Thread {

	private String model;
	private int bullet;

	public Pistol(String model, int bullet) {
		super();
		this.model = model;
		this.bullet = bullet;
	}

	// thread 작업은 run() 메소드의 오버라이드
	@Override
	public void run() {
		for (int i = 1; i <= bullet; i++) {
			System.out.println(model + "(" + i + "발 쐈다.)");
			try {
				sleep(500); // 0.5초 딜레이
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

public class Ex03_multi_thread {

	public static void main(String[] args) {

		// Thread인 pistol들은 각자 독립적으로 샐행된다.
		// 2개의 pistol을 동시에 실행시킬 수 있다.
		Pistol gun1 = new Pistol("콘트", 6);
		Pistol gun2 = new Pistol("베레타", 10);

		// 스레드 실행 메소드는 start() 이다.
		gun1.start();
		gun2.start();

	}

}
