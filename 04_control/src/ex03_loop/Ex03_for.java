package ex03_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		/*
		 * for 문
		 * 1. 반복되는 값의 범위가 명확할 때 사용
		 * 2. 배열에서 주로 사용
		 * 3. 형식
		 * 	for ( 초깃값 ; 조건식 ; 증감문 ) {
		 * 		 반복문 실행;
		 * 	}
		 * 
		 *  순서 : 초깃값 > 조건식 > 참일경우 > 반복문 실행 > 증감문 > 초깃값을 제외하고 반복
		 *  
		 */
		
		// 변수의 사용 범위(scope)
		// 변수가 선언된 위치에서만 사용할 수 있다.
		// 위치의 기준은 중괄호{}
		
		
		// 1. 1 ~ 3까지 출력
		
		for (int i = 1; i <= 3; i++)
			System.out.println(i);

		// 2. 3 ~ 1까지 출력
		
		for (int i = 3; i >= 1; i--)
			System.out.println(i);
	
		// 3. 반복 횟수 정하기
		
		int cnt = 5;
		for(int i = 0; i < cnt; i++)
			System.out.println("Hello World");
		
	}

}
