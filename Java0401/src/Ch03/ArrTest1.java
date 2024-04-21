package Ch03;

import java.util.Scanner;

public class ArrTest1 {

	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 5개 입력 >> ");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = s.nextInt();
		}
		
		System.out.println("=배열의 원소 출력=");
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i + "번재 원소 : " + intArray[i]);
		}
	}	

}
