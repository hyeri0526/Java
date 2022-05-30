class GenCls<T>{  //<T> T자리에 클래스가 들어간다.
	T a;
	
	public void print() {
		System.out.println(a);
	}
}

public class GenericEx {
	public static void main(String[] args) {
		GenCls<Integer> i = new GenCls<Integer>();  // 객체 생성할때 데이터 타입 결정하는 기법 = 제네릭
		i.print();
		GenCls<Double> d = new GenCls<Double>();
		d.print();
		GenCls<Long> l = new GenCls<Long>();
		l.print();
		GenCls<String> s = new GenCls<String>();
		s.print();
	}
	
}
