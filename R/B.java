package R;
import Q.A; 

public class B extends A {
	void set() {
		//pri = 1; 
		//def = 2; 다른패키지 상속받으면 안됨.
		pro = 3; //다른패키지를 상속 받으면 접근 가능함.
		pub = 4;
	}
}
