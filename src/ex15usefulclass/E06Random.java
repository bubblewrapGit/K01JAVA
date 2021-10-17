package ex15usefulclass;

import java.util.Random;

public class E06Random {
	public static void main(String[] args) {
		
		System.out.println("### 난수생성1 : seed로 32를 사용");
		Random random1 = new Random(32);
		for(int i = 0; i< 10; i++) {
			System.out.println(random1.nextInt(100));
		}
		
		System.out.println("### 난수생성2 : seed 없음");
		Random random2 = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.println(random2.nextInt(100));
		}

		System.out.println("### 난수생성3 : 항상 다른 seed를 사용");
		Random random3 = new Random();
		// 현재 시간을 밀리 초 단위로 반환하는 메소드
		random3.setSeed(System.currentTimeMillis());
		for(int i = 0; i < 10; i++) {
			System.out.println(random2.nextInt(100));
		}
		
		System.out.println("### 난수생성4 : 항상 다른 seed를 사용, nextInt() 인자없음");
		Random random4 = new Random();
		// 현재 시간을 밀리 초 단위로 반환하는 메소드
		random4.setSeed(System.currentTimeMillis());
		for(int i = 0; i < 10; i++) {
			System.out.println(random4.nextInt());
		}
		
		
	}
		
	
}
