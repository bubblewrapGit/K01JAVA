package test00ksb;

public class Qu_04_09 {
	
	public static void main(String[] args) {
		
		int v1, num;
		for(v1 = 1; v1 < 10; v1++) {
			for(num = 2; num < 10; num++) {
				int total= v1 * num;
				System.out.printf("%2d * %1d = %2d ", num, v1, total);
			}
			System.out.println("");
		}
	}
}
