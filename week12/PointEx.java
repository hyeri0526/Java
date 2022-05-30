class Point{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Object클래스에서 상속받은 toString() 재정의
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;  // 캐스팅
		if(x==p.x && y==p.y)
			return true;
		else
			return false;
	}
	
}
public class PointEx {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = a;
		
		//System.out.println(p.getClass().getName());
		//System.out.println(p.hashCode()); //객체의 시작주소를 10진수 정수로 나타냄
		System.out.println(p.toString()); //toString()은 원래 객체의 시작주소를 16진수로 나타냄
		
		if(a == b)
			System.out.println(a.hashCode()+"와"+ b.hashCode()+ "는 객체는 같습니다.");
		else
			System.out.println(a.hashCode()+"와"+ b.hashCode()+ "는 같지 않습니다.");
		if(a == c)
			System.out.println(a.hashCode()+"와"+ c.hashCode()+ "는 객체는 같습니다.");
		else
			System.out.println(a.hashCode()+"와"+ c.hashCode()+ "는 같지 않습니다.");
		if(a.equals(b)) 
			System.out.println("a와 b는 같습니다.");
		else
			System.out.println("a와 b는 같습니다.");
	}
	
	
}
