package ex03_array_quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {

		// 문제. 로또

		Scanner sc = new Scanner(System.in);

		System.out.print("금액 >> ");
		int num = sc.nextInt();

		int[][] lotto = new int[num / 1000][6];

		for (int i = 0; i < lotto.length; i++) {
			// 45개 숫자에서 랜덤하게 빼서 lotto[i][j]에 저장
			int ballCount = 45;
			int[] ball = new int[ballCount];

			// 1 ~ 45 순차적으로 생성
			for (int j = 0; j < ball.length; j++) {
				ball[j] = j + 1;
			}
			
			// ball 배열에서 6개를 lotto[i][j] 보내기
			for(int j = 0; j < lotto[i].length; j++) {
				int rand = (int)(Math.random() * ballCount);	// 0 ~ 44, ball 배열의 인덱스
				
				lotto[i][j] = ball[rand];						// 로또 번호에 작성
				int lastIdx = 44 - j;							// 마지막 ball 배열에서 빼기
				if(rand != lastIdx) {
					ball[rand] = ball[lastIdx];					// 사용한 볼 자리에 마지막 수 넣기
				}
				ballCount--;
			}
			
		}

		// 정렬
		for(int [] line : lotto) {
			// line 오름차순 정렬
			Arrays.sort(line);
			for(int n : line) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}

}
