package bokang;

import java.util.Scanner;

public class R04Array {
	public static void main(String[] args) {
		/*
		 시나리오] 정수 10개를 저장할 수 있는 배열을 생성한 후
		 반복문을 통해 1부터 순차적인 값을 입력하시오.
		 */
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1; // 1부터 값을 채움
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		/*
		 시나리오] 정수 5개를 저장할 수 있는 배열을 생성한 후 숫자를 입력받아 저장한다.
		 단, 숫자가 짝수일때만 저장할 수 있도록 프로드램을 작성하시오.
		 */
		System.out.println("========1번예제=========");		
		Scanner scanner = new Scanner(System.in);
		int[] arr2 = new int[5];
		for(int i = 0; i < arr2.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int inputNum = scanner.nextInt();
			if(inputNum % 2 == 0) {
				arr2[i] = inputNum;
				System.out.println("입력되었습니다.");				
			}else {
				System.out.println("홀수입니다.");								
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		
		/*
		 시나리오] 정수 5개를 저장할 수 있는 배열을 생선한 후 숫자를 입력받아 저장한다.
		 단, 숫자가 짝수일때만 저장해야 하고, 5개 모두입력되면 프로그램을 종료한다.
		 */
		System.out.println("========2번예제=========");		
		int[] arr3 = new int[5];
		int index = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int input = scanner.nextInt();
			if(input%2 == 0) {
				arr3[index++] = input;	
				System.out.println("입력되었습니다.");
			}
			/*
			 탈출의 조건은 짝수 5개가 입력되었을때 임으로 index가 4일때까지
			 배열에 입력된 후 후위증가(※ 배열에 적용후 증가)되어 5가 되는 순간 무한루프를 탈출한다.
			 */
			if(index == 5) break;
		}
		// 배열출력
		for(int i = 0; i< arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		System.out.println("========2번예제(bok)=========");		
		int[] arr4 = new int[5];
		int index4 = 0;
		while(index4 < arr4.length) {
			System.out.print("숫자를 입력하세요 : ");
			int inputNum = scanner.nextInt();
			if(inputNum%2 == 0) {
				arr4[index4] = inputNum;	
				System.out.println("입력되었습니다.");
			}else {
				index4--;
				System.out.println("홀수입니다. 다시입력하세요");				
			}
			index4++;
		}
		System.out.println("5개 입력이 완료되었습니다.");
		for(index4 = 0; index4 < arr3.length; index4++) {
			System.out.print(arr4[index4] + " ");
		}
		System.out.println();
	}
}
