package week6;

public class CallByReference {
	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		System.out.printf("%.2f\n",pizza.getArea());
		increase(pizza);
		System.out.printf("%.2f",pizza.getArea());
	}
	static void increase(Circle m) { //주소를 전달받았으므로 객체에 영향을 준다.
		m.radius++;
	}	
}
