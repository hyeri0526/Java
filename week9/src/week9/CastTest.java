package week9;

public class CastTest {

	public static void main(String[] args) {
		byte b = 1; int i =6;
		i = b; //���� ū �� ������ ���� ��
		//b = i; ���� ���� �� ������ ū �� �ȵ�
		b = (byte)i; // �����ս��� �߻���.
		
		SubCls sub= new SubCls(100,99,100); //�ڽ� ��ü
		SupCls sup = new SupCls(95,89,100); //�θ� ��ü
		SupCls sup1 = new SubCls(); // ���� �θ� ������ �ڽ� ���, �׷��� �θ��� �͸� ���� ���� . ��ĳ����
		Object sup2 = new SubCls(); // ���� ���� ������ �ڽ� ���, �׷��� ������ �͸� ���� ����
		//SubCls nsub = sup1; �θ�ü�� �ּ� ���� �ȵ�
		SubCls nsub = (SubCls)sup1; //�ڽİ�ü�� ĳ����, �� ��Ӱ��迩�� ������. �ٿ�ĳ����
		
		//SubCls sub1 = new SupCls(); // ���� �ڽ� ������ ���� �ȵ�.
		System.out.println(sub); // �޼ҵ� �������̵�= �θ��� �޼ҵ�(toString()) ��ӹ��� �ʰ�, ������ 	
		System.out.println(sup);
	}
}
