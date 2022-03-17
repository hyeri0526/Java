package week3;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		int cnt=0, score, sum = 0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요(0: 종료):");
		
		while((score = sc.nextInt()) != 0 ) {
			sum += score;
			cnt++;			
		}
		avg = (double)sum/ cnt; // 강제 형변환, 소수점까지 정확히 평균을 표시하기 위해, sum만 바꾸면 cnt는 묵시적으로 바뀜.
		System.out.println(cnt+"학생들의 성적이 입력되었습니다.");
		System.out.println("합은"+sum+"이고 평균은"+avg+"입니다.");
		sc.close();
	}
}
