package ex01_exception;

public class Ex06_printStackTrace {

	public static void main(String[] args) {
		
		// 1. 개발 중 : e.printStackTrace()
		// 2. 개발 완료 : 삭제 후, 적절한 예외 처리 
		
		try {
			
			System.out.println(2 / 0);
			
		} catch (Exception e) {
			e.printStackTrace();	// 개발 단계에서 문제를 확인하기 위해 사용, 완성품에는 사용하지 않음
		}

	}

}
