package week11;

public class OverTest {
	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		a.f();
//		b.f();
		A c =new B();
		c.f();//메소드오버라이딩 되어 자식 B의 f()가 실행됨.
	}
}
