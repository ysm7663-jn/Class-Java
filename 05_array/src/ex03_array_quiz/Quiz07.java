package ex03_array_quiz;

public class Quiz07 {

	public static void main(String[] args) {

		// 문제. 윷 던지기
		// 한 번 던져 나온 수 만큼 움직임

		String[] yut = { "", "도", "개", "걸", "윷", "모" };

		int sum = 0;

		while (true) {

			// 던지고
			int move = (int) (Math.random() * 5) + 1;
			System.out.print("\"" + yut[move] + "\"");

			sum += move;

			// 도, 개, 걸이면 보여주고 끝
			if (move <= 3) {
				System.out.println(", " + sum + "칸 이동한다.");
				break;
			}

			// 윷, 모이면 while 처음부터 다시 돌리기
			else {
				System.out.print(", ");
				continue;
			}

		}

	}

}
