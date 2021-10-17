package ex99test;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
	화씨 = 1.8 * 섭씨 + 32
	섭씨 = (화씨 - 32) / 1.8
*/

import java.util.Scanner;

public class QuTemperature {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요 : ");
		double celsius = scanner.nextDouble();
		System.out.print("화씨를 입력하세요 : ");
		double fahrenheit = scanner.nextDouble();
		
		fromCelToFa(celsius);
		System.out.println("");
		fromFaToCel(fahrenheit);
	}
	
	// 섭씨(Cel) > 화씨(Fa) 
	static double fromCelToFa(double cel) {
		double resultFa = 1.8 * cel + 32;
		
		System.out.printf("섭씨 [%.3f °C]를 화씨로 변환 : [%.3f °F]", cel, resultFa);
		return resultFa;
	}
	
	// 화씨(Fa) > 섭씨(Cel)
	static double fromFaToCel(double fah) {
		double resultCel = (fah - 32) / 1.8;
		
		System.out.printf("화씨 [%.3f °F]를 섭씨로 변환 : [%.3f °C]", fah, resultCel);
		return resultCel;
	}

}
