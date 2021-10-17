package test00ksb;

public class Qu_02_03 {

	public static void main(String[] args) {
/*
		반지름이 10인 원의 넓이를 구해 출력하시오.
		단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.
		변수명]
			int형 : area_int
			double형 : area_double
		공식]
			원의 넓이 = 반지름 * 반지름 * 3.14
		실행결과]	
			int형 넓이:314
			double형 넓이:314.0
*/		
		
		int half = 10;
		final double Fi = 3.14;
		
		int area_int = (int)(half * half * Fi);
		System.out.println("int형 : " + area_int);
		double area_double = half * half * Fi;
		System.out.println("double형 : " + area_double);
		
	}

}
