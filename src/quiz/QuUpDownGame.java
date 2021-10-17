package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



/*
 [Game]업다운게임(Up Down Game)
게임설명 : 업다운게임을 메소드를 이용해 구현한다.

	1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
	2. 총 시도횟수는 7번을 부여한다.
	3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
	4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
	5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
	6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
	7. 함수를 사용하여 구현한다.
	8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
	- 숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오(클래스명 : NumberRangeException)
	
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.

 */

class Restart{
	public Restart() {
		System.out.println("재시작 하시겠습니까? 재시작(1) / 종료(0) : ");
		Scanner scan = new Scanner(System.in);
		
				
		while(true) {
			try {
				int userReInput = scan.nextInt();
				switch(userReInput) {
				case 1:
					System.out.println("----재시작합니다----");
					break;
				case 0:
					System.out.println("----종료합니다----");			
					return;
				default:
					System.out.println("재시작(1) / 종료(0) 중에 입력하세요.(1)");
					scan.nextLine();
					continue;
				}	
			}catch (InputMismatchException e) {
				System.out.println("재시작(1) / 종료(0) 중에 입력하세요.(2)");
				scan.nextLine();
				continue;
			}
			break;
		}
	}
}

public class QuUpDownGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		while(true) {
			
			int comNum = random.nextInt(100) + 1;
			System.out.println(comNum);
			
			for(int i = 1; i <= 7; i++) {
				Scanner scan = new Scanner(System.in); 
				System.out.print("입력하세요 : ");
				try {
					int userNum = scan.nextInt();
					try {	
						if(userNum >= 1 && userNum <= 100) {
							if(comNum > userNum) {
								System.out.println("[" + userNum + "] 보다 큽니다. -실패-");
							}else if(comNum < userNum){
								System.out.println("[" + userNum + "] 보다 작습니다. -실패-");				
							}else {
								System.out.println("성공!");
								Restart regame = new Restart();
								break;
							}
						}else {
							NumberRangeException userNumErr = new NumberRangeException();
							throw userNumErr;
						}
					}catch (NumberRangeException e) {
						i--;
						System.out.println("[예외발생] " + e.getMessage());
					}
				}catch (InputMismatchException e) {
					i--;
					System.out.println("1부터 100까지의 숫자를 입력하세요");
					scan.nextLine();
					continue;
				}
			}
			System.out.println("=====================");
			System.out.println("게임이 종료되었습니다");
			System.out.println("=====================");
			Restart regame = new Restart();
		}
	}
}

class NumberRangeException extends Exception{
	public NumberRangeException() {
		super("1~100사이의 값을 입력해주세요");
	}
}

