package ex02_Quiz;

import javax.swing.JOptionPane;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 문제. 성별을 의미하는 숫자(정수) 1 ~ 4를 입력 받아서
		// "남자", "여자" 를 구분하여 출력
		// 1,3 남자, 2,4 여자
		
		String strGender = JOptionPane.showInputDialog("숫자를 입력하세요 >> ");
				
		int gender = Integer.parseInt(strGender);
		
		JOptionPane.showMessageDialog(null, gender % 2 == 0 ? "여자" : "남자");
		
		
	}

}
