package ex99test;

import java.util.Scanner;

/*
 문제3) 홀수/짝수 구분하여 배열채우기
 
 길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
 그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

실행결과]
	1번째 정수를 입력하세요:2
	2번째 정수를 입력하세요:4
	3번째 정수를 입력하세요:5
	4번째 정수를 입력하세요:3
	5번째 정수를 입력하세요:2
	6번째 정수를 입력하세요:9
	7번째 정수를 입력하세요:7
	8번째 정수를 입력하세요:8
	9번째 정수를 입력하세요:5
	10번째 정수를 입력하세요:1
순서대로입력된결과
	2 4 5 3 2 9 7 8 5 1 
홀수/짝수 구분입력결과
	5 3 9 7 5 1 8 2 4 2 


 */
public class QuFillArray
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int arr2start = 0;
		int arr2end = arr2.length - 1;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ", i+1);	
			int inputNum = scanner.nextInt();
			
			arr1[i] = inputNum;
			
			
			if(inputNum % 2 == 0) {		
				arr2[arr2end--] = inputNum;
			}else {
				arr2[arr2start++] = inputNum;
			}
		}
		
		System.out.println("====");
		
		System.out.println("순서대로 입력된 결과");
		result(arr1);

		System.out.println("====");
		
		System.out.println("홀/짝 입력된 결과");
		result(arr2);
	
	}
	
	public static void result(int[] type) {
		for(int z = 0; z < type.length; z++) {
			System.out.print(type[z] + " ");
		}
		System.out.println();
	}
	
	
}
