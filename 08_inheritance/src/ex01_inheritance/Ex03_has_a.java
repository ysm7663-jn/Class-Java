package ex01_inheritance;

// has - a 관계
// 1. 상속 관계로 구현할 수 있다.
// 2. 대부분은 상속 말고 , 포함 관계로 구현한다.

/* 포함 관계
 *  class Coord {
 *  	int x, y;
 *  }
 */

/*
 * class Circle {
 * 		Coord center;
 * 		double r;
 * }
 */

// Circle has a Coord
// 슈퍼 클래스 : Coord
// 서브 클래스 : Circle

class Coord {

	// field
	int x, y;

	// method
	void setCoord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void coordInfo() {
		System.out.println("[" + x + ", " + y + "]");
	}

}

// 서브 클래스
class Circle extends Coord {
	
	// field 
	double r;
	
	// method
	// Circle 클래스는 Coord 클래스의 메소드를 사용할 수 있다.
	void setCircle (int x, int y, double r) {
		setCoord(x, y);		// Coord 클래스의 메소드이지만, 내 것처럼 사용할 수 있다.
		this.r = r;
	}
	
	void circleInfo() {
		System.out.print("중심 좌표 : ");
		coordInfo();
		System.out.println("반지름 : " + r);
		
	}
}

public class Ex03_has_a {

	public static void main(String[] args) {
		
		Coord c = new Coord();
		c.setCoord(1, 1);
		c.coordInfo();
		
		Circle circle = new Circle();
		circle.setCircle(2, 2, 1.5);	// 실제로는 setCoord 메소드가 함께 호출된다.
		circle.circleInfo();			// 실제로는 coordInfo 메소드가 함께 호출된다.

	}

}
