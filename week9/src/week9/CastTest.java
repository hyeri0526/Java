package week9;

public class CastTest {

	public static void main(String[] args) {
		byte b = 1; int i =6;
		i = b; //왼쪽 큰 것 오른쪽 작은 것
		//b = i; 왼쪽 작은 것 오른쪽 큰 것 안됨
		b = (byte)i; // 정보손실이 발생함.
		
		SubCls sub= new SubCls(100,99,100); //자식 객체
		SupCls sup = new SupCls(95,89,100); //부모 객체
		SupCls sup1 = new SubCls(); // 왼쪽 부모 오른쪽 자식 허용, 그러나 부모의 것만 접근 가능 . 업캐스팅
		Object sup2 = new SubCls(); // 왼쪽 조상 오른쪽 자식 허용, 그러나 조상의 것만 접근 가능
		//SubCls nsub = sup1; 부모객체의 주소 접근 안됨
		SubCls nsub = (SubCls)sup1; //자식객체로 캐스팅, 꼭 상속관계여야 가능함. 다운캐스팅
		
		//SubCls sub1 = new SupCls(); // 왼쪽 자식 오른쪽 조상 안됨.
		System.out.println(sub); // 메소드 오버라이딩= 부모의 메소드(toString()) 상속받지 않고, 재정의 	
		System.out.println(sup);
	}
}
