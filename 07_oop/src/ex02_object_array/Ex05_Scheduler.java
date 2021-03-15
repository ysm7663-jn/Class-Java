package ex02_object_array;

import java.util.Scanner;

//  하루 
class Day {

	// field
	String schedule; // 하루 스케쥴 1개, 기본값 null

	// constructor
	Day() {
		/* 내용이 없을 경우 한 줄로 끝내기 */}

	// method
	// 1. 스케쥴 확인
	String getSchedule() {
		return schedule;
	}

	// 2. 스케쥴 저장
	void setScehdule(String schedule) {
		this.schedule = schedule;
	}

	// 3. 스케쥴 출력
	void printDaySchedule() {
		if (schedule == null || schedule.isEmpty())
			System.out.println("없음");
		else
			System.out.println(schedule);
	}

}

// 일주일 스케쥴 
class WeekScheduler {

	// field
	int nthWeek; // 1주차 ~ n주차
	Day[] week;
	String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
	Scanner sc;

	// constructor
	WeekScheduler(int nthWeek) { // 주차
		this.nthWeek = nthWeek;
		// week 배열의 길이 7로 결정하기
		week = new Day[7];

		// Day 객체 7개 (스케쥴이 없는)생성해 두기
		for (int i = 0; i < week.length; i++)
			week[i] = new Day();

		// sc 생성
		sc = new Scanner(System.in);
	}

	// method
	// 1. 스케쥴 만들기 (스케쥴이 없으면 만들고, 있으면 취소)
	void makeSchedule() {
		boolean isExist = false; // 입력한 요일이 있으면 true, 없으면 false
		System.out.print("스케쥴을 등록할 요일(일 ~ 토) 입력 >> ");
		String choiceDay = sc.next();
		sc.nextLine();
		// week 배열 순회
		for (int i = 0; i < week.length; i++) {
			if (choiceDay.equals(weekName[i])) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.print("스케쥴 입력 >> ");
					String whatToDo = sc.nextLine(); // 스케쥴에 공백이 입력될 수 있다.
					week[i].setScehdule(whatToDo);
					System.out.println(choiceDay + "요일에 새 스케쥴이 저장되었습니다.");
				} else
					System.out.println(choiceDay + "요일은 이미 스케쥴이 있숩니다.");
				isExist = true;
				break;
			}
		}
		if (!isExist)
			System.out.println(choiceDay + "요일은 존재하지 않습니다. 다시 시도하세요");
	}

	// 2. 스케쥴 수정하기 (기존 스케쥴이 있으면 수정, 없으면 새로 등록)
	void changeSchedule() {
		boolean isExist = false;

		System.out.print("스케쥴을 수정할 요일(일~토) 입력 >> ");
		String choiceDay = sc.next();
		sc.nextLine();

		for (int i = 0; i < week.length; i++) {
			if (choiceDay.equals(weekName[i])) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName[i] + "요일은 스케쥴이 없습니다.");
					System.out.print("새 스케쥴을 등록하겠습니까(Y/N)? >> ");
					String answer = sc.next();
					sc.nextLine();

					if (answer.equalsIgnoreCase("Y")) { // answer.charAt(0) == 'Y' || answer.charAt(0) == 'y'
						System.out.print("새 스케쥴 입력 >> ");
						String newScedule = sc.nextLine();
						week[i].setScehdule(newScedule);
						System.out.println(choiceDay + "요일에 새 스케쥴이 저장되었습니다.");
					} else
						System.out.println("수정을 취소합니다.");
				} else {
					System.out.println("수정할 스케쥴을 확인합니다.");
					System.out.println(week[i].getSchedule());
					System.out.println("수정할까요(Y/N)? >> ");
					String choice = sc.next();
					sc.nextLine();

					if (choice.equals("Y")) {
						System.out.print("수정할 스케쥴 입력 >> ");
						String answer = sc.next();
						week[i].setScehdule(answer);
						System.out.println(choiceDay + "요일의 스케쥴이 수정되었습니다.");
					} else {
						System.out.println("수정을 취소합니다.");
						break;
					}
				}
				isExist = true;
				break;
			}
		}
		if (!isExist)
			System.out.println(choiceDay + "요일은 존재하지 않습니다. 다시 시도하세요");
	}

	// 3. 스케쥴 삭제하기 (기존 스케쥴이 있으면 삭제, 없으면 취소)
	void deleteSchedule() {
		boolean isExist = false; // 입력한 요일이 있으면 true, 없으면 false

		System.out.print("스케쥴을 삭제할 요일(일~토) 입력 >> ");
		String choiceDay = sc.next();
		sc.nextLine();

		for (int i = 0; i < week.length; i++) {
			if (choiceDay.equals(weekName[i])) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(choiceDay + "요일의 스케쥴이 없습니다.");
				} else {
					System.out.println("삭제할 스케쥴을 확인합니다.");
					System.out.println(week[i].getSchedule());
					System.out.println("삭제할까요(Y/N)? >> ");
					String choice = sc.next();
					sc.nextLine();

					if (choice.equalsIgnoreCase("Y")) {
						week[i].setScehdule(null);
						System.out.println(choiceDay + "요일의 스케쥴이 삭제되었습니다.");
					} else {
						System.out.println("취소되었습니다.");
						break;
					}
				}
				isExist = true;
				break;
			}

		}
		if (!isExist)
			System.out.println(choiceDay + "요일은 존재하지 않습니다. 다시 시도하세요");
	}
	// 4. 일주일 전체 스케쥴 출력하기 (요일별 스케쥴 출력)
	void printWeekSchedule() {
		System.out.println(nthWeek + "주차 스케쥴 안내");
		for (int i = 0; i < week.length; i++) {
			System.out.print(weekName[i] + "요일 : ");
			week[i].printDaySchedule();
			System.out.println();
		}
	}

	// 5. 프로그램 종료 (종료 명령 들어오면 종료, 아니면 계속)
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	// 6. 메뉴 출력
	void menu() {
		System.out.println();
		System.out.println("1. 스케쥴 만들기");
		System.out.println("2. 스케쥴 삭제하기");
		System.out.println("3. 스케쥴 수정하기");
		System.out.println("4. 스케쥴 전체 출력하기");
		System.out.println("0. 프로그램 종료 ");
		System.out.println();
	}

	// 7. 스케쥴러 실행
	void run() {
		while (true) {
			menu(); // 메뉴 보여주기
			System.out.println("메뉴 선택 >> ");
			int choice = sc.nextInt();
			sc.nextLine(); // 스트림에 남아있는 엔터 제거하기 위한 목적(Enter 읽어서 버림)

			switch (choice) {
			case 1:
				makeSchedule();
				break; // break는 swich문 종료
			case 2:
				deleteSchedule();
				break;
			case 3:
				changeSchedule();
				break;
			case 4:
				printWeekSchedule();
				break;
			case 0:
				exit();
				return; // run 메소드를 종료하는 방법(void 형태일때 return; 사용)
			default:
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}

		}
	}
}

public class Ex05_Scheduler {

	public static void main(String[] args) {

		WeekScheduler firstWeek = new WeekScheduler(1); // 1주차
		firstWeek.run();
	}

}
