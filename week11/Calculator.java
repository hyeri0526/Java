package week11;

public abstract class Calculator { //�߻�Ŭ����
	int a, b;
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	public void printInfo() {
		System.out.println("�߻��� �ƴ� �Ϲ� �޼ҵ�");
	}
}
