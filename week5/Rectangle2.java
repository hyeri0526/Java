package week5;

import java.util.Scanner;

class Rect{
	private int width, height; //가급적이면 앞에 private를 붙여야함. 캡슐화.
	//소스- 제너레이트 게터 세터 설정	
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
    //면적 구하는 메소드
	int getArea() {
		return width * height;	
	}
}

public class Rectangle2 {
	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.println("높이 입력: "); 
		rect.setHeight(sc.nextInt());
		System.out.println("너비 입력: "); 
		rect.setWidth(sc.nextInt());
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}
}
