package test00ksb;
/*
	문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
	두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	메소드명 : arithmetic()
	
	
	실행결과]
	덧셈결과 -> 177
	뺄셈결과 -> 23
	곱셈결과 -> 7700
	나눗셈 몫 -> 1
	나눗셈 나머지 -> 23
*/

import java.util.Scanner;

public class QuSimpleOperation {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		long firstNum = 0;
		long secondNum = 0;
		
		for(long i = 0; i < 2; i++) {
			System.out.print("첫번째 정수를 입력하세요 : ");
			firstNum = scanner.nextInt();
			if(firstNum < 1) {
				System.out.println("A. 0 이상의 양의 정수를 입력하세요.");
				i = 0;
			}else {
				for(long j = 0; j < 2; j++) {
					System.out.print("두번째 정수를 입력하세요 : ");				
					secondNum = scanner.nextInt();
					if(secondNum < 1) {
						System.out.println("B. 0 이상의 양의 정수를 입력하세요.");
						j = 0;
					}else {
						System.out.println("===============================");
						System.out.println("       완료되었습니다.         ");
						System.out.println("===============================");
						arithmetic(firstNum, secondNum);
						break;
					}
				}
				break;
			}
		}
		
	}
	
	static void arithmetic(long num1, long num2) {
		long add = num1 + num2, 
			 sub = num1 - num2, 
			 multi = num1 * num2, 
			 divisionQuo = num1 / num2, 
			 divisionRem = num1 % num2;
		
		System.out.println("덧셈결과 : "+ add);
		System.out.println("뺄셈결과 : "+ sub);
		System.out.println("곱셈결과 : "+ multi);
		System.out.println("나눗셈결과(몫) : "+ divisionQuo);
		System.out.println("나눗셈결과(나머지) : "+ divisionRem);
	}
	
}
