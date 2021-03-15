package ex01_branch;

public class Ex04_Switch {

	public static void main(String[] args) {

		/*
		 * switch문
		 * 1. 표현식의 결과에 따라 실행을 구분
		 * 2. 형식
		 * 		switch (표현식) {
		 * 			case 결과1 : 실행문1
		 * 				break;
		 * 
		 * 			case 결과 2 : 실행문2
		 * 				break;
		 * 
		 * 			case 결과 3 : 실행문3
		 * 				break;						
		 * 
		 * 			default : 실행문;				// 항상 마지막에 오기 때문에 break; 가 필요 없음
		 * 		}
		 * 
		 * 3. 주의사항
		 * 		- 표현식의 결과는 정수, 문자, 문자열 가능
		 * 		- 결과가 논리나 실수가 나올수는 없음
		 * 
		 * 
		 *  4. 명령 처리에 주로 사용됨
		 */
		
		int genderNum = 0;
		
		String gender = null;		// String 초기화
		// String gender = "";		// String 초기화
		
		switch (genderNum % 2) {
		case 0 : gender = "여자";
			break;
			
		case 1 : gender = "남자";
			//break;								// 마지막이기 때문에 break를 굳이 안 넣어도 됨
		
		}
		
		System.out.println(gender);
		

	}

}
