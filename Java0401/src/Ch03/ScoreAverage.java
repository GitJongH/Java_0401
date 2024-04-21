package Ch03;

import java.util.Iterator;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][] = { { 3.3 , 3.4 }, // 1학년 1, 2학기 평점
							{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
							{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
							{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점
		double sum = 0;
		
		for (int i = 0; i < score.length; i++) { // 각 학년별로 반복, 행번호
			for (int j = 0; j < score[0].length; j++) { // 각 학년의 학기별로 반복
				sum += score[i][j];
			}
		}
		
		// foreach 로 변환
		for (double i[] : score)
			for (double j : i)
				sum += j;
			
		
		int n = score.length; // 배열의 행 개수, 4
		int m = score[0].length; // 배열의 열 개수, 2
		
		System.out.println("4년 전체 평점 평균은 " + sum / (n * m));
	}

}
