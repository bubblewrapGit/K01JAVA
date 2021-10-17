package ex99test;
/*
 상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로
 다음 클래스의 적절한 생성자를 삽입해보자.
 그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.

실행결과]
	남은가솔린:10
	남은전기량:20
	남은워터량:30


 */
class Car{
       	int gasoline;
       	public Car(int i) {
       		gasoline = i; 
		}
}
class HybridCar extends Car{
       	int electric;
       	public HybridCar(int i, int j) {
			super(i);
			electric = j;
		}
}
class HybridWaterCar extends HybridCar{
       	int water;
       	
       	// 생성자는 클래스명과 동일하고 반환타입이 없다.
       	// 접근지정자는 큰 이유가 없다면 무조건 public으로 지정한다.
       	public HybridWaterCar(int i, int j, int k) {
       		//부모클래스 인자 생성자 호출
       		super(i, j);
       		water = k;
		}

		public void showNowGauge(){
			
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args){
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}

