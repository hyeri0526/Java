package week4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���.");
		int sum =0, n=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(i+" >>");
			try {
				n = sc.nextInt(); //�Է½� ������ ���ɼ� ����.
			} catch (InputMismatchException e) { //������ �߻��Ҽ� �ִ� ����
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next(); // ������ �ƴ� ��ū�� ����
				i--; // �ε��� �������� �ʵ��� ����
				continue;// for���� ���������� �̵�
			}
			sum += n;
		}
		System.out.println("���� "+sum);
		sc.close();
	}
}
