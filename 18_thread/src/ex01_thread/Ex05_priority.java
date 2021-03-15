package ex01_thread;

import java.util.Set;

class Moring {

}

class Dry extends Moring implements Runnable {

	@Override
	public void run() {
		System.out.println("머리를 말린다.");
	}

}

class WatchTV extends Moring implements Runnable {

	@Override
	public void run() {
		System.out.println("TV를 본다.");
	}

}

public class Ex05_priority {

	public static void main(String[] args) {

		// Thread의 우선 순위
//		System.out.println("가장 낮음 : " + Thread.MIN_PRIORITY);
//		System.out.println("가장 높음 : " + Thread.MAX_PRIORITY);
//		System.out.println("보통 : " + Thread.NORM_PRIORITY);

		// Dry dry = new Dry(); Runnable 생성 (new Dry()) 후 Thread 로 변환
		// Thread dryThread = new Thread(dry);
		Thread dry = new Thread(new Dry());
		Thread watchTV = new Thread(new WatchTV());

		// 스레드 스케줄링은 JVM이 담당하므로
		// dry, watchTV 중 무엇이 먼저 실행될 지 모른다.
		// 먼저 실행시키고자 하는 스레드의 우선 순위를 높여서
		// 최대한 원하는 결과를 얻을 수 있다.

		dry.setPriority(Thread.MAX_PRIORITY); // dry에 가장 높은 우선순위 부여

		// 스레드 시작
		watchTV.start();
		dry.start();

	}

}
