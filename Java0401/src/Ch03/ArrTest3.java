package Ch03;

import java.util.Scanner;

public class ArrTest3 {

	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] intArray = new int[5];
		int count = 0;
		
		System.out.print("정수 5개 입력 >> ");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = s.nextInt();
			if (intArray[i] > 5) {
				count++;
			}
		}
		
		System.out.println("5보다 큰 원소 개수 : " + count + "개");
	}
}
