package test00ksb;

public class Qu_04_08 {
	
	public static void main(String[] args) {
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x+y < 5; x++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
