class GenCls<T>{  //<T> T�ڸ��� Ŭ������ ����.
	T a;
	
	public void print() {
		System.out.println(a);
	}
}

public class GenericEx {
	public static void main(String[] args) {
		GenCls<Integer> i = new GenCls<Integer>();  // ��ü �����Ҷ� ������ Ÿ�� �����ϴ� ��� = ���׸�
		i.print();
		GenCls<Double> d = new GenCls<Double>();
		d.print();
		GenCls<Long> l = new GenCls<Long>();
		l.print();
		GenCls<String> s = new GenCls<String>();
		s.print();
	}
	
}
