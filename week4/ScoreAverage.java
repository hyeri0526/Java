package week4;

public class ScoreAverage {
	public static void testArr(double[][] abc) { //2*3�迭�� �ּҸ� ����. c���� double[2][]��� �������.
		System.out.println("����");
	};
	
	public static void main(String[] args) {
		double score[][] = {{4.3,4.1},
							{4.3,4.2},
							{4.3,4.4}}; //2*3 �迭
		double sum =0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
		}
		int n = score.length;
		int m = score[0].length;
		double avg = sum / (n*m);
		System.out.printf("���� %.2f �̰� ������ %.2f�Դϴ�.",sum, avg);
		testArr(score);
	}
}
