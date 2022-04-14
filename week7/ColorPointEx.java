package week7;

public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point(); 	// Point 객체 생성
		p.set(1, 2); 						// Point 클래스의 set() 호출
		p.showPoint();
		System.out.println(p.toString()); //p의 메모리 주소(heap)를 해시코드로 출력->Point 클래스에 toString 오버라이딩하면 필드값 출력
		System.out.println(p); //객체를 출력하라고 하면 toString()호출(Object클래스를 상속받음)->오버라이딩	
		
		ColorPoint cp = new ColorPoint(); 
		cp.set(3, 4); 						// Point 클래스를 상속 받았으므로 set() 호출
		cp.setColor("red"); 			// ColorPoint의 setColor() 호출, 10,20으로 바꾸었음.
		cp.showColorPoint(); 		// 컬러와 좌표 출력
	}

}
