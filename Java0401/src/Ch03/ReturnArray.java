package Ch03;

public class ReturnArray {
	static int[] makeArray() { // makeArray가 종료해도 생성된 배열은 소멸되지 않음
		int[] temp = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i; // 배열 초기화
		}
		return temp; // 배열 리턴
	}
	
	public static void main(String[] args) {
		int[] intArray;
		intArray = makeArray(); // 메소드가 리턴한 배열 참조
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
