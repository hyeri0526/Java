package week4;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int[] ArrayInt1;
		//ArrayInt1= new int[5]; //���� �ټ��� �Ҵ��ϴ� �迭
		int[] ArrayInt1= new int[5];
		for (int i = 0; i < ArrayInt1.length; i++) {
			ArrayInt1[i] = i*10; //���� �ʱ�ȭ			
		}
		for (int i = 0; i < ArrayInt1.length; i++) {
			System.out.println(ArrayInt1[i]);
		}
		int[] ArrayInt2 = {1,2,3,4,5};
		for (int i : ArrayInt2) { //for each�� �迭�� ��� �ϳ��ϳ� �� �����ͼ� ó���Ҷ� ���
			System.out.println(i); 
		}
		int ArrayInt3[]; 
		ArrayInt3= ArrayInt2; //���� �迭�� ����Ŵ. []�� �迭 ���鶧, ��� �����Ҷ��� ���.
		for (int i : ArrayInt3) {
			System.out.println(i); 
		}
	}
}
