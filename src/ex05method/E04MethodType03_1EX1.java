package ex05method;

import java.util.Scanner;

public class E04MethodType03_1EX1 {

	/*
	 시나리오] 사용자가 입력한 2개의 시작값과 끝값 사이에 있는 수를
	 모두 더하여 출력하는 프로그램을 작성하시오.
	 	출력결과[
	 		시작값 : 5
	 		종료값 : 9
	 		결과 : 5+6+7+8+9=???
	 */
	
	// 사용자가 입력 2개의 값
	
	// 2개의 값 사이 수 구하기
	
	// 모두 더하기
	
	// 나타내기

	public static void main(String[] args) {
		
		int totalNum = peopleInput();
		System.out.print(" = " + totalNum);
	}
	
	static int peopleInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작값: ");
		int startNum = scanner.nextInt();
		System.out.print("종료값: ");
		int endNum = scanner.nextInt();
		
		int sumNum = 0;
		for(int i = startNum; i <= endNum; i++) {
			System.out.print(i);
			if(i < endNum) {
				System.out.print(" + ");
			}
			sumNum += i;
		}
		
		return sumNum;
	} 
	
}
