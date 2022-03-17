package week3;

public class DoWhileEx1 {
	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			System.out.print(ch);
			//ch++; 해도 실행됨.
			ch = (char)(ch + 1); //ch는 2바이트, 1(정수)은 4바이트라서 강제 형변환해야함.
		}while(ch <= 'z');
	}
}
