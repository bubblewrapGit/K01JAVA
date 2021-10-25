package quiz;

import java.util.Random;

public class Qu4SelectionSort {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(100) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " / ");
		}
		System.out.println(" ");
		
		int temp;
		for(int i = 0; i < arr.length-1; i++) { // 0번부터 9번까지 비교
			for(int j = i+1; j < arr.length; j++) { // 1번부터 10번까지 비교
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(i+1 + "회차 >> ");
			for(int num : arr) {
				System.out.print(num + " / ");
			}
			System.out.println();
		}
		
		
		System.out.println(" ");
	}
}
//
//int wrapper = value[j];
//value[j] = value[i];
//value[i] = wrapper;