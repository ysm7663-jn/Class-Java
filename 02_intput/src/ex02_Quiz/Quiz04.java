package ex02_Quiz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		// 문제. 매출액(정수)과 등급("VIP", "일반")을 입력 받아서
		// "VIP" 등급은 매출액의 20% 할인, "일반" 5% 할인하여 실제 매출액 출력
		
		String strSell = JOptionPane.showInputDialog("매출액을 입력하세요 >> ");
		String strGrade = JOptionPane.showInputDialog("등급을 입력하세요 >> ");
		
		int sell = Integer.parseInt(strSell);
		
		JOptionPane.showMessageDialog(null,"실제 매출액 : " + (int)(strGrade.equalsIgnoreCase("VIP") ? sell * 0.8 : sell * 0.95) + "원");		// equalsIgnoreCase : 대소문자 구분하지 않음
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액을 입력하세요 >> ");
		int n = sc.nextInt();						// 10000\n 입력하면 sales는 10000저장, \n은 스트림에 남아있음
		
		// sc.nextLine();							// 스트림에 남아있던 \n를 사용
		
		System.out.print("등급을 입력하세요 >> ");
		String grade = sc.next();					// nextLine()은 위에 \n이 남아있기 때문에 입력이 불가능, 반드시 nextLine()을 사용해야 되는 경우 -> 사이에 nextLine();을 삽입하여 \n을 제거 
		
		System.out.println("실제 매출액 : " + (int)(grade.equalsIgnoreCase("VIP") ? n * 0.8 : n * 0.95) + "원");
		
		
		
		
	}

}
