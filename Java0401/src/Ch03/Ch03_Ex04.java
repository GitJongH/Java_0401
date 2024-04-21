package Ch03;

import java.util.Scanner;

public class Ch03_Ex04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		
		while (true) {
			try {
				System.out.print("정수를 입력하세요>>");
				int num = s.nextInt();
				if(num >= 0) {
					System.out.println(day[num%7]);
				}
				else {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				
			} catch	(Exception e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				s.next();
			}
		}
	}
}
