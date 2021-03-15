package ex02_object_array;

import java.util.Scanner;

class Seat { // 좌석 1개

	String name; // 앉는 사람 이름

	Seat() {
		// Seat 생성 모습 : new Seat(), 빈 좌석 생성
	};

	// 1. 좌석 확인
	String getName() {
		return name;
	}

	// 2. 좌석 예약
	void reserve(String name) {
		this.name = name;
	}

	// 3. 좌석 예약 취소
	void cancel() {
		name = null;
	}

	// 4. 좌석 예약 여부 확인
	boolean isOccupied() {
		if (name == null)
			return false;
		else
			return true;
	}

	// 5. 좌석 예약자 확인
	boolean match(String name) {
		return this.name.equals(name); // 같은 이름이면 true, 다르면 false
	}

}

class SeatGroup { // 등급별 좌석 (S, A, B)

	char seatType; // 'S', 'A', 'B'
	Seat[] seats; // 좌석이 몇 개인지
	Scanner sc = new Scanner(System.in);

	SeatGroup(char seatType, int nSeats) {
		this.seatType = seatType;
		seats = new Seat[nSeats]; // 좌석의 개수만 설정

		for (int i = 0; i < seats.length; i++) { // 빈좌석 배열 생성
			System.out.print("" + seatType + (i + 1) + " "); // 앞에 "" 붙이는 이유 : String으로 인식하기 때문, 안 붙이면 seatType + i(정수)로
																// 인식
			seats[i] = new Seat();
		}
		System.out.println();
	}

	// 1. 좌석 예약
	boolean reserve() { // 성공하면 true, 실패하면 false

		// 전체 좌석 예약 현황 출력
		seatGroupInfo();

		// 시트번호 (seatNo)는 seats 배열의 인덱스보다 1이 크다.
		System.out.print("시트번호 입력 >> ");
		int seatNo = sc.nextInt();

		// 시트번호의 유효범위 : 1 ~ seats.length
		if (seatNo > seats.length || seatNo < 1) {
			System.out.println(seatNo + "번 좌석은 없는 번호입니다. 예약을 마칩니다.");
			return false;
		}

		// 시트번호의 유효번호 : isOccupied 메소드 호출
		if (seats[seatNo - 1].isOccupied()) {
			System.out.println(seatNo + "번 좌석은 이미 예약된 좌석입니다. 예약을 마칩니다.");
			return false;
		}

		// 예약 진행 : 예약할 좌석 (Seat 객체)는 seats[seatNo - 1]이다.
		System.out.print("예약자 이름 입력 >> ");
		String name = sc.next();

		seats[seatNo - 1].reserve(name); // Seat 클래스의 reserve() 메소드 호출
		System.out.println("예약이 완료되었습니다.");
		return true;

	}

	// 2. 좌석 예약 취소
	boolean cancle() { // 취소 되면 true, 실패하면 false

		// 전체 좌석 예약 현황 출력
		seatGroupInfo();

		// 이름으로 취소
		System.out.print("예약 취소자의 이름 입력 >> ");
		String name = sc.next();

		for (int i = 0; i < seats.length; i++) {
			if (seats[i].getName() != null) {		// 이름이 있는 좌석만 취소자의 이름 비교를 한다.
				if (seats[i].match(name)) { // seats[i].equals(name)
					seats[i].cancel();
					System.out.println("예약 취소가 완료되었습니다.");
					return true;
				}
			}
		}
		System.out.println("동일한 얘약 이름이 없습니다."); // for문 안에 있을 경우 한 사람만 확인하고 return false를 실행 후 종료
		return false;
	}

	// 3. 예약 현황 출력
	void seatGroupInfo() {

		System.out.print(seatType + " : ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied())
				System.out.print(seats[i].getName().substring(0, 1) + "*  ");
			else
				System.out.print((i + 1) + (i < 9 ? "   " : "  "));
		}
		System.out.println(); // 줄바꿈
	}

}

// 콘서트 장
class ConcertHall {

	String hallName;
	SeatGroup[] seatGroup = new SeatGroup[3]; // seatGroup 배열의 길이만 설정
	Scanner sc = new Scanner(System.in);
	char[] seatTypes = { 'S', 'A', 'B' };
	int[] seatCount = { 10, 10, 10 };

	ConcertHall(String hallName) {
		this.hallName = hallName;
		for (int i = 0; i < seatTypes.length; i++) {
			seatGroup[i] = new SeatGroup(seatTypes[i], seatCount[i]);
		}
	}

	// 1. 예약
	void reserve() {
		// 예매 타입을 입력 받아서 예매 진행
		System.out.print("예약할 예매 타입 입력(S: 1, A: 2, B: 3) >> ");
		int choice = sc.nextInt();
		// 예매타입 유효범위 (1 ~ seatGroup.length)
		if (choice < 1 || choice > seatGroup.length) {
			System.out.println("없는 좌석 타입입니다.");
			return; // reserve() 메소드 종료
		}

		// choice == 1 : seatGroup[0]
		// choice == 2 : seatGroup[1]
		// choice == 3 : seatGroup[2]
		// choice - 1이 seatGroup 배열의 인덱스이다
		seatGroup[choice - 1].reserve();

	}

	// 2. 예약 취소
	void cancel() {
		// 예매 타입을 입력 받아서 예매 취소 진행
		System.out.print("취소할 예매 타입 입력(S: 1, A: 2, B: 3) >> ");
		int choice = sc.nextInt();
		// 예매타입 유효범위 (1 ~ seatGroup.length)
		if (choice < 1 || choice > seatGroup.length) {
			System.out.println("없는 좌석 타입입니다.");
			return; // cancel() 메소드 종료
		}
		// 예약 취소
		seatGroup[choice - 1].cancle();
	}

	// 3. 전체 예매 현황 출력
	void concertHallInfo() {
		for (int i = 0; i < seatGroup.length; i++) {
			seatGroup[i].seatGroupInfo();
		}
		System.out.println();
	}

	// 4. 종료
	void exit() {
		System.out.println(hallName + "예약 시스템을 종료합니다.");
		sc.close();
	}

	// 5. 실행
	void run() {
		System.out.println(hallName + " 예약 시스템입니다.");
		while (true) {
			System.out.print("1. 예약   2. 취소   3. 출력   4. 종료 >>");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				reserve();
				break;
			case 2:
				cancel();
				break;
			case 3:
				concertHallInfo();
				break;
			case 4:
				exit();
				return; // run() 메소드의 실행 종료
			default:
				System.out.println("존재하지 않는 명령입니다. 다시 시도하세요.");
			}

		}
	}

}

public class Ex06_Concert {

	public static void main(String[] args) {

		ConcertHall hall = new ConcertHall("체조경기장");
		hall.run();

	}

}
