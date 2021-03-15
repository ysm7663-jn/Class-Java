package ex03_array_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		// 문제. 5명의 키를 입력 받아서 가장 큰 키를 가진 사람의 이름을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"james", "alice", "amande", "jessica", "emily"};
		
		double [] tall = new double[name.length];
		
		double max = 0;
		
		String result = "";
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 키 입력 >>> ");
			tall[i] = sc.nextDouble();
		}
		
		
		for(int i = 0; i < tall.length; i++) {
			if(tall[i] > max) {
				max = tall[i];
				result = name[i];
			}
			
		}
		
		System.out.println("가장 키가 큰 사람은 " + result + "입니다.");
		
		sc.close();

	}

}
