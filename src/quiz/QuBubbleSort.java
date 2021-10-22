package quiz;

import java.util.Random;

public class QuBubbleSort {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] value = new int[10];
		
		for(int i = 0; i < 10; i++) {
			value[i] = random.nextInt(10) + 1;
			for(int j = 0; j < i; j++) {
				if(value[i] == value[j]) {
					i--;
				}
			}
		}
		
		for(int num : value) {
			System.out.print(num + " / ");
		}
		System.out.println(" ");
		
		for(int i = 0; i < value.length - 1; i++ ) {
			
			for(int j = 1; j < value.length - i; j++) {
				
				if(value[i] > value[j]) {
					
				}
				
			}
			System.out.print("변환 : " + i + " = " + value[i] + " / ");
		}
	}
}
//
//int wrapper = value[j];
//value[j] = value[i];
//value[i] = wrapper;