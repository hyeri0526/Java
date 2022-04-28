package week9;
class A {
	public A() { 
		System.out.println("생성자 A");
	}
	public A(int a) { 
		System.out.println("생성자 Aa");
	}
}
class B extends A {
	public B() { 
		System.out.println("생성자 B");
	}
	public B(int b) { 
		super(3); //부모 생성자 지정
		System.out.println("생성자 Bb");
	}
}
class C extends B {
	public C() { 
		System.out.println("생성자 C");
	}
	public C(int c) { 
		super(2); //부모 생성자 지정, 안적으면 디폴트 생성자
		System.out.println("생성자 Cc");
	}
}
public class Constructor {
	public static void main(String[] args) {
		C c = new C(); //부모클래스부터 실행됨.	디폴트 생성자
		C cc = new C(1); // 부모생성자 중 선택
	}
}
