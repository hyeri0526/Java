package week6;
class MethodSample{
	//�ñ״�ó�� �ٸ��� ���� �̸��� �޼ҵ带 ���.
	int overloadingEx(int i, int j) {
		return i +j;
	}
	int overloadingEx(int i, int j, int k) {
		return i +j;
	}
	double overloadingEx(double i, double j) {
		return i +j;
	}
	double overloadingEx(double i, int j) {
		return i +j;
	}
	double overloadingEx(int i, double j) {
		return i +j;
	}	
}																
public class OverloadingEx {

}
