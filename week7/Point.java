package week7;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표, 다른 클래스에서 접근 못함.
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}

}
