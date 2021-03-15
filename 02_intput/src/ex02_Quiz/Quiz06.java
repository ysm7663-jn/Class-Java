package ex02_Quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		// 문제. 주민등록번호를 하이픈(-) 없이 입력 받아서
		// "남자", "여자" 구분하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 >> ");
		String strId = sc.next();
		
		// strId	정수(코드값)
		//	'1'			49
		//	'2'			50
		//	'3'			51
		//	'4'			52
		
		// 대표 코드값
		//	'0'			48
		//	'A'			65
		//	'a'			97

		System.out.println(strId.charAt(6) % 2 == 1 ? "남자" : "여자");
		
		
		
		System.out.print("주민등록번호를 입력하세요 >> ");
		long sn = sc.nextLong();
		
		long snum = sn / 1000000 % 10;
		String sm = snum % 2 == 0 ? "여자" : "남자)";
		
		System.out.println(snum);
			
			
		sc.close();
		
	}

}
