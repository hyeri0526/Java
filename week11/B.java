package week11;

public class B extends A {
	void f() { //A클래스의 f()와 프로토타입과 같음. 메소드 오버라이딩
		System.out.println("자식 클래스 B의 f() 호출");	
		//super.f();
		//System.out.println("부모의 메소드 호출");
	}	
	void g() {
		System.out.println("자식클래스의 g메소드");		
	}	
}
