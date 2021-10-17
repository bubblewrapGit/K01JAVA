package test00ksb;

public class Qu_04_07 {
		
	public static void main(String[] args) {
		/*
		문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
		파일명 : Qu_04_07.java
		실행결과]
			3+6+7+~~~~~~=????
		*/
		int num = 1;
		int sum = 0;
		int three = 100 / 3 * 3; // 100보다 작은 3의배수 최댓값
		while(num <= 100) {
			if(num % 3 == 0 || num % 7 == 0) {
				if(!(num % (3*7) == 0)) {
					System.out.print(num);
					sum += num;
					if(num < three) {
						System.out.print(" + ");
					}else {
						System.out.print(" = ");
					}
				}				
			}
			num++;
		}
		System.out.print(sum);
		
	}

}
