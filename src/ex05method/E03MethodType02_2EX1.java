package ex05method;

import java.util.Scanner;
/*시나리오] 사용자로부터 국, 영, 수 점수를 입력받아
 * 평균을 구한 후 학점을 반환하는 메소드를 정의하시오.
 */
public class E03MethodType02_2EX1 {

	public static void main(String[] args) {
		
		double value = result();
		
		System.out.println("너의 점수는 : " + value);
		System.out.println(value > 70 ? "잘했어" : "못했어");	

	}
	
	static double result() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng = scanner.nextInt();
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		return avg;
	}
}
