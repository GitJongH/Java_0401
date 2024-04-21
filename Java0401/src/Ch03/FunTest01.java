package Ch03;

import java.util.Scanner;

public class FunTest01 { // 메소드는 일반적으로 public 접근 지정을 가짐
/*
	정수 n을 매개변수로 가져와 구구단 중 n단을 함수 안에서 출력하는 함수 GuGu를 작성하소 아래와 같이 출력 되도록 main
	정수 입력 >> 2
	2*1=2	2*2=4	2*3=6	2*4=8	2*5=10	2*6=12	2*7=14	2*8=16	2*9=18
 */
	public static void GuGu(int n) {
		for (int i = 0; i < 10; i ++) {
			System.out.print(n + "*" + i + "=" + n*i + "\t");
		}
		System.out.println();
	}
// s ~ e 까지의 합을 구해서 return sum(), 매개변수는 시작값 s, 끝값 e를 가짐'
	public static int sum (int s, int e) {
		int total = 0;
		for (int i = s; i <= e; i++) {
			total += i;
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("단 입력 >> ");
		int dan = s.nextInt();
		GuGu(dan);
		GuGu(5);
		GuGu(10);
		
		int num = sum(1, 10);
		System.out.println("1 ~ 10 가지의 합 = " + num);
		System.out.println("5 ~ 15 까지의 합 = " + sum(5, 15));
	}

}
