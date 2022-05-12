package week11;

public interface PhoneInterface { //상수와 메소드만 모아놓은 것. 객체를 생성할수 없음. 레퍼런스 변수 만들수있다.
	public static final int TIMEOUT = 10000; //상수
	void sendCall(); //public abstract 생략가능, 무조건 재정의해야함
	public abstract void receiveCall(); // 무조건 재정의해야함.
	public default void printLogo() { //자바 버젼 8부터 private와 public은 9버젼부터 포함
		System.out.println("** Phone **");
	}	
}
