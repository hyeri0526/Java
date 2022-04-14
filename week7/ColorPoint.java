package week7;

public class ColorPoint extends Point{ //Point클래스를 상속받음, 다중상속 안됨.(C++는 다중상속됨)
	private String color; // 점의 색
	public void setColor(String color) {
		this.color = color;
		//x=10; // private 이면 부모인 Point를 상속받아서 가능함.
		//y=20;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point의 showPoint() 호출
	}
}
