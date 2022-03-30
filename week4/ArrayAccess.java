package week4;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5]; // int형 배열을 heap에 만들기 위해 new 사용.
		int max = 0; // 양수의 최소값
		int min = 2147483647; //4Byte int형 범위의 양수 최대값
		int sum = 0;
		System.out.print("양수 5개를 입력하세요.:");
		for (int i = 0; i < intArray.length; i++) { //배열의 길이 속성: length
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i] > max)
				max = intArray[i];
			if(intArray[i] < max)
				min = intArray[i];
		}
		System.out.print("가장 큰 수는 "+max+" 입니다.");
		System.out.print("가장 작은 수는 "+min+" 입니다.");
		System.out.print("5개 양수의 합은 "+sum+" 입니다.");
		sc.close();
	}
}
