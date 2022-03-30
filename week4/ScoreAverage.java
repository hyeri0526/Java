package week4;

public class ScoreAverage {
	public static void testArr(double[][] abc) { //2*3배열의 주소만 받음. c언어는 double[2][]라고 적어야함.
		System.out.println("하이");
	};
	
	public static void main(String[] args) {
		double score[][] = {{4.3,4.1},
							{4.3,4.2},
							{4.3,4.4}}; //2*3 배열
		double sum =0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
		}
		int n = score.length;
		int m = score[0].length;
		double avg = sum / (n*m);
		System.out.printf("합은 %.2f 이고 평점은 %.2f입니다.",sum, avg);
		testArr(score);
	}
}
