package ex04_quiz;

import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {

		// 기념일 계산하기
		// Calendar 클래스 이용해 특정 기념일로부터
		// 며칠이 지났는지 출력하시오.

		// 시작 날짜
		Calendar anniversary = Calendar.getInstance();

		anniversary.set(1996, 2, 9);

		// 오늘 날짜
		Calendar today = Calendar.getInstance();
		
		// 두 날짜 차이 구하기
		// today - anniversary
		// getTimeInMillis() : Calender 타입 날짜 -> long 타입 숫자 (단위 : 
		long elapseTime = today.getTimeInMillis() - anniversary.getTimeInMillis();
		
		// 밀리초 -> 초 -> 분 -> 시 -> 일
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		System.out.println("경과한 일수는 " + elapseDay + "일 입니다.");

	}

}
