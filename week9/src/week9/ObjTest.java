package week9;

class D{
	int a, b, c;
	String name;

	public D() { //기본 생성자, 자동으로 만들어 줌, 다른 생성자가 있으면 안만들어 줌.
	//	super(); 자신의 부모 호출(Object), 생략가능
	}
	
	public D(int a) { //생성자2, 생성자는 클래스명과 같고, 여러개 있을 수 있다. 단 시그니쳐가 달라야 됨.
		this.a = a; //클래스의 필드 => this.a이고 a는 매개변수. 이름이 같기때문
	}
	
	public D(int a, int b) { //생성자3
		this(a); //내안에 생성자2 호출
		//this.a = a; 
		this.b = b;
	}	
	public D(int a, int b, int c) { //생성자4
		this(a,b); //내안에 생성자3 호출	
		this.c = c;
	}
		
	public D(int a, int b, String name) { //생성자5
		this(a,b);
		this.name = name;
	}
    //같은 이름의 생성자(또는 메소드) 시그니쳐가 다름 => 생성자 오버로딩, 메소드 오버로딩
	int sum() { return a+b; }
	int sum(int c) {	return c + b; }
	int sum(int c, int d) { return c + d; }
	
	void print() {
		System.out.println("D클래스의 객체");
	}
}
public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "홍길동"); //생성자4 호출, 생성자 오버로딩
		System.out.println("a="+ d.a +" b="+d.b+" name="+d.name);
		System.out.println(d.sum()); //1+2, 메소드 오버로딩
		System.out.println(d.sum(5)); //5+2, 메소드 오버로딩
		System.out.println(d.sum(6, 4)); //6+4, 메소드 오버로딩
	}
}
