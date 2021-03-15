package ex03_array_quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		// 문제. 식당 대기표
		
		Scanner sc = new Scanner(System.in);
		
		
		int [][] a = new int [5][];
		
		// 행 : 각 팀
		// 열 : 팀별 예약 인원 수
		
		for(int i = 0; i < a.length; i++) {
			System.out.print((i+1) + "번 손님 예약 인원수 >> ");
			a[i] = new int[sc.nextInt()];
		}
		
		// 예약 현황
		for(int i = 0; i < a.length; i++) {
			System.out.print((i+1) + "번 : ");
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
