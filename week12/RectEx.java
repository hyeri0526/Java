class Rect{
	private int height, width, area;

	public Rect(int height, int width) {
		super();
		this.height = height;
		this.width = width;
		area = height * width;
	}
	@Override
	public String toString() {
		return "Rect [height=" + height + ", width=" + width + "]";
	}
	@Override
	public boolean equals(Object obj) {  //� ��ü�� ������ �ִ�.
		Rect r = (Rect)obj; // �ٿ�ĳ����
		if(area == r.area)
			return true;
		else
			return false;
	}	
}
public class RectEx {
	public static void main(String[] args) {
		Rect r1 = new Rect(2,3);
		Rect r2 = new Rect(3,2);
		if(r1.equals(r2))
			System.out.println("�� �簢���� ������ �����ϴ�.");
		else
			System.out.println("�� �簢���� ������ �����ʽ��ϴ�.");
		System.out.println(Integer.MAX_VALUE); //2147483647
	    System.out.println(Integer.SIZE); //32��Ʈ
	}
}
