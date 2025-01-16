package 다형성실습;

abstract class Shape {
	String name;
	String color;
	double size;

	Shape(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
	}

	abstract void draw();
}

class Line extends Shape {

	Line(String name, String color, int size) {
		super(name, color,size);
	}

	@Override
	void draw() {
		System.out.println("선을 긋는다 ");
	}

}

class point extends Shape {

	point(String name, String color, int size) {
		super(name, color,size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다");
	}

}

class Circle extends Shape {

	int radius;

	Circle(String name, String color, int size) {
		super(name, color,size);
	}

	@Override
	void draw() {
		System.out.println("원을 그린다");

	}

}

class Rect extends Shape {

	int height;
	int width;

	Rect(String name, String color, int size) {
		super(name, color,size);
	}

	@Override
	void draw() {

	}

}

class Triangle extends Shape {
	Triangle(String name, String color, int size) {
		super(name, color,size);
	}

	int height;
	int width;

	@Override
	void draw() {
		// TODO Auto-generated method stub

	}
}

public class _01도형 {
	public static void main(String[] args) {

		// 모양도 랜덤하게 색깔 사이즈 랜덤해게 도형 10개를 출력하세요 
		// 점 , 선 기존 size 출력 
		// 원, 네모, 세모 => size 넓이를 계산해서 출력 
		
		String[] colors = {"파란색", "빨간색","보라색","분홍색","노란색"};
		
		Shape[] lilt = new Shape[10];
		
		//[문제1] 10 랜덤하게 생성해서 출력하기 
		
		//[문제2] 원만 출력하기 
		
	}
}
