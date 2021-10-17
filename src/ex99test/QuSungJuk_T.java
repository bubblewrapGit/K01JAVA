package ex99test;

import java.util.Scanner;

public class QuSungJuk_T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수입력 : ");
		int numberOfStudent = scanner.nextInt();
		
		// 학생의 점수와 총점, 평균을 입력할 2차원배열 선언
		int[][] jumsuArr = new int[numberOfStudent][5];
		
		// 입력받은 학생수 만큼 반복
		for(int i = 0; i < numberOfStudent; i++) {
			System.out.print("국어점수입력 : ");
			int kor = scanner.nextInt();
			System.out.print("영어점수입력 : ");
			int eng = scanner.nextInt();
			System.out.print("수학점수입력 : ");
			int math = scanner.nextInt();
			
			//배열에 입력한다.
			jumsuArr[i][0] = kor;
			jumsuArr[i][1] = eng;
			jumsuArr[i][2] = math;
		}
		
		// 총점과 평균을 구한다.
		// 합산하려면 변수가 필요하다.
		for(int i = 0; i<numberOfStudent; i++) {  	// 학생을 의미
			int sum = 0; // 학생 한명의 총점(i증가 시 '0'으로 초기화)
			for(int j = 0; j<3; j++) {  // 과목을 의미
				// i번째 학생의 국,영,수 점수의 총점을 구한다.
				sum += jumsuArr[i][j];			
			}
			jumsuArr[i][3] = sum;	  // 총점을 배열에 입력
			jumsuArr[i][4] = sum / 3; // 평균을 배열에 입력			
		}
		
		// 결과 출력
		System.out.printf("NO KOR ENG MAT TOT AVG%n");
		for(int i = 0; i<numberOfStudent; i++) {  	// 학생을 의미
			
			System.out.print(i + 1 + "  "); // 학생의 순번
			for(int j = 0; j<5; j++) {  // 과목, 총점, 평균까지를 의미
				System.out.printf("%4d ", jumsuArr[i][j]);
			}
			System.out.println();
		}
	}
}


