package ex03_array_quiz;

import java.util.Arrays;

public class Quiz14 {

	public static void main(String[] args) {

		// 문제. 빙고
		// 5 * 5
		// 1. 1 ~ 25 사이 정수를 2차원 배열 bingo에 순차적으로 넣는다.
		// 2. shuffle
		// 1) 총 25번의 교환이 발생
		// 2) bingo[0][0] <-> 랜덤
		// bingo[0][1] <-> 랜덤
		// bingo[4][4] <-> 랜덤

		final int SIZE = 5;				// 상수 : 변치 않는 수
		
		int[][] bingo = new int[SIZE][SIZE];

		// 1 ~ 25 사이 정수 배열에 넣기

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = (i * 5) +(j + 1);
			}
		}
		
		/*
		    for(int [] a : bingo) 
			System.out.println(Arrays.toString(a));
			문자열 출력 class
		 */

		// 섞기
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				int x = (int) (Math.random() * 5);
				int y = (int) (Math.random() * 5);
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}

		// 출력
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
