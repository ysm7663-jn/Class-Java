package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		//문제. 가위,바위,보
		//실행
		// 가위바위보 >> "  "
		//결과
		// 당신은 가위, 컴퓨터는 보, 이겼습니다.
		// 가위 = 0, 바위 = 1, 보 = 2
		
		// 이겼다 = 1, 졌다 = 2, 비겼다 = 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위바위보 >> ");
		String my = sc.next();
	
		int result = 0;
		
		int com = (int)(Math.random() * 3);
		
		String comChoice = " ";
		
		switch (com) {
		case 0: comChoice = "가위"; break;
		case 1: comChoice = "바위"; break;
		case 2: comChoice = "보";
		}
		
		if(my.equals("가위") && comChoice.equals("바위")) 
			result = 2;
		
		else if (my.equals("가위") && comChoice.equals("보"))
			result = 1;
		
		else if (my.equals("바위") && comChoice.equals("보"))
			result = 2;
		
		else if (my.equals("바위") && comChoice.equals("가위"))
			result = 1;
		
		else if (my.equals("보") && comChoice.equals("가위"))
			result = 2;
		
		else if (my.equals("보") && comChoice.equals("바위"))
			result = 1;
		
		else
			result = 3;

		switch (result) {
		case 1: System.out.println("당신은 " + my + ", 컴퓨터는 " + comChoice + ", 이겼습니다"); break;
		case 2: System.out.println("당신은 " + my + ", 컴퓨터는 " + comChoice + ", 졌습니다"); break;
		case 3: System.out.println("당신은 " + my + ", 컴퓨터는 " + comChoice + ", 비겼습니다");
		}
		
		
		

	}

}

