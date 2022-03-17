package week3;

public class ForEx1 {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print(" = ");	
				System.out.print(sum);
			}
		}		
	}
}
