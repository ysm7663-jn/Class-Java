package ex03_method;

/*
 * 메소드의 재귀 호출
 * 1. recursive call
 * 2. 메소드 내부에서 자신을 호출하는 것
 */

class Counter {
	
	// field 
	int count;
	
	// method
	void countDown(int count) {
		
		if(count == 0)
			return;
		// 메소드 실행을 중지
		// 1. 결과타입이 없는 경우 사용할 수 있음
		// 2. 방법
		//	return ;
			
		//System.exit(0);	 시스템 종료 방식
		System.out.println(count);
		countDown(count - 1);
		
	}
}

public class Ex06_recursive {

	public static void main(String[] args) {
		
		Counter cnt = new Counter();
		
		cnt.countDown(5);
		
	}

}
