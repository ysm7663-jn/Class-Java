package ex03_array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 문제. 길이가 5인 double 타입의 배열을 선언
		// 5개의 키(실수) 입력 받아서 배열에 저장, 출력
		
		Scanner sc = new Scanner(System.in);
		
		double [] arr = new double[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			System.out.println(arr[i]);
		}
		
		
		
	}

}
