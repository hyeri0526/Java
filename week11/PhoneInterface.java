package week11;

public interface PhoneInterface { //����� �޼ҵ常 ��Ƴ��� ��. ��ü�� �����Ҽ� ����. ���۷��� ���� ������ִ�.
	public static final int TIMEOUT = 10000; //���
	void sendCall(); //public abstract ��������, ������ �������ؾ���
	public abstract void receiveCall(); // ������ �������ؾ���.
	public default void printLogo() { //�ڹ� ���� 8���� private�� public�� 9�������� ����
		System.out.println("** Phone **");
	}	
}
