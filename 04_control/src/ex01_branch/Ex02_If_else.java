package ex01_branch;

public class Ex02_If_else {

	public static void main(String[] args) {

		// if - else문
		// 1. 조건식의 결과가 true 일 때와 false일 때 실행할 코드 작성
		// 2. 형식
		// if (조건식) {
		//		실행문1; 
		//	} else {
		//		실행문 2;
		//	}
		
		int genderNum = 1;
		// 정상적인 코드
		if(genderNum %  2 == 0)
			System.out.println("여자");
		else
			System.out.println("남자");
		
		// 안 좋은 코드
		if(genderNum %  2 == 0)
			System.out.println("여자");
		
		if(genderNum %  2 == 1)
			System.out.println("남자");
		
	}

}
