package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 입력 받은 구구단만 출력
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 9; i++)
			System.out.println(n + " * " + i + " = " + (n * i));
		
		
		
		sc.close();

	}

}