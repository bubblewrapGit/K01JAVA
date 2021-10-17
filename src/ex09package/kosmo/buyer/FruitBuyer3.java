package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller3;

//구매자를 추상화한 클래스
public class FruitBuyer3 {
	int myMoney; // 보유한 금액
	int numOfApple; // 구매한 사과의 갯수
	
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
