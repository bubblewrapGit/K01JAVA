package evaluation;

public class Q6Sum2And5 {
	public static void main(String[] args) {
		int sum = 0;
        for(int i=1 ; i<=1000 ; i++) {
            if(i%2 == 0 || i%5 == 0) {
            	if(i%(2*5)!=0) {
            		sum += i;
            	}
            }
        }
        System.out.println("정답:"+sum);
	}
}
