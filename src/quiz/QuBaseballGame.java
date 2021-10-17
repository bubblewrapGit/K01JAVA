package quiz;
/*
 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
	1. 중복되지 않는 3개의 정수를 생성한다.(1~9)
	2. 사용자는 3개의 숫자를 입력한다.
	3. 생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
	4. 숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
	5. 숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
	6. 숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
	7. 3 strike 가 되면 게임은 종료된다.
	8. 시도한 횟수를 표시한다.
	9. 계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들은 아래와 같이 생성하여 구현해본다.
	   int com1, com2, com3;
	   int user1, user2, user3;
아니면 
	   int[] com = new int[3];
	   int[] user = new int[3];
와 같이 배열을 사용해도 된다. 

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import common.Student;



class RandomComData{
	@Override
	public String toString() {
		return "RandomComData [com=" + Arrays.toString(com) + "]";
	}

	int[] com = new int[3];

	public RandomComData() {
		Random random = new Random();

		while(true) {
			for(int i = 0; i < 3; i++) {
				
				for(int coms : com) {
					if(com[i] == 0 || com[0] == com[1] || com[0] == com[2] || com[1] == com[2]) {
						com[i] = random.nextInt(9) + 1;
					}
				}
			}
			break;
		}
	}
}



public class QuBaseballGame {
	
	public static void main(String[] args) {
		
		
		RandomComData comRan = new RandomComData();
		
		int[] user = new int[3];
		Scanner scanner = new Scanner(System.in);
		for(int playCnt = 0; playCnt < 10; playCnt++) {
			System.out.println("1~9까지의 숫자 3개를 입력해주세요");
			while(true) {
				for(int i = 0; i < 3; i++) {
					try {
						user[i] = scanner.nextInt();
						if(user[i] > 0 && user[i] < 10) {
							if(user[i] == user[0]) {
								
								System.out.println("같은 숫자 안돼요");
							}
						}else {
							i--;
							UserErrNum errNUm = new UserErrNum();
							throw errNUm;
						}
						
					}catch(UserErrNum e) {

					}catch(InputMismatchException e) {
						i--;
						System.out.println("문자 안되용");
						scanner.nextLine();
					}
				}

				System.out.println(Arrays.toString(comRan.com));
				System.out.println(Arrays.toString(user));
				
				int numCheck = 0;
				int strikeCnt = 0;
				int ballCnt = 0;
				int outCnt = 0;
				
				
				for(int a = 0; a < 3; a++) {
					for(int b = 0; b < 3; b++) {
						if(user[a] == comRan.com[b]) {
							if(a == b) {
								strikeCnt++;
							}else {
								ballCnt++;												
							}
						}else {
							outCnt++;
						}
					}
				}
				if(outCnt == 9) {
					System.out.println("아웃");
				}else {
					System.out.println("스트라이크 : " + strikeCnt + " / 볼 : " + ballCnt);					
				}
			}
			
			
			

			

		}
		
		
		
		

		
		
	}
}

class UserErrNum extends Exception{
	public UserErrNum() {
		System.out.println("1~9 사이의 숫자 중에 입력해주세요");
		
	}
}