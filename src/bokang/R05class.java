package bokang;

import bokang.sub.CheckCard1;
import bokang.sub.CheckCard2;
import bokang.sub.CheckCard3;

public class R05class {
	public static void main(String[] args) {
		CheckCard1 cc1 = new CheckCard1();
		/*
		 
		[가능] 숫자를 구분할때 구분자로 언더바(언더스코어)를 사용할 수 있다.
			※ JDK7부터 지원되었으며 숫자사이에 쓰는 것만 허용된다.
		 	- 숫자의 처음이나 끝
			- 소수점 앞,뒤
			- F나 L의 앞
			- In positions where a string of digits is expected (정확한 해석이 필요하다... 8진수나 16진를 나타내는 문자위치가 아닌가 싶다)
		[불가능] 언더바로 시작하거나 끝날 수 없으며, 소수점과 연결해서도 사용할 수 없다.
			not) - 3._14159
			not)123_456_
			not)_123_456
		 */
		
		// 체크카드 클래스 Ver01
		cc1.cardNumber = 1111_2222_3333_4444L;
		cc1.owner = "홍길동";
		cc1.balace = 10000;
		cc1.point = 0;
		
		cc1.payment(5000);	// 5000원 결제
		cc1.payment(10000);	// 10000원 결제
		cc1.showState();	// 상태를 보면 마이너스 금액이 출력된다.(논리적오류)
		cc1.balace = 10000000; // 입금처리 없이 잔고의 변경이 가능하다.(논리적오류)
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 체크카드 클래스 Ver02
		CheckCard2 cc2 = new CheckCard2();						// ①. 빈객체 생성
		cc2.initMembers(9999_8888_7777_6666L, "유비", 3000, 0); // ②. 객체 초기화
		cc2.charge(4000);
		cc2.payment(9000);
		cc2.showState();
		
		// 멤버변수가 private으로 정보은닉 되었음으로 직접 접근 불가능
//		cc2.balace = 10000000;	[에러발생]
//		cc2.point = 10000000;	[에러발생]
		
		
		/*
		 위와 같이 초기화 메서드를 사용하면 객체생성, 초기화를 별도로 진행해야하지만,
		 생성자를 사용하면 초기화까지 동시에 진행할 수 있다.
		 즉, 객체생성은 생성자를 사용하는게 좋다.
		 */
		CheckCard2 cc2_1 = new CheckCard2(1111_2222_3333_4444L, "제갈량", 10000, 0);
		cc2_1.payment(5000);
		cc2_1.showState();
		
		System.out.println();
		System.out.println("=========3번시작=======");
		
		CheckCard3 cc3_1 = new CheckCard3(1111_2222_3333_4444L, "제갈량", 10000, 0);
		cc3_1.payment(5000);
		cc3_1.showState();

		System.out.println("================");
		
		CheckCard3 cc3_2 = new CheckCard3(0111_2222_3333_4444L, "관우");
		cc3_2.charge(4000);
		cc3_2.payment(9000);
		cc3_2.showState();

	}
}
