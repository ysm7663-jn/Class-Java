package ex02_variable;

public class Ex05_parsing {

	public static void main(String[] args) {
		
		/*
		 * 문자열 타입 변환 parsing
		 * 
		 * 1. String -> int
		 * 	String s1 = "100";
		 * 	int a = Integer.parsingInt(s1);
		 * 
		 * 2. String -> double
		 * 	String s2 = "1.5";
		 * 	double b = Double.parsingDoubel(s2);
		 * 
		 * 3. String -> boolean
		 * 	String s3 = "true";
		 * 	boolean c = Boolean.parsingBoolean(s3);
		 * 
		 * 4. Int -> String
		 * 	int d = 100;
		 * 	String s4 = String.valueOf(d);
		 * 
		 * 5. double -> String
		 * 	double e = 1.5;
		 * 	String s5 = String.valueOf(e);
		 * 
		 * 6. boolean -> String
		 * 	boolean f = true;
		 * 	String s6 = String.valueOf(f);
		 * 
		 * 4 ~ 6 어떤 타입 -> String
		 * 	1) String s = String.valueOf(a);
		 * 	2) String s = "1" + 2 >> 2를 "" 타입으로 변환 >> 결과값 : 12
		 * 	∴ String s = a + ""; 효율적
		 */
		
		String s1 = "100";
		int a = Integer.parseInt(s1);
		System.out.println(a);
		
		String s2 = "1.5";
		double b = Double.parseDouble(s2);
		System.out.println(b);
		
		String s3 = "true";
		boolean c = Boolean.parseBoolean(s3);
		System.out.println(c);
		
		int d = 100;
		String s4 = String.valueOf(d);		// d + "";
		System.out.println(d);
		
		double e = 1.5;	
		String s5 = String.valueOf(e);		// e + "";
		System.out.println(e);
		
		boolean f = true;
		String s6 = String.valueOf(f);		// f + "";
		System.out.println(f);
		
		System.out.println();
		
		String strAge = "25";
		String strHeight = "175.5";
		
		int age = Integer.parseInt(strAge);
		System.out.println("나이는 " + age + "살입니다.");
		
		double height = Double.parseDouble(strHeight); 
		System.out.println("키는 " + height + "cm입니다.");
		
	}

}
