package bokang;

public class R02for_bok {
	public static void main(String[] args) {
		

		// 시나리오] 1~10까지의 합을 구하는 while문을 작성하시오.
		int total = 0;
		int a = 1;
		while(a <= 10) {
			total += a;
			a++;
		}
		System.out.println("[while] 1~10까지의 합 : " + total);
		
		
		// 시나리오] 위에서 만든 수열문제를 do~while문으로 변경하시오.
		int sum = 0;
		int b = 1;
		do {
			sum += b;
			b++;
		} while (b <= 10);
		System.out.println("[do~while] 1~10까지의 합 : " + sum);
		
		// 시나리오] 앞에서 만든 수열문제를 for문으로 변경하시오.
		int hap = 0;
		for(int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println("[for] 1~10까지의 합 : " + hap);
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		System.out.println("==[for문] 주사위 구현==");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.printf("%d + %d = %d\n", i, j, (i+j));
				}
			}
		}
		
		/*
		 연습문제] 앞의 문제를 while문으로 변경하시오.
		 */
		System.out.println("==[while문] 주사위 구현==");
		int c = 1;
		while(c <= 6) {
			int i = 1;
			while(i <= 6) {
				if(c + i == 6) {
					System.out.printf("%d + %d = %d\n", c, i, (c+i));
				}
				i++;
			}
			c++;
		}
		
		/*
		 연습문제] 앞의 문제를 do~while문으로 변경하시오.
		 */
		System.out.println("==[do~while문] 주사위 구현==");
		int d = 1;
		do {
			int i = 1;
			do {
				if(d + i == 6) {
					System.out.printf("%d + %d = %d\n", d, i, (d+i));
				}
				i++;
			} while (i <= 6 );
			d++;
		} while (d <= 6);
		
		/*
		 확장 for문 :
		 */
		
		
		/*
		 시나리오] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		 단, x,y의 범위는 0~10사이의 정수이고 while문을 통해 구현하시오.
			 실행결과]
			 	x=0, y=3
			 	x=2, y=2
			 	.........
		 */
		System.out.println("방정식을 만족하는 x, y를 while문으로 찾기");
		int e = 0;
		while(e <= 10) {
			int i = 0;
			while(i <= 10) {
				if((2*e) + (4*i) == 12) {
					System.out.printf("2x+4y=12 => x = %d / y = %d\n", e, i);
				}
				i++;
			}
			e++;
		}
		
		/*
		 연습문제] 앞의 방정식 문제를 for문으로 변경하시오.
		 */
		System.out.println("방정식을 만족하는 x, y를 for문으로 찾기");
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if((2*i) + (4*j) == 12) {
					System.out.printf("2x+4y=12 => x = %d / y = %d\n", i, j);
				}
			}
		}
		
	}
}
