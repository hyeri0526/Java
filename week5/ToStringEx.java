package week5;
//��� Ŭ������ Object Ŭ������ ��ӹ޴´�.
public class ToStringEx {
	int a, b, c;

	public ToStringEx(int a, int b, int c) {
		//super(), �θ� ������ ȣ��
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override //��ӹ��� toSring() ������
	public String toString() {
		return "ToStringEx [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		ToStringEx t = new ToStringEx(1,2,3);
		System.out.println(t); //t�� ���޸� �ּҸ� �����.
		t.toString(); //ObjectŬ������ �޼ҵ��ִµ�, ���� ���� �޼ҵ尡 ������ �������̵���.
	}
}
