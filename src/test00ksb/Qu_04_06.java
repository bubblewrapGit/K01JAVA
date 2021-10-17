package test00ksb;

public class Qu_04_06 {
	
	public static void main(String[] args) {
		/*
		문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		파일명 : Qu_04_06.java
		실행결과]
		*
		* *
		* * *
		* * * *
		* * * * *
		*/
		
		int row = 1;
		while(row <= 5) {
			int col = 1;
			while(row >= col) {
				System.out.print("*");
				col++;
			}			
			System.out.println();
			row++;
		}
	
	}
}
