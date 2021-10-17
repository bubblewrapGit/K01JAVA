package test00ksb;

public class Qu_04_08_teacher {
		
	public static void main(String[] args) {
		// *를 출력할 행의 갯수를 상수로 표현
		/*
		 ROW(행의갯수) - x + 1
		 	: 변수 x가 증가함에 따라 점점 감소하는
		 	  y를 표현하기 위한 일반식 정의
		 	  x가 1일때 5 - 1 + 1 = 5
		 	  ························
		 	  x가 5일떄 5 - 5 + 1 = 1
		 */
		final int ROW = 5;
		for(int x = 1; x <= ROW; x++) {
			for(int y = 1; y <= (ROW - x + 1); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int n = 1; n <= 5; n++) {
			for( int m=1; m <= 5; m++) {
				if(n<=m) {
					System.out.print("*");					
				}
			}
			System.out.println("");
		}
	}

}
