package ex01_upcasting;

// 슈퍼클래스 : 도형
class Shape {

	private String name; // 원, 삼각형, 사각형, 마름모 ...

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 0;
	}

}

// 서브클래스 : 원
class Circle extends Shape {

	private double r;

	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}

}

// 서브클래스 : 사각형
class Rect extends Shape {

	private int width; // 너비
	private int height; // 높이

	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}

public class Ex02_Shape {

	public static void main(String[] args) {

		Shape[] shapeList = new Shape[5];

		shapeList[0] = new Circle("구슬", 0.5);
		shapeList[1] = new Rect("색종이", 12, 10);
		shapeList[2] = new Rect("책", 150, 10);
		shapeList[3] = new Circle("피자", 10.5);
		shapeList[4] = new Circle("도넛", 5.5);

		for (Shape shape : shapeList) {
			System.out.println(shape.getName() + "의 크기 : " + shape.getArea());
		}

	}

}
