package week9;

public class SupCls{
	int kor, eng, math;
	String name;
	public SupCls() {
		
	}
	public SupCls(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String toString() {
		return "SupCls [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
