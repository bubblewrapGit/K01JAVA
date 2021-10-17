package quiz;
/*
 [가위바위보 게임 구현]
 가위(1),바위(2),보(3)
 
 1. 컴퓨터 난수 생성
 2. 유저 입력
 3. 비교 
 4. 출력
 
조건 ]
 	1. 숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오.
 		- 가위바위보 입력시
 		- 재시작여부 입력시
	2. 게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
시나리오 ]
	무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
	사용자 : 가위, 컴퓨터 : 보
	이겼습니다.
 */

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


class WrongNumberException extends Exception{
	public WrongNumberException() {
		super("1: 가위, 2:바위, 3:보 중에 고르시오");
	}
}

class RestartInputValueErr extends Exception{
	public RestartInputValueErr() {
		super("게임 재시작(1) | 종료(0) 중에 고르시오");
	}
}

public class QuRockPaperScissors_Exception {
	public static void main(String[] args) throws WrongNumberException{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int comValue = random.nextInt(3) + 1;
		int userValue = 0;
		int gameCnt = 0;
		
		while(true) {
			System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			
			try {
				userValue = scan.nextInt();
				
				if(userValue < 1 || userValue > 3) {
					WrongNumberException ex = new WrongNumberException();
					throw ex;
				}else {
					System.out.println("사용자 : " + checking(userValue) + ", 컴퓨터 : "+ checking(comValue));
					
					switch(userValue - comValue) {
					case 0:
						System.out.println("비겼습니다.\n");
						break;
					case 1: case -2:
						System.out.println("이겼습니다.\n");
						break;			
					case -1: case 2:
						System.out.println("졌습니다.\n");
						break;
					}
					gameCnt++;
				}
			}catch (InputMismatchException e) {
				System.out.println("[예외발생] 숫자로만 입력해야 합니다(1)");
				scan.nextLine();
			}catch(WrongNumberException e) {
				System.out.println("[예외발생] " + e.getMessage());				
			}	

			
			if(gameCnt > 4) {
				int restart;
				while(true) {
					System.out.println("게임 재시작(1) | 종료(0)");
					try {
						restart = scan.nextInt();
					
						switch(restart) {
						case 1:
							System.out.println("게임을 재시작합니다");
							gameCnt = 0;
							break;
						case 0:
							System.out.println("게임을 종료합니다");
							return;
						default:
							RestartInputValueErr restartErr = new RestartInputValueErr();
							throw restartErr;
						}
						break;
						
					}catch (RestartInputValueErr t) {
						System.out.println("[예외발생] " + t.getMessage());
					}catch(InputMismatchException t) {
						System.out.println("[예외발생] 숫자로만 입력해야 합니다(2)");
						scan.nextLine();
					}
				}
			}
		}
	}	
	
	public static String checking(int check) {
		String rpsValue ="";
		switch(check) {
		case 1:
			rpsValue = "가위"; break;
		case 2:
			rpsValue = "바위"; break;
		case 3:
			rpsValue = "보"; break;			
		}
		return rpsValue;
	}
}


