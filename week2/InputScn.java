package week2;

import java.util.Scanner; //Scanner 클래스 넣으면 자동으로 생김

public class InputScn {
	public static void main(String[] args) {
		int a;
		String name; // new 없이 만든 문자열은 상수, new로 만든것은 객체임, 약간 다름.
		
		Scanner sc = new Scanner(System.in);   //입력받는 객체 sc 생성
		
		System.out.print("정수입력: ");   //입력받기전의 문자열 : 프롬프트
		a = sc.nextInt();     //정수 입력받아 a에 넣음
		
		System.out.print("이름입력: "); 
		name = sc.next();     //문자열 입력받아 name에 넣음
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close(); // 안쓰면 경고 메시지가 뜬다. 안적어도 실행은 됨.
	}
}
