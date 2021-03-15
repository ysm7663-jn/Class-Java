package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {

		
		//java.util.Random
		
		Random rand = new Random();
		
		int rand1 = rand.nextInt();
		
		System.out.println("int 범위 중 하나 : " + rand1);
		
		int rand2 = rand.nextInt(10) + 1;

		System.out.println("1000개 숫자 중 하나 : " + rand2);			// 시작 0부터, 0 ~ 9
		
		double rand3 = (int)(rand.nextDouble() * 10 );
		
		System.out.println("0 ~ 1사이의 실수 : " + rand3);
		
	}

}
