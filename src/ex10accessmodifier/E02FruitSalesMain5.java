package ex10accessmodifier;

/*
 세번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
 */

// 과일판매자를 추상화한 클래스
class FruitSeller3{
	//멤버변수
	public int numOfApple; // 판매자가 보유한 사과갯수
	public int myMoney; // 판매수익
	public final int APPLE_PRICE; // 사과의 단가

	/*
	 	상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 	일반 멤버메서드에서는 초기화 할 수 없다.
	 	하지만 생성자는 객체 생성 시 딱 한번만 호출되고,
	 	개발자가 마음대로 호출할 수 없음으로 한번 이상 초기화 되지 않음이 보장된다.
	 	따라서 멤버상수는 생성자에서 초기화 할 수 있다.
	 */
	
	public FruitSeller3( int money, int appleNum, int price)
	{
		numOfApple = appleNum;
		myMoney = money;  
		APPLE_PRICE = price; 
	}
	
	// 멤버메서드
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수 : " + numOfApple);
		System.out.println("[판매자]판매 수익 : " + myMoney);
	}
}

// 구매자를 추상화한 클래스
class FruitBuyer3{
	public int myMoney; // 보유한 금액
	public int numOfApple; // 구매한 사과의 갯수
	
	public FruitBuyer3( int _myMoney, int _numOfApple)
	{
		numOfApple = _numOfApple;
		myMoney = _myMoney;  
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	//구매자의 현재 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액 : "+ myMoney);
		System.out.println("[구매자]사과갯수 : "+ numOfApple);
	}
	
}

// 프로그램의 출발점이 되는 메인클래스
public class E02FruitSalesMain5
{
	public static void main(String[] args)
	{
		// 판매자1 : 사과 100개, 단가 1000원
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);

		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		// 구매자 : 보유금액 10000원
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);		
		
		////////////////////////////////////////////////////////
		/*
		 아래의 코드는 문법적으로는 오류가 없으나
		 지불금액과 구매한 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다.
		 객체지량 프로그래밍에서는 이런 오류를 막기위해
		 멤버변수에 대한 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000;  //판매자1에게 1000원을 지불
		seller1.numOfApple -= 50; // 사과 50개 구매
		buyer.numOfApple += 50;   // 구매자는 50개 증가

		seller2.myMoney += 1000;  // 판매자2에게 1000원 지불
		seller2.numOfApple -= 70; // 사과 70개 구매
		buyer.numOfApple += 70;   // 구매자 70개 증가
								  // but. 구매자의 금액은 차감되지 않는다.
		
	}
}
