package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		// 문제. 퀴즈 맞추기
		// 대한민국 수도 "서울", "seoul"
		// 몇번만에 맞혔는지 출력
		// 맞히면 "정답입니다.", 틀리면 "오답입니다."
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int cnt = 0;
		
		while (true) {
			System.out.print("대한민국의 수도는 >> ");
			str = sc.next();
			cnt++;
			
			if(str.equals("서울") || str.equalsIgnoreCase("seoul")) {
				System.out.println(cnt + "번 만에 정답입니다.");
				break;
			}
			
			System.out.println("오답입니다.");
			
		}
		
		sc.close();
		
	}

}
