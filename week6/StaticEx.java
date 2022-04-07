package week6;

class Stat{
	static int cnt = 0; //모든 객체가 공유한다. 객체 생성 갯수 카운트할때 사용
	int i = 5;
	public Stat() {
		cnt++;
	}
	public Stat(int i) {
		cnt++;
		this.i=i;
	}
	static int statMethod() {
		return cnt;
	}
}
public class StaticEx {
	public static void main(String[] args) {
		Stat s1 = new Stat();
		Stat s2 = new Stat();
		Stat s3 = new Stat(1);
		Stat s4 = new Stat(2);
		System.out.println(Stat.cnt);
		System.out.println(Stat.statMethod()); // 클래스이름으로 메소드 호출
		System.out.println(Math.PI); // 클래스이름으로 static 필드 호출
		//(Math클래스 참조)https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
	}
}
