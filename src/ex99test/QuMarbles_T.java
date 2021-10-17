package ex99test;

class ChildPropertyT{
	
	// 멤버변수
	int bead; // 어린이가 보유한 구슬의 갯수
	
	// 생성자 : 객체 생성시 구슬의 갯수를 전달받아 초기화
	public ChildPropertyT(int bead) {
		
		this.bead = bead;
		
	}
	// 멤버 메소드
	void showProperty() {
		System.out.println("보유 구슬의 개수 " + bead);
	}
	
	/*
	 해당 멤법메서드의 호출의 주체가 되는 객체가 beadCnt만큼 획득하고
	 매개변수로 전달되는 child객체는 구슬을 상실하게 된다.
	 */
	void obtainBead(ChildPropertyT child, int beadCnt) {
		this.bead += beadCnt;
		child.bead -= beadCnt;
		System.out.println("한 게임 종료");
	}
	
}

public class QuMarbles_T {
	
	
	public static void main(String[] args)
	{        	
		ChildPropertyT child1 = new ChildPropertyT(20);
		ChildPropertyT child2 = new ChildPropertyT(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
	}

}
