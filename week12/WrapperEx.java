import java.util.Arrays;
import java.util.StringTokenizer;

public class WrapperEx {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		s1 =  s1.concat("123");
		String s2 = "hello";
		s2 = s2.concat("456");
		String java = "java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("Same");
		else if (res <0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);
		
		
		Integer i =10; // 아래보다 이렇게 쓰는게 낫다.
		Integer j = Integer.valueOf(20); // 박싱
		System.out.println(i + " "+j);
		System.out.println(s1);
		System.out.println(s2);
		
		String str = "java"; // 리터럴 테이블에 있는 문자열상수
		str += "is easy!!!";
		
		//StringBuffer 웹에서 문자열 다룰때 많이 사용함.
		StringBuffer sb = new StringBuffer("java"); // 힙에 있는 객체로 메소드가 훨씬 많다.
		sb.append(" is pencil.");
		sb.insert(7,  " my ");
		sb.replace(8, 10, "your");
		System.out.println(sb);
		System.out.println(str);
		
		//StringTokenizer
		String query = "name=kite&addr=seoul&age=21";  // 웹에서 get방식
		StringTokenizer st = new StringTokenizer(query,"&");
		int n = st.countTokens();
		System.out.println("토큰의 개수 =" + n);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//Math 함수
		Integer[] a = new Integer[7];
		for (int l = 0; l < a.length; l++) {
			a[l] =(int)(Math.random()*45+1);	
			
			// 중복된 값을 제거하는 반복문
			for(int search = 0; search < l; search ++){
				if(a[l] == a[search]){
					l--; // l를 앞으로 민다            
					break; // 다음 것을 검색할 필요가 없으므로 중복검사 반복을 나갑니다.        
				}
			}
		}
		
		for (int l = 0; l < a.length; l++) {
			System.out.printf("%3d", a[l]);
		}
		System.out.println();
		
		Arrays.sort(a); // 배열 정렬하기
		for (int l = 0; l < a.length; l++) {
			System.out.printf("%3d", a[l]);
		}	
	}
}
