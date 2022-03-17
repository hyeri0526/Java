package week3;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit 를 입력하면 종료합니다.");
		
//		while(true) {
//			System.out.print(">>");
//			String txt = sc.next();
//			if(txt.equals("exit"))
//				break; //while문 빠져나감
//		}
		for(;;) {  //무한반복에는 꼭 if break가 있어야함.
			System.out.print(">>");
			String txt = sc.next();
			if(txt.equals("exit"))
				break; //while문 빠져나감
		}
		System.out.println("종료합니다.");
	}
}
