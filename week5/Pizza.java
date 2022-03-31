package week5;

class Circle{
	int radius;
	String name;
	//method overloading 매개변수의 타입, 개수, 위치 => 시그니처가 다르면 동일한 이름의 메소드, 생성자 허용됨.
	//기본 생성자는 (){}괄호안에 아무것도 없고, 다른 생성자가 없을때 자동으로생성.
	//생성자 만들기 :소스-제너레이트 컨스트럭터 유징 필드
	public Circle(int radius) { //생성자1, 첫글자는 대문자, 리턴값이 없다. 객체 처음만들 때, 값을 준다.
		this.radius = radius;
	}	
	
	public Circle(int radius, String name) { //생성자2
		this(radius); //생성자1을 호출
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
		pizza.name = "자바피자";
		System.out.println(pizza.name + "의 면적은 "+ pizza.getArea(pizza.radius));
		
		Circle donut = new Circle(2, "자바도넛");
		System.out.println(donut.name + "의 면적은 "+ donut.getArea(donut.radius));		
	}
}
