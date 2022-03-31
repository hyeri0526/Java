package week5;

class Circle{
	int radius;
	String name;
	//method overloading �Ű������� Ÿ��, ����, ��ġ => �ñ״�ó�� �ٸ��� ������ �̸��� �޼ҵ�, ������ ����.
	//�⺻ �����ڴ� (){}��ȣ�ȿ� �ƹ��͵� ����, �ٸ� �����ڰ� ������ �ڵ����λ���.
	//������ ����� :�ҽ�-���ʷ���Ʈ ����Ʈ���� ��¡ �ʵ�
	public Circle(int radius) { //������1, ù���ڴ� �빮��, ���ϰ��� ����. ��ü ó������ ��, ���� �ش�.
		this.radius = radius;
	}	
	
	public Circle(int radius, String name) { //������2
		this(radius); //������1�� ȣ��
		this.name = name;
	}
	public double getArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}

public class Pizza {
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		//pizza.radius = 5;
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name + "�� ������ "+ pizza.getArea(pizza.radius));
		
		Circle donut = new Circle(2, "�ڹٵ���");
		System.out.println(donut.name + "�� ������ "+ donut.getArea(donut.radius));		
	}
}
