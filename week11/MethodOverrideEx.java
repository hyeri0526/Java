package week11;

//class Shape{
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
abstract class Shape{ //�߻�Ŭ����, ��Ӹ� �ټ� �ְ� ��ü�� ������ �� ����.
	public abstract void draw(); //�߻�޼ҵ�-> ������ �޼ҵ带 �������ؾ���.
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
		p.draw(); // �޼ҵ� �������̵��ؼ� �ڽ��� draw()�� �����. ������
	}
	public static void main(String[] args) {
		//Line line = new Line();
		//paint(line); // �θ� Ŭ���� Shape�� ��ĳ����
		Rect rect = new Rect();
		paint(rect);
		
		//paint(new Shape()); //��ü �̸����� ����, �ѹ��� ���� ������
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
