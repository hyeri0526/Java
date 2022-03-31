package week5;
//모든 클래스는 Object 클래스를 상속받는다.
public class ToStringEx {
	int a, b, c;

	public ToStringEx(int a, int b, int c) {
		//super(), 부모 생성자 호출
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override //상속받은 toSring() 재정의
	public String toString() {
		return "ToStringEx [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		ToStringEx t = new ToStringEx(1,2,3);
		System.out.println(t); //t는 힙메모리 주소를 출력함.
		t.toString(); //Object클래스의 메소드있는데, 내가 만든 메소드가 있으면 오버라이드함.
	}
}
