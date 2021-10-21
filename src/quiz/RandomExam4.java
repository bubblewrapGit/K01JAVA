package quiz;
import java.io.IOException;
import java.util.Random; 

public class RandomExam4 {
	public static void main(String[] args) throws IOException {
		Random random = new Random(); // 랜덤 객체 생성 
		
		// 반복문을 사용 6개의 난수 생성 
		for(int i = 0; i < 6; i++) { System.out.print("[" + (random.nextInt(45)+1) + "]"); 
		
		} 
	}
	
}


