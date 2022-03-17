package week3;

public class WhileEx1 {
	public static void main(String[] args) {
		int i=0, sum =  0;
		i = 1; //초기값		
		while(i<=10) { //조건식
			sum += i;
			System.out.print(i);
			
			if(i<=9){
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.print(sum);
			}
			i++; //증감값
		}
	}
}
