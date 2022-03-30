package week4;

public class ArrayCall {
	public static int sum(int def[], int n) {
		int sum = 0;
		def[++n] =100; // k+ 1 번째 배열의 값이 100으로 바뀜
		for (int i = 0; i < def.length; i++) {
			sum += def[i];
		}
		return sum;
	} //call by value, call by reference, k는 바뀌지 않지만, abc는 참조이므로 바뀐다.
	public static void main(String[] args) {
		int[] abc = {99, 89, 96, 87, 99};
		int k = 3;
		int hap = sum(abc, k);
		for (int i : abc) {
			System.out.println(i);			
		}		
		System.out.println("배열 abc 요소의 합:"+hap);
	}
}
