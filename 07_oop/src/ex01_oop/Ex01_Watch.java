package ex01_oop;

class Watch {

	int hour; // 0 ~ 23
	int minute; // 0 ~ 59
	int second; // 0 ~ 59

	// 반복되는 숫자 구하는 방법 : 범위보다 하나 큰 수로 나누기 처리

	Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// method

	void addHour(int hour) {
		if (hour < 0)
			return; // 애초에 -시간은 고려대상이 아니기 때문에, 결과타입이 void인 경우 리턴 자체를 고려하지 않는다. -> 메소드의 종료를 의미
		this.hour += hour;
		this.hour %= 24;
	}

	void addMinute(int minute) {
		if (minute < 0)
			return;
		this.minute += minute;
		addHour(this.minute / 60);
		this.minute %= 60;
	}

	void addSecond(int second) {
		if (second < 0)
			return;
		this.second += second;
		addMinute(this.second / 60);
		this.second %= 60;
	}

	
	void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

}

public class Ex01_Watch {

	public static void main(String[] args) {

		Watch watch = new Watch(16, 15, 30);

		watch.addHour(25); // 25시간 후(1시간 후), 17시
		watch.addMinute(61); // 61분 후(1시간 1분 후)
		watch.addSecond(3661); // 3661초 후(1시간 1분 1초 후)

		watch.see(); // 19시 17분 31초

	}

}
