package ex03_method;

class Nemo {
	
	// 필드
	int width;
	int height;
	
	// 직사각형 너비와 높이 메소드
	void setInfo(int w, int h) {
		width = w;
		height = h;
	}
	
	// 정사각형 너비와 높이 메소드
	void setInfo(int x) {
		setInfo(x, x);
	}
	
	// 오버라이딩 : 이름이 같고, 매개변수가 다르면 다른건 고려하지 않는다. 
	
	// 넓이 구하는 메소드
	int getArea() {
		return width * height;
	}
	
	// 출력문
	void info () {
		System.out.println("너비 : " + width + ", 높이 : " + height);
	}
	
}


public class Ex04_method_overloading {

	public static void main(String[] args) {
		
		// 사각형  만들기
		
		// 1. 직사각형
		Nemo nemo1 = new Nemo();
		nemo1.setInfo(3, 5);
		System.out.println("넓이 : " + nemo1.getArea());	// 넓이 : 15
		nemo1.info();		// 너비 : 3, 높이 : 5
		
		
		// 2. 정사각형
		Nemo nemo2 = new Nemo();
		nemo2.setInfo(3);
		System.out.println("넓이 : " + nemo2.getArea());	// 넓이 : 9
		nemo2.info();		// 너비 : 3, 높이 : 3
		
		
	}

}
