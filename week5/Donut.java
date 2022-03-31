package week5;

public class Donut {
	int radius;
	String name;
	double getArea(int r) {
		double area;
		area = Math.PI * r *r;
		return area;
	}
	public static void main(String[] args) {
		Donut pizza = new Donut();
		pizza.radius = 5;
		pizza.name = "자바피자";
		System.out.println(pizza.name+"의 면적은 "+ pizza.getArea(pizza.radius));
		
		Donut donut = new Donut();
		donut.radius = 2;
		donut.name = "자바도넛";
		System.out.println(donut.name+"의 면적은 "+ donut.getArea(donut.radius));
	}
}
