package week7;

public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point(); 	// Point ��ü ����
		p.set(1, 2); 						// Point Ŭ������ set() ȣ��
		p.showPoint();
		System.out.println(p.toString()); //p�� �޸� �ּ�(heap)�� �ؽ��ڵ�� ���->Point Ŭ������ toString �������̵��ϸ� �ʵ尪 ���
		System.out.println(p); //��ü�� ����϶�� �ϸ� toString()ȣ��(ObjectŬ������ ��ӹ���)->�������̵�	
		
		ColorPoint cp = new ColorPoint(); 
		cp.set(3, 4); 						// Point Ŭ������ ��� �޾����Ƿ� set() ȣ��
		cp.setColor("red"); 			// ColorPoint�� setColor() ȣ��, 10,20���� �ٲپ���.
		cp.showColorPoint(); 		// �÷��� ��ǥ ���
	}

}
