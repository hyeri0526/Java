package week4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum =0, n=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i+" >>");
			try {
				n = sc.nextInt(); //입력시 오류날 가능성 있음.
			} catch (InputMismatchException e) { //실행중 발생할수 있는 오류
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 정수가 아닌 토큰을 버림
				i--; // 인덱스 증가하지 않도록 감소
				continue;// for문의 증감식으로 이동
			}
			sum += n;
		}
		System.out.println("합은 "+sum);
		sc.close();
	}
}
