package Ch03;

import java.util.Scanner;

public class RandomArrayBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int intArray[][];
		int row = 0, col = 0; // 행, 열
		int sumRow = 0, sumCol = 0;
		int sum = 0, total = 0;
		
		// 배열 생성
		System.out.print("행,열의 크기를 입력하시오>> ");
		row = s.nextInt();
		col = s.nextInt();
		intArray = new int[row][col];
		
		// 2행까지 1 ~ 10 사이 랜텀 초기화		
		// 나머지 행은 행의 index 값으로 초기화
		for (int i = 0; i < intArray.length; i++) { // 행번호
			for (int j = 0; j < intArray[0].length; j++) { // 열번호
				if (i < 2) {
					intArray[i][j] = (int)((Math.random() * 10) + 1);
					sum += intArray[i][j];
				}
				else {
					intArray[i][j] = i;
					sum += intArray[i][j];
				}
			}
		}
		
		System.out.print("배열\t");
		for (int i = 0; i < intArray[0].length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("행의합");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + "\t");
			for (int j = 0; j < intArray[0].length; j++) {
				System.out.print(intArray[i][j] + "\t");
				sumRow += intArray[i][j];
			}
			System.out.println(sumRow);
			total += sumRow;
			sumRow = 0;
		}
		
		System.out.print("열의합\t");
		for (int j = 0; j < intArray[0].length; j++) {
			for (int i = 0; i < intArray.length; i++) {
				sumCol += intArray[i][j];
			}
			System.out.print(sumCol + "\t");
			sumCol = 0;
		}
		System.out.println(total);
	}

}
