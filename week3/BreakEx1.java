package week3;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("exit �� �Է��ϸ� �����մϴ�.");
		
//		while(true) {
//			System.out.print(">>");
//			String txt = sc.next();
//			if(txt.equals("exit"))
//				break; //while�� ��������
//		}
		for(;;) {  //���ѹݺ����� �� if break�� �־����.
			System.out.print(">>");
			String txt = sc.next();
			if(txt.equals("exit"))
				break; //while�� ��������
		}
		System.out.println("�����մϴ�.");
	}
}
