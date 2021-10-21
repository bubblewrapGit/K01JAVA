package quiz;

import java.util.Random;

public class QuBubbleSort {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] value = new int[10];
		
		for(int i = 0; i < 10; i++) {
			value[i] = random.nextInt(100) + 1;
			for(int j = 0; j < i; j++) {
				if(value[i] == value[j]) {
					i--;
				}
			}
		}
		
		for(int num : value) {
			System.out.println("value의값 : " + num);
		}
		
		for(int i = 0; i < 10; i++ ) {
			
			for(int j = 0; j<10; j++) {
				
				if(value[i] > value[j]) {
					
				}
				
			}
		}
	}
}
