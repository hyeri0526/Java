package week5;

import java.util.Scanner;

public class Rectangle {
	private int width, height;
	//public protected defualt private
	int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		rect.height = sc.nextInt();
		System.out.println("�ʺ� �Է�: ");
		rect.width = sc.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		sc.close();
	}
}
