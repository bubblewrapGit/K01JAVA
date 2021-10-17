package quiz;

import java.util.Random;
import java.util.Scanner;

/*
 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
	난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
	
	사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
	
	승부를 판단하여 출력한다.
	1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
	숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
	게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
	0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
실행결과]
	무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
	사용자 : 가위, 컴퓨터 : 보
	이겼습니다.
	
	무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 4
	가위바위보 할줄 모르세요? 제대로 내세요^^;
	
	….게임진행...
	
	5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 1
	
	….게임재시작…
	
	5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 0
	게임이 종료되었습니다. 감사합니다.
	
	….게임종료….
 */

// 컴퓨터 난수 생성
class ComOutput{
	int comValue;
	
	public ComOutput() {
		for(int i = 0; i <100; i++) {
			int comOne = (int)(Math.random()*10);
			if(comOne < 1 || comOne > 3) {
				continue;
			}else {
				comValue = comOne;				
			}	
		}
	}
}

// 사용자의 입력(단, 올바르지 않은 입력값은 무한루프)
class UserOutout{
	int userValue;
	
	Scanner scanner = new Scanner(System.in);
	
	public UserOutout() {
		
		while(true) {
			userValue = scanner.nextInt();
		
			switch(userValue) {
			case 1: case 2: case 3:
				return;

			default:
				System.out.print("(1)가위, (2)바위, (3)보 중 하나를 고르세요. ");
				break;
			}
		}
	}
}

// 가위바위보 게임
class RPS{
	public RPS(int rpsCnt) {

		UserOutout userOutput = new UserOutout();
		ComOutput comOutput = new ComOutput();
		
		if(userOutput.userValue > 0 && userOutput.userValue < 4) {

			if(userOutput.userValue == 1) {
				System.out.printf("사용자 : 가위, ");
				if(comOutput.comValue == 1) {
					System.out.printf("컴퓨터 : 가위\n");
					System.out.println("비겼습니다.");
				}else if(comOutput.comValue == 2) {
					System.out.printf("컴퓨터 : 바위\n");
					System.out.println("졌습니다.");				
				}else if(comOutput.comValue == 3) {
					System.out.printf("컴퓨터 : 보\n");
					System.out.println("이겼습니다.");				
				}
				
				if(rpsCnt < 4) {
					System.out.println("======================");
					System.out.println("      게임진행...     ");
					System.out.println("======================");
				}else {
					System.out.println("======================");
					System.out.println("      게임종료     ");
					System.out.println("======================");
				}
			}else if(userOutput.userValue == 2) {
				System.out.printf("사용자 : 바위, ");
				if(comOutput.comValue == 1) {
					System.out.printf("컴퓨터 : 가위\n");
					System.out.println("이겼습니다.");				
				}else if(comOutput.comValue == 2) {
					System.out.printf("컴퓨터 : 바위\n");
					System.out.println("비겼습니다.");
				}else if(comOutput.comValue == 3) {
					System.out.printf("컴퓨터 : 보\n");
					System.out.println("졌습니다.");				
				}
				
				if(rpsCnt < 4) {
					System.out.println("======================");
					System.out.println("      게임진행...     ");
					System.out.println("======================");
				}else {
					System.out.println("======================");
					System.out.println("      게임종료     ");
					System.out.println("======================");
				}
			}else if(userOutput.userValue == 3) {
				System.out.printf("사용자 : 보, ");
				if(comOutput.comValue == 1) {
					System.out.printf("컴퓨터 : 가위\n");
					System.out.println("졌습니다.");				
				}else if(comOutput.comValue == 2) {
					System.out.printf("컴퓨터 : 바위\n");
					System.out.println("이겼습니다.");				
				}else if(comOutput.comValue == 3) {
					System.out.printf("컴퓨터 : 보\n");
					System.out.println("비겼습니다.");
				}
				
				if(rpsCnt < 4) {
					System.out.println("======================");
					System.out.println("      게임진행...     ");
					System.out.println("======================");
				}else {
					System.out.println("======================");
					System.out.println("      게임종료     ");
					System.out.println("======================");
				}
			}
		}
	}
}


public class QuRockPaperScissors {
	public static void main(String[] args) {

		while(true) {	
			int cnt = 0;
			for(cnt = 0; cnt < 5; cnt++) {
				System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");	
				if(cnt >= 0 && cnt <= 4) {
					RPS rps = new RPS(cnt);
				}else {
					System.err.println("올바른 숫자를 입력하세요");
				}
			}
			
			System.out.println();
			System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
			while(true) {
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();
				
				switch(choice) {
					case 1:
						System.out.println();
						System.out.println("-------------------------------------------------------"); 
						System.out.println("                        게임 재시작                    "); 
						System.out.println("-------------------------------------------------------"); 
					break;
					
					case 0:
						System.out.println("오징어게임 종료"); 
					return;
					
					default:
						System.out.print("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요… : "); continue;
				}
				break;
			}
		}
	}
}



















