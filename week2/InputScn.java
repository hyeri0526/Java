package week2;

import java.util.Scanner; //Scanner Ŭ���� ������ �ڵ����� ����

public class InputScn {
	public static void main(String[] args) {
		int a;
		String name; // new ���� ���� ���ڿ��� ���, new�� ������� ��ü��, �ణ �ٸ�.
		
		Scanner sc = new Scanner(System.in);   //�Է¹޴� ��ü sc ����
		
		System.out.print("�����Է�: ");   //�Է¹ޱ����� ���ڿ� : ������Ʈ
		a = sc.nextInt();     //���� �Է¹޾� a�� ����
		
		System.out.print("�̸��Է�: "); 
		name = sc.next();     //���ڿ� �Է¹޾� name�� ����
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close(); // �Ⱦ��� ��� �޽����� ���. ����� ������ ��.
	}
}
