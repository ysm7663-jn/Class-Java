package ex01_input;

import javax.swing.JOptionPane;

public class Ex03_JOptionPane {

	public static void main(String[] args) {

		/*
		 * JOptionPane 클래스
		 * 
		 * 1. GUI 컴포넌트를 통한 입력과 출력을 지원
		 * 2. swing 컴포넌트 이용
		 * 	1) javax.swing 패키지에 저장(import 필요)
		 * 	2) javax.swing.JOptionPane
		 * 3. 입력 메소드
		 * 	1) showInputDialog()
		 * 	2) 반환되는 값(입력되는 값)의 타입은 언제나 String 
		 * 	3) String 변수  = JOptionPane.showInputDialog("메세지");
		 * 4. 출력 메소드
		 * 	1) showMessageDialog()
		 * 	2) JOptionPane.showMessageDialog(null, "메소드");			// 어떤 값이 없을때 null (reference 타입의 값이 없을때 사용)
		 * 
		 */
		
		
		// 입력은 무조건 String형
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요 >> ");

		String strAge = JOptionPane.showInputDialog("나이를 입력하세요 >> ");
				
		String strheight = JOptionPane.showInputDialog("키를 입력하세요 >> ");
		
		String strGender = JOptionPane.showInputDialog("성별을 입력하세요 >> ");
		
		// 각 변수의 타입에 맞게 변환
		
		// 나이 : String -> int		(parsing)
		// 키   : String -> double	(parsing)        
		// 성별	: String -> char	(charAt(0), 첫번째 글자)
		
		int age = Integer.parseInt(strAge);
		
		double height = Double.parseDouble(strheight);
		
		char gender = strGender.charAt(0);
		
		// 출력
		
		String message = "이름 : " + name + " 나이 : " + age + " 키 : " + height + " 성별 : " + gender;
		
		JOptionPane.showMessageDialog(null, message);
		
	}

}
