package week4;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int[] ArrayInt1;
		//ArrayInt1= new int[5]; //정수 다섯개 할당하는 배열
		int[] ArrayInt1= new int[5];
		for (int i = 0; i < ArrayInt1.length; i++) {
			ArrayInt1[i] = i*10; //값을 초기화			
		}
		for (int i = 0; i < ArrayInt1.length; i++) {
			System.out.println(ArrayInt1[i]);
		}
		int[] ArrayInt2 = {1,2,3,4,5};
		for (int i : ArrayInt2) { //for each는 배열에 요소 하나하나 다 가져와서 처리할때 사용
			System.out.println(i); 
		}
		int ArrayInt3[]; 
		ArrayInt3= ArrayInt2; //같은 배열을 가리킴. []는 배열 만들때, 요소 접근할때만 사용.
		for (int i : ArrayInt3) {
			System.out.println(i); 
		}
	}
}
