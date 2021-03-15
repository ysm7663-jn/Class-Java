package ex03_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		// 1일차 1교시입니다 ~ 5일차 8교시입니다 까지
			
		for(int i = 1; i <= 5; i++)	{		// outer loop
		
			for(int j = 1; j <= 8; j++) {	// inner loop 
				
				System.out.println(i +"일차 " + j + "교시입니다.");
			}
			
			System.out.println("----------------------");
		}
	}

}
