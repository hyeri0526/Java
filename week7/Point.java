package week7;

public class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ, �ٸ� Ŭ�������� ���� ����.
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}

}
