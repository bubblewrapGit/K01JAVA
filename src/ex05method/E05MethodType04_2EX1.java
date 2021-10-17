package ex05method;

import java.util.Scanner;

public class E05MethodType04_2EX1 {

	/*
	 시나리오] 여러개의 숫자를 입력받은 후 최대값을 구하는 메소드를
	 정의하시오. 단, 숫자의 갯수는 매개변수로 전달받고 숫자의 갯수만큼
	 Scanner클래스를 통해 입력받는다.
	 입력받은 숫자 중 최대값을 찾아서 반환하도록 정의한다.
	 */
	
	public static void main(String[] args) {
		System.out.printf("입력하신 값 중 최댓값은 : %d 입니다.", maxCalc(3));
	}
	
	static int maxCalc(int numCnt) {
		
		int maxNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= numCnt; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int inputNum = scanner.nextInt();
			if(i == 1) {
				maxNum = inputNum;
			}else {
				if(maxNum < inputNum) {
					maxNum = inputNum;					
				}else {
					
				}
			}
		}
		return maxNum;
	}
	
	
}
