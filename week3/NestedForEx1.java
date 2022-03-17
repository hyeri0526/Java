package week3;

import java.util.Scanner;

public class NestedForEx1 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+" * "+j+" = "+i*j);
				//System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.print("\t"); //ÅÇ ¸¸Å­ ¶Ù¿ì±â
			}
			System.out.println();
			Scanner sc = new Scanner(System.in);
			sc.close();
		}
	}
}
