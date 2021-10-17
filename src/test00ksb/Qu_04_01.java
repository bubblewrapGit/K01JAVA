package test00ksb;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		/*
		문제1) 파일명 : Qu_04_01.java
			하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
			(System.in.read()를 사용하세요)
		실행결과]
			하나의 문자를 입력하세요:a
			숫자가아닙니다
			하나의 문자를 입력하세요:7
			숫자입니다
		*/
		System.out.println("하나의 문자를 입력하세요");
		int check = System.in.read();
		if(check >= 48 && check <= 57 ) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
	}

}
