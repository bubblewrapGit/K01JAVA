package ex06array;
/*
 * Call by reference(참조에 의한 호출)
 * 	: 메소드를 호출할 때 참조값을 전달함으로써 서로 다른 지역에서도 동일한 메모리(heap)를 참조할 수 있게 하는 호출방식.
 * 	  메소드의 지역이 다르더라도 참조값을 통해 참조하게 됨으로 A영역에서 값의 변경이 B영역에서도 그대로 참조할 수 있는 장점이 있다.
 * 	  참조값만 전달함으로 프로그램의 퍼포먼스(성능)도 향상되고 메모리도 절약할 수 있다.
 */
public class E04CallByReference {

	public static void main(String[] args) {
		// 배열변수를 생성한다.
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap전 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		// 배열의 참조값을 인자로 전달한다.
		callByReference(arr);
		
		// 교환된 결과를 출력한다.
		System.out.println("[메인메소드]-Swap이후 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	static void callByReference(int[] ref) {
		// 배열의 각 요소를 교환한다.
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		System.out.println("[callByReference메소드]-Swap이후 출력");
		// 교환한 결과가 참
		for(int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]+" ");
		}
		System.out.println();
	}
}
