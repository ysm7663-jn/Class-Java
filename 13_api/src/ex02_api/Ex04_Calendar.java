package ex02_api;

import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {

		// 1. Calendar 클래스 타입의 객체 cal 셍성
		// new를 사용하지 않고
		// getInstance 메소드를 사용한다.
		// class method : static
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간을 생성

		// 2. 년, 월, 일
		System.out.println("년 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1)); // Calendar.MONTH : 0 ~ 11로 구성 -> +1 해줘야함
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));

		// 3. 요일의 번호
		// 일(1), 월(2), 화(3), ~ 토(7)
		System.out.println("요일 번호 : " + cal.get(Calendar.DAY_OF_WEEK));

		String[] weekName = { "", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(weekName[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		// 4. 오전/오후, 시, 분, 초
		System.out.println("오전/오후 : " + cal.get(Calendar.AM_PM));	// 오전(0), 오후(1)
		System.out.println("시(12시각) : " + cal.get(Calendar.HOUR));	// 0 ~ 11
		System.out.println("시(24시각) : " + cal.get(Calendar.HOUR_OF_DAY)); // 0 ~ 23
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		
		// 5. 다른 날짜와 시간으로 변경
		// 2020년 10월 05일 10시 30분 40초
		cal.set(2020, 9, 05, 10, 30, 40);
		// 한 줄씩 뽑아서 사용할 것
	}

}
