package ex01_branch;

import java.util.Random;

public class Ex03_If_elseif {

	public static void main(String[] args) {
		
		// if - elseif
		// 1. 조건식이 다수 존재할 때 사용
		// 2. 형식
		//	if(조건식1) {
		//		실행문1;
		//	}	else if(조건식2) {
		//		실행문2;
		//	}	else if(조건식3) {
		//		실행문4;
		//	}	else	{	
		//		실행문4;
		//	}
		
		int a = (new Random()).nextInt();
		
		if (a > 0)
			System.out.println(a + "는 양수");
		
		else if (a == 0)
			System.out.println(a + "는 0");
		
		else
			System.out.println(a + "는 음수");
		
		//if - else if - else 셋 다 활용하는것이 가장 이상적

	}

}
