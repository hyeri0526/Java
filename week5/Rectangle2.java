package week5;

import java.util.Scanner;

class Rect{
	private int width, height; //�������̸� �տ� private�� �ٿ�����. ĸ��ȭ.
	//�ҽ�- ���ʷ���Ʈ ���� ���� ����	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
    //���� ���ϴ� �޼ҵ�
	int getArea() {
		return width * height;	
	}
}

public class Rectangle2 {
	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: "); 
		rect.setHeight(sc.nextInt());
		System.out.println("�ʺ� �Է�: "); 
		rect.setWidth(sc.nextInt());
		System.out.println("�簢���� ������ " + rect.getArea());
		sc.close();
	}
}
