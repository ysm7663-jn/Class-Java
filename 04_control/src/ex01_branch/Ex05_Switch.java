package ex01_branch;

import java.util.Random;

public class Ex05_Switch {

	public static void main(String[] args) {

		
		int cmd = (int)(Math.random() * 5) + 1;		// 1 ~ 5 랜덤 cmd 생성
		
		switch (cmd) {
		
		case 1: System.out.println("삽입"); break;
		
		case 2: System.out.println("수정"); break;
		
		case 3: System.out.println("검색"); break;
		
		case 4: System.out.println("삭제"); break;
		
		case 5: System.out.println("종료"); break;
		
		}
	}

}
