package week4;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5]; // int�� �迭�� heap�� ����� ���� new ���.
		int max = 0; // ����� �ּҰ�
		int min = 2147483647; //4Byte int�� ������ ��� �ִ밪
		int sum = 0;
		System.out.print("��� 5���� �Է��ϼ���.:");
		for (int i = 0; i < intArray.length; i++) { //�迭�� ���� �Ӽ�: length
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i] > max)
				max = intArray[i];
			if(intArray[i] < max)
				min = intArray[i];
		}
		System.out.print("���� ū ���� "+max+" �Դϴ�.");
		System.out.print("���� ���� ���� "+min+" �Դϴ�.");
		System.out.print("5�� ����� ���� "+sum+" �Դϴ�.");
		sc.close();
	}
}
