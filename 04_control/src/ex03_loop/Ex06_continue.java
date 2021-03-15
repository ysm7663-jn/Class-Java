package ex03_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue 문
		// 실행 중인 loop문으로 되돌아 감
		
		// 1. 1 ~ 10 사이 정수 중에서 4 ~ 6만 "제외"하고 출력
		
		for(int i = 1; i <= 10; i++) {
			
			if(i >= 4 && i <= 6)
				continue;
			
			System.out.println(i);
		}
		
		
		// 2. 애들 밥 먹이기
		// 김치 빼고 5번 먹이기
		// 김치는 안 먹음, 나머진 먹는다
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		int i = 1;
		
		while (i <= 5) {
			
			// for(int i = 1; i <= 5; i++) {
			
			System.out.print("먹을 반찬 입력 >> ");
			str = sc.next();
			
//			if(str.equals("김치")) {
//				System.out.println("매운 거 안 먹어요");
//				i--;
//				continue;
//			}
			
			if(str.equals("김치")) {
				System.out.println("매운 거 안 먹어요");
				continue;
			}
			
			System.out.println(str + " 잘 먹겠습니다.");
			i++;
		}
		
		sc.close();
			

	}

}
