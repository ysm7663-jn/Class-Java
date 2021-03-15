package ex01_thread;

// 엄마 : 거실 청소 (thread)
// 아빠 : 방 청소 (thread)
// 청소도구 1개 (스레드에서 사용하는 자원)

// 사이좋게 한 번씩 Cleaner를 사용하도록
// 메소드 실행 (사용)중에는 가져가지 못하도록 synchronized 처리
// synchronized 
// 임계 영역 (critical section)
// 공유 데이터를 관리하기 위해서 한 번에 한 스레드에 접근만 허용하는 영역 (청소기)

class Cleaner {

	public synchronized void livingRoomCleaning() throws Exception {
		System.out.println("거실청소 중");
		System.out.println("거실청소 완료");
		notify(); // 거실청소 끝났다고 다른 스레드(Papa)에게 알린다. 그럼 Papa가 가져감	// Object꺼
		System.out.println("방 청소 끝날때까지 기다리는 중");
		wait();	// Object꺼
	}

	public synchronized void roomCleaning() throws Exception {
		System.out.println("방청소 중");
		System.out.println("방청소 완료");
		notify(); // 방청소 끝났다고 다른 스레드(Mama)에게 알린다. 그럼 Mama가 가져감
		System.out.println("거실 청소 끝날때까지 기다리는 중");
		wait();
	}

}

class Mama extends Thread {

	private Cleaner cleaner;

	// constructor

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				cleaner.livingRoomCleaning(); // 엄마는 거실청소기능 사용
			} catch (Exception e) {
			}
		}
	}

}

class Papa extends Thread {

	private Cleaner cleaner;

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				cleaner.roomCleaning(); // 아빠는 방청소 기능 사용
			} catch (Exception e) {
			}
		}
	}

}

public class Ex07_synchronized {

	public static void main(String[] args) {

		// Cleaner 1개
		Cleaner cleaner = new Cleaner();

		// 스레드 2개
		Mama mama = new Mama();
		Papa papa = new Papa();

		mama.setCleaner(cleaner); // 엄마 청소기 들고,
		mama.start(); // 청소 시작

		papa.setCleaner(cleaner); // 아빠 청소기 들고,
		papa.start(); // 청소 시작

	}

}
