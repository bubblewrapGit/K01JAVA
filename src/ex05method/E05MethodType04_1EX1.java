package ex05method;

import java.util.Scanner;

public class E05MethodType04_1EX1 {
	
	/*
	 시나리오] 인원수를 매개변수로 전달받아 인원수 만큼
	 나이를 입력받아 그 나이의 합을 메소드를 작성하시오.
	 +
	 인원들의 나이 평균을 구하시오.
	 */
	
	public static void main(String[] args) {
//		calc(5);
		System.out.printf("여러분의 나이의 평균은 %d 입니다.", calc(5));
	}
	
	static int calc(int peopleNum) {
		
		int resultSum = 0;
		int resultAvg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= peopleNum; i++) {
		
			System.out.print("나이가 몇살이세요? ");
			int peopleInput = scanner.nextInt();
			
			resultSum += peopleInput;
	
		}
		
		resultAvg = resultSum / peopleNum;
		
		return resultAvg; 
	}
	
	
	
	
	
}
