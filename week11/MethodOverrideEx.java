package week11;

//class Shape{
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
abstract class Shape{ //추상클래스, 상속만 줄수 있고 객체는 생성할 수 없다.
	public abstract void draw(); //추상메소드-> 무조건 메소드를 재정의해야함.
	public void abc() {
		System.out.println("Shape");
	}
} 

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverrideEx {
	static void paint(Shape p) {
		p.draw(); // 메소드 오버라이딩해서 자식의 draw()가 실행됨. 다형성
	}
	public static void main(String[] args) {
		//Line line = new Line();
		//paint(line); // 부모 클래스 Shape로 업캐스팅
		Rect rect = new Rect();
		paint(rect);
		
		//paint(new Shape()); //객체 이름없이 만듦, 한번만 쓰고 싶을때
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
