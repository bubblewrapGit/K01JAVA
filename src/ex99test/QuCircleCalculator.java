package ex99test;

import java.util.Scanner;

/*
	원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 	정의하자. 이를 호출하는 main 메소드를 정의하라.
	
	메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
		- 넓이공식 : 3.14 * 반지름 * 반지름
		- 둘레공식 : 2 * 3.14 * 반지름
	
	실행결과]
		원의 둘레(5.5) : 34.54
		원의 넓이(5.5) : 94.985
*/



public class QuCircleCalculator {
	
	final static double Fi = 3.14;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		double circleHalfRound = scanner.nextDouble();
		
		System.out.printf(
			"원의 넓이(%.1f) : %.3f",
			circleHalfRound,
			circleArea(circleHalfRound)
		);
		
		System.out.println("");
		
		System.out.printf(
			"원의 둘레(%.1f) : %.2f",
			circleHalfRound,
			circleRound(circleHalfRound)
		);
	}
	// 원의 넓이
	static double circleArea(double inputData) {
		double result = Fi * inputData * inputData;
		return result;
	}
	// 원의 둘레
	static double circleRound(double inputData) {
		double result = 2 * Fi * inputData;
		return result;
	}
}
