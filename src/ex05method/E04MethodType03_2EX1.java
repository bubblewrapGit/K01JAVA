package ex05method;

import java.util.Scanner;

public class E04MethodType03_2EX1 {

	/*
	연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
	그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
	무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메소드명 : inputGugudan(int sNum, int eNum)
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int sNum = scanner.nextInt(); 
		System.out.print("두번째 숫자를 입력하세요 : ");
		int eNum = scanner.nextInt(); 
		
		inputGugudan(sNum, eNum);
		
	}
	
	static int inputGugudan(int sNum, int eNum) {
		
		int result = 0;
		if(sNum < eNum) {
			for(int i = sNum; i <= eNum; i++) {
				for(int j = 1; j < 10; j++) {
					result = i * j;
					System.out.printf("%2d *%2d = %2d \\ ", i, j, result);
				}
				System.out.println("");
			}
		}else {
			System.out.println("두번째 숫자가 첫번째 숫자보다 작습니다.");
		}
		return result;
	} 
	
	
}
