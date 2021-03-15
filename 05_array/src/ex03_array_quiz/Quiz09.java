package ex03_array_quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		// 문제. 2행 3열의 정수 타입 2차원 배열을 선언
		// 값을 입력 받아 저장한 뒤 출력

		Scanner sc = new Scanner(System.in);

		int[][] a = new int[2][3];

		int j;

		for (int i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.println((i + 1) + "행 " + (j + 1) + "열의 값 입력 >> ");
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
			sc.close();
	}

}
