package Ch03;

import java.util.Scanner;

public class ArrTest4 {

	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] stringArray = new String[5];
		int nameLength = 0, max = 0;
		
		System.out.print("5명의 학생 이름 입력>> ");
		
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = s.next();
			if (stringArray[i].length() > nameLength) {
				nameLength = stringArray[i].length();
				max = i;
			}
		}
		
		System.out.println("가장 길이가 긴 이름은 " + stringArray[max] + "입니다.");
	}
}
