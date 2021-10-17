package ex99test;

import java.util.Scanner;

/*
 다음 조건에 맞는 프로그램을 작성하시오.
	1] 학생수를 사용자로부터 입력받는다.
		-Scanner클래스 사용
	2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
	3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
		-Scanner클래스 사용
	4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
	5] 이 문제는 2차원 배열을 활용하는 문제이다.

실행결과]
	학생수를 입력하세요?3
		학생수:3
	[1번째 학생의 점수 입력]
		국어점수 입력?77
		영어점수 입력?78
		수학점수 입력?79
	[2번째 학생의 점수 입력]
		국어점수 입력?82
		영어점수 입력?83
		수학점수 입력?84
	[3번째 학생의 점수 입력]
		국어점수 입력?97
		영어점수 입력?98
		수학점수 입력?99
==========================
NO KOR ENG MAT TOT AVG
==========================
1  77  78  79  234 78.00
2  82  83  84  249 83.00
3  97  98  99  294 98.00
==========================

 */
public class QuSungJuk
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요? : ");
		int peopleNum = scanner.nextInt();
		System.out.println("학생수 : " + peopleNum + "명\n");
		
		double[][] score = new double[peopleNum][5];
		double[] avg = new double[peopleNum];
				
		for(int i = 0; i < peopleNum; i++) {	
			System.out.printf("[%d번째 학생의 점수 입력]\n", i+1);
			for(int j = 0; j < score[i].length; j++) {
				if( j == 1 ) {
					System.out.print("국어점수 입력? ");
					score[i][j] = scanner.nextInt();
				}else if(j == 2) {
					System.out.print("영어점수 입력? ");
					score[i][j] = scanner.nextInt();
				}else if(j == 3) {
					System.out.printf("수학점수 입력? ");
					score[i][j] = scanner.nextInt();
				}else if(j == 4){
					for(int z = j; z > 0; z--) {
						score[i][j] += score[i][z];						
					}
				}
			}
			
			
			avg[i] = score[i][4] / 3.0f;	
			
			score[i][0] = i + 1;

			System.out.println();
		}
		
		
		System.out.println("==========================");
		System.out.println(" NO KOR ENG MAT TOT AVG");
		System.out.println("==========================");
		for(int i = 0; i < peopleNum; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3.0f ", score[i][j]);				
			}
			System.out.printf("%.2f\n", avg[i]);
		}
	
	}
}


