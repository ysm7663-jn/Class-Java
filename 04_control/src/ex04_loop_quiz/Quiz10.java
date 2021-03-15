package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {

		// 문제. Up & Down 게임
		// 범위 : 1 ~ 10000 사이 난수 하나 발생시키고
		// 해당 난수를 맞히는 게임
		// 입력마다 "Up!" , "Down!"

		int num = (int) (Math.random() * 10000) + 1;
		
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		int n;
	
		do {
			System.out.print("입력 >>> ");
			n = sc.nextInt();

			cnt++;

			if(n <= 0 || n > 10000) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			if (n == num) 
				System.out.println("정답입니다. 총 " + cnt + "번 만에 성공");
			
			else if (n > num) 
				System.out.println("Down!");
			
			else 	
				System.out.println("Up!");

		} while (n != num);  
	
		
		
	}

}
