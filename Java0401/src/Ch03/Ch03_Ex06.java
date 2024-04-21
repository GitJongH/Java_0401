package Ch03;

import java.util.Scanner;

public class Ch03_Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };

		while (true) {

			System.out.print("영어 단어를 입력하세요>>");
			String str = s.next();

			if (str.equals("exit"))
				break;
			else {
				boolean found = false;
				
				for (int i = 0; i < eng.length; i++) {
					if (str.equals(eng[i])) {
						System.out.println(kor[i]);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("그런 영어 단어가 없습니다.");
				}
			}
		}
	}
}
