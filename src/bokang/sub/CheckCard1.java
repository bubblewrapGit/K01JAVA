package bokang.sub;

/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/

public class CheckCard1 {
	// 멤버 변수
	public long cardNumber; // 카드번호
	public String owner; 	// 소유자
	public int balace;		// 잔액
	public int point;		// 포인트
	
	// 멤버 메서드
	//// 충전(입금)
	public void charge(int amount) {
		// 현재잔고에 충전할 금액을 amount원 더해준다.
		this.balace += amount;
	}
	//// 결제
	public void payment(int amount) {
		// 현재잔고에서 사용한 금액을 차감한다.
		this.balace -= amount;
		// 체크카드 사용시 적립금이 발생함됨으로 '적립메서드'를 호출한다.
		savingPoint(amount);
	}
	//// 적립
	public void savingPoint(int amount) {
		double plusPoint = amount * 0.1;
		/*
		 복합대입연산자의 특성상 자료형은 항상 좌측항을 따라간다.
		 따라서, 형변환에 대한 에러가 발행하지 않는다.
		 ↓ */
		this.point += plusPoint;
//		this.point = this.point + plusPoint; <= 실수를 정수에 대입할 수 없음으로 에러발생.(자료형 크기 : 실수>정수)
	}
	//// 현재상태출력
	public void showState() {
		System.out.println("카드번호 : " + this.cardNumber);
		System.out.println("소유자 : " + this.owner);
		System.out.println("잔고 : " + this.balace);
		System.out.println("포인트 : " + this.point);
	}
}
