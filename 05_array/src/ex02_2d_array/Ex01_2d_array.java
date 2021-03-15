package ex02_2d_array;

import java.util.Scanner;

public class Ex01_2d_array {

	public static void main(String[] args) {
		
		/*
		 * 고정형 2차원 배열
		 * 1. 2차원 배열은 "테이블(표)" 형태로 이해
		 * 2. 고정형이란 행과 열이 고정된 2차원 배열
		 * 3. 선언 방법
		 * 		int[][] a = new int[i][j];
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [][] a = new int[3][2];
		
		// 2차원 배열의 접근(순회) 방식은 "행 우선(row major)" 
		// 행 인덱스 : i
		// 열 인덱스 : j
		
		for(int i = 0; i < a.length; i++) {				// 행 순회, a.length = 행 갯수
			for(int j = 0; j < a[i].length; j++) {		// 열 순회, a[i].length = 열 갯수
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
