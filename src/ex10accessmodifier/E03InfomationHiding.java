package ex10accessmodifier;

class FruitSeller6{
	// 외부클래스에서 접근할 수 없도록 private으로 선언한다.
	private int numOfApple; // 판매자가 보유한 사과갯수
	private int myMoney; // 판매수익
	private final int APPLE_PRICE; // 사과의 단가

	/*
	 	상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 	일반 멤버메서드에서는 초기화 할 수 없다.
	 	하지만 생성자는 객체 생성 시 딱 한번만 호출되고,
	 	개발자가 마음대로 호출할 수 없음으로 한번 이상 초기화 되지 않음이 보장된다.
	 	따라서 멤버상수는 생성자에서 초기화 할 수 있다.
	 */
	
	public FruitSeller6( int money, int appleNum, int price)
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

class FruitBuyer6{
	// 외부클래스에서 접근할 수 없도록 private으로 선언한다.
	private int myMoney; // 보유한 금액
	private int numOfApple; // 구매한 사과의 갯수
	
	public FruitBuyer6( int _myMoney, int _numOfApple)
	{
		numOfApple = _numOfApple;
		myMoney = _myMoney;  
	}
	
	public void buyApple(FruitSeller6 seller, int money) {
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
public class E03InfomationHiding
{
	public static void main(String[] args)
	{
		// 판매자1 : 사과 100개, 단가 1000원
		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);

		// 판매자2 : 사과 80개, 단가 500원
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);
		
		// 구매자 : 보유금액 10000원
		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		// 판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		////////////////////////////////////////////////////////
		/*
		 멤버변수를 private으로 선언하면
		 클래스 외부에서는 접근이 불가능함으로
		 아래 코드는 모루 에러가 발생하게 된다.
		 즉, 멤버변수의 정보은닉을 통해 비정상적 접근은 차단하고,
		 멤버메서드를 통해서만 구매가 이뤄질 수 있도록 구현해야한다.
		 */
		
//		seller1.myMoney += 1000;  //판매자1에게 1000원을 지불
//		seller1.numOfApple -= 50; // 사과 50개 구매
//		buyer.numOfApple += 50;   // 구매자는 50개 증가
//
//		seller2.myMoney += 1000;  // 판매자2에게 1000원 지불
//		seller2.numOfApple -= 70; // 사과 70개 구매
//		buyer.numOfApple += 70;   // 구매자 70개 증가
								  // but. 구매자의 금액은 차감되지 않는다.
		
	}
}
