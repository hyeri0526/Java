package app;
import lib.Calculator;

public class GoodCalc extends Calculator{ // 다른 패키지 상속

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(1, 2));
		System.out.println(c.subtract(6, 1));
		System.out.println(c.average(new int [] {1,2,3,4,5})); // 무명 배열 만들기
	}
}
