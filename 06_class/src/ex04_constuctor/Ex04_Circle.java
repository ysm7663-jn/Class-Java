package ex04_constuctor;

class Circle {
	
	double r;
	int x;
	int y;
	
	Circle(double r){
		this(0, 0, r);
	}
	
	Circle(int x, int y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	double getArea() {
		
		double area = r * r * Math.PI;
		
		return area;
	}
	
	void info() {
		System.out.println("중심좌표 : [" + x + ", " + y + "], 반지름 : " + r);
	}
}

public class Ex04_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle(1.5);
		Circle circle2 = new Circle(1, 2, 1.5);
		
		System.out.println("circle1 의 크기 : " + circle1.getArea());
		System.out.println("circle2 의 크기 : " + circle2.getArea());
		
		circle1.info();	// 중심좌표 : [0, 0], 반지름 : 1.5
		circle2.info(); // 중심좌표 : [1, 2], 반지름 : 1.5
		
		
	}
	
	
	

}
