package week9;

class D{
	int a, b, c;
	String name;

	public D() { //�⺻ ������, �ڵ����� ����� ��, �ٸ� �����ڰ� ������ �ȸ���� ��.
	//	super(); �ڽ��� �θ� ȣ��(Object), ��������
	}
	
	public D(int a) { //������2, �����ڴ� Ŭ������� ����, ������ ���� �� �ִ�. �� �ñ״��İ� �޶�� ��.
		this.a = a; //Ŭ������ �ʵ� => this.a�̰� a�� �Ű�����. �̸��� ���⶧��
	}
	
	public D(int a, int b) { //������3
		this(a); //���ȿ� ������2 ȣ��
		//this.a = a; 
		this.b = b;
	}	
	public D(int a, int b, int c) { //������4
		this(a,b); //���ȿ� ������3 ȣ��	
		this.c = c;
	}
		
	public D(int a, int b, String name) { //������5
		this(a,b);
		this.name = name;
	}
    //���� �̸��� ������(�Ǵ� �޼ҵ�) �ñ״��İ� �ٸ� => ������ �����ε�, �޼ҵ� �����ε�
	int sum() { return a+b; }
	int sum(int c) {	return c + b; }
	int sum(int c, int d) { return c + d; }
	
	void print() {
		System.out.println("DŬ������ ��ü");
	}
}
public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "ȫ�浿"); //������4 ȣ��, ������ �����ε�
		System.out.println("a="+ d.a +" b="+d.b+" name="+d.name);
		System.out.println(d.sum()); //1+2, �޼ҵ� �����ε�
		System.out.println(d.sum(5)); //5+2, �޼ҵ� �����ε�
		System.out.println(d.sum(6, 4)); //6+4, �޼ҵ� �����ε�
	}
}
