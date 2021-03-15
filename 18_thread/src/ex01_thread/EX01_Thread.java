package ex01_thread;

/*
 * 스레드 (Thread)
 * 
 * 1. 세부 실행 단위이다.
 * 2. 한 작업을 구성하는 여러 스레드가 존재할 수 있다.
 * 3. 자바 스레드는 JVM에 의해 실행되는 단위이다.
 * 4. 자바는 스레드만 존재한다. (상위 작업은 다루지 않는다.)
 *
 * 스레드 생성 방법
 * 1. Thread 클래스를 상속 받는다. 
 * 2. Runnable 인터페이스를 구현한다. (다중 상속이 안 되기 때문에 기존에 상속 받은 상태이면 구현을 활용해야 한다.)
 */

class Process extends Thread {

	private String processName;

	public Process(String processName) {
		super();
		this.processName = processName;
	}

	// 스레드는 수행 작업을 run() 메소드를 오버라이드 한다.
	@Override
	public void run() {
		// 스레드 동작을 보기 위해서
		// 오래 실행시켜 본다.
		// sleep(); // 밀리초 지정 : Thread 클레스에 있는 일시 중지 메소드
		// sleep(1000) : 1초간 일시 중지
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(processName);
				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class EX01_Thread {

	public static void main(String[] args) {

		Process process = new Process("나의 첫 스레드");
		
		// process 객체는 run() 메소드를 가지고 있지만,
		// run() 메소드는 직접 호출하지 말고,
		// start() 메소드를 스레드를 시작한다.
		// 그럼 자동으로 run() 메소드가 호출된다.
		process.start();
		
		System.out.println("main 스레드는 종료합니다.");
		
		
	}

}
