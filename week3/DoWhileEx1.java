package week3;

public class DoWhileEx1 {
	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			System.out.print(ch);
			//ch++; �ص� �����.
			ch = (char)(ch + 1); //ch�� 2����Ʈ, 1(����)�� 4����Ʈ�� ���� ����ȯ�ؾ���.
		}while(ch <= 'z');
	}
}
