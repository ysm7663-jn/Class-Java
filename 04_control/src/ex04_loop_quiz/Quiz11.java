package ex04_loop_quiz;

public class Quiz11 {

	public static void main(String[] args) {
		
		// 문제. 369게임
		// 1 ~ 99 사이 369게임 결과 출력
		// 1	2	짝	4	5	짝	7	8	짝 10
		
		// 0 : false     1 : true 	의미
		
		boolean a = false;		// 일의 자리가 3,6,9 > true
		boolean b = false;		// 십의 자리가 3,6,9 > true
		
		for(int i = 0; i <= 99; i++) {
			
			int ship = i % 100;
			int ill = i % 10;
			
			a = (ill % 3 == 0 && ill != 0); 
			b = (ship % 3 == 0 && ship != 0);
			
			if(a && b) 
				System.out.print("짝짝\t");
			
			else if(a || b )
				System.out.print("짝\t");
			
			else
				System.out.print(i + "\t");
			
			if(i % 10 == 0)
				System.out.println();
		}
		
		

	}

}
