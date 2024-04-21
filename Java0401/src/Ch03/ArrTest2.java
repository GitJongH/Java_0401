package Ch03;

import java.util.Scanner;

public class ArrTest2 {
	public static void main(String[] args) {
		double[] doubleArray = new double[7];
		double sumDouble = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("실수 7개 입력 >> ");
		
		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = s.nextDouble();
			sumDouble += doubleArray[i];
		}
		
		System.out.printf("배열의 원소 합=%.1f\n", sumDouble);
		System.out.println("김종현");
	}
}
