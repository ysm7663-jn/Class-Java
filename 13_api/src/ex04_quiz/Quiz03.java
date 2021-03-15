package ex04_quiz;

import java.util.Calendar;
import java.util.Scanner;

// 문제. 10초 맞히기
// 시작할 때 Enter
// 종료할 때 Enter
// 그 사이의 시간을 초로 계산
// 예시)
// player1의 게임을 시작합니다.
// 준비되면 Enter를 누르세요.
// (Enter를 누르면) 현재 50초
// 10초가 된 것 같으면 Enter를 누르세요
// (Enter를 누르면) 현재 58초

// player2의 게임을 시작합니다.
// (Enter를 누르면) 현재 59초

// player1의 결과 : 8초, player2의 결과 : 9초, player2가 이겼습니다.

class GamePlayer {

	private Scanner sc = new Scanner(System.in); // Enter => sc.nextLine()
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int play() {
		System.out.println(name + "의 게임을 시작합니다.");

		System.out.println("준비되면 Enter를 누르세요.");

		sc.nextLine(); // Enter가 입력될 때까지 실행되지 않는 코드
		int start = Calendar.getInstance().get(Calendar.SECOND); // 시작 초(0 ~ 59)
		System.out.println("현재 " + start + "초");

		// 10초가 지나가는 중
		System.out.println("10초가 된 것 같으면 Enter를 누르세요");

		sc.nextLine();
		int end = Calendar.getInstance().get(Calendar.SECOND); // 종료 초(0 ~ 59)
		System.out.println("현재 " + end + "초");

		// end < start 경우는 end에 60을 더해서 처리한다.
		if (end < start)
			end += 60;

		// 결과한 초를 반환
		return end - start;
	}

}

class Game {

	private GamePlayer[] players;
	private Scanner sc = new Scanner(System.in);

	public Game(int playerCount) {
		players = new GamePlayer[playerCount];
	}

	public void setPlayers() {
		for (int i = 0; i < players.length; i++) {
			System.out.print("플레이어" + (i + 1) + "번 이름 입력 >> >");
			players[i] = new GamePlayer(sc.next());
		}
	}

	public void play() {
		// GamePlayer들의 play결과 받아서 비교
		int[] elapeseTimes = new int[players.length];

		for (int i = 0; i < players.length; i++) {
			elapeseTimes[i] = players[i].play();
		}

		// elapseTimes : 8 9
		// 10 - elapeseTimes의 절대값 : 2 1 -> 가장 작은 절대값
		// 절대값 : Math.abs(-5) == 5

		// 최소값 알고리즘
		// 1. 초기화 : 배열의 첫 번째 요소
		// 2. 알고리즘 : 최소값(min)보다 더 작은 배열 요소가 나타나면 최소값 변경

		int min = Math.abs(10 - elapeseTimes[0]);
		int winnerNo = 0; // min이 저장된 요소의 인덱스

		for (int i = 1; i < elapeseTimes.length; i++) {
			if (min > Math.abs(10 - elapeseTimes[i])) {
				min = Math.abs(10 - elapeseTimes[i]);
				winnerNo = i;
			}
		}
		for (int i = 0; i < players.length; i++) {
			System.out.print(players[i].getName() + "의 결과 : " + elapeseTimes[i] + "초, ");
		}
		System.out.println(players[winnerNo].getName() + "가 이겼습니다.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {

		Game game = new Game(3);

		game.setPlayers();
		game.play();

	}

}
