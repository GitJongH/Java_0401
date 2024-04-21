package Ch03;

import java.util.Scanner;

public class Ch03_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		
		for (int i = 0; i < 3; i++) {
			try {
				int num = s.nextInt();
				if (num % 2 == 0) {
					System.out.println("짝수");
				}
				else {
					System.err.println("홀수");
				}
			} catch	(Exception e) {
				System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
				s.next();
			}
		}
	}

}
