package week7;

public class ColorPoint extends Point{ //PointŬ������ ��ӹ���, ���߻�� �ȵ�.(C++�� ���߻�ӵ�)
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
		//x=10; // private �̸� �θ��� Point�� ��ӹ޾Ƽ� ������.
		//y=20;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point�� showPoint() ȣ��
	}
}
