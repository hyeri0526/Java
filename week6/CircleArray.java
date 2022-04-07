package week6;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}	
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5]; // ¹è¿­À» ¸¸µê
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); //½ÇÃ¼ °´Ã¼¸¦ ¸¸µê
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)(c[i].getArea()));
		}
	}
}
