package week6;
class MethodSample{
	//시그니처가 다르면 같은 이름의 메소드를 허용.
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
