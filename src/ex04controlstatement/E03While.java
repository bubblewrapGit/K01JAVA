package ex04controlstatement;

/*
 while문
 	: 반복의 횟수가 정해져있지 않을때 주로 사용하는 반복문이다.
 	반복의 횟수가 명확할때는 주로 for문을 사용한다.
 	형식 ]
 		반복을 위한 변수의 초기값;
		while(조건) {
			실행문장;
			증감식; <= 반복문 탁출을 위한 증감
		}
		반복의 조건이 false일때 while문을 탈출한다.
		또한 반복문의 처음으로 돌아가면 무조건 조건을 검사한다.
 */
public class E03While {

	public static void main(String[] args) {

		/*
		 시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.
		 */
		//작성1 : 10번 반복하기 위한 while문을 만든다.
		int i = 1;
		while(i <= 10) {
			System.out.println("변수i="+i);
			i++;
		}
		
		//작성2 : 수열문제 구현
		int sum = 0;
		int j = 1;
		while(j <= 10) {
			System.out.println("변수j="+j);
//			sum = sum + j; // 일반적인 방식
			sum += j; // 복합대입연산자 사용한 방식
			j++;
		}
		System.out.println("1~10까지의 합 sum="+sum);
		
		
		/*
		 시나리오] 1~100까지의 정수중 3의 배수이거나 4의배수인
		 	정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
		//작성1 : 100번 반복헤서 3 혹은 4의 배수 출력하기
		int k = 1;
		int total = 0;
		while(k <= 100) {
			if(k % 3 == 0 || k % 4 == 0) {
				total += k;
			}
			k++;
		}
		System.out.println("3또는 4의 배수의 합:" + total);
		
	}

}
