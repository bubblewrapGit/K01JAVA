package ex07string;

public class E02StringMethod
{
	public static void main(String[] args)
	{
		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		System.out.println("\n==[1]==\n");
		/*
		 1] length()
		 	: 문자열의 길이를 반환한다.
		 */
		System.out.println("str1의 길이 : "+ str1.length());
		System.out.println("str2의 길이 : "+ str2.length());
		
		System.out.println("\n==[2]==\n");
		/*
		 2] charAt(인덱스)
		 	: 문자열에서 특정 index에 해당하는 문자 하나를 반환한다.
		 	  index는 배열과 같이 0부터 시작한다.
		 */
		System.out.println("str1의 두번째 문자 : "+ str1.charAt(1));
		System.out.println("str2의 두번째 문자 : "+ str2.charAt(1));
		
		/*
		 시나리오] 주민등록번호를 이용하여 성별을 판단하는 프로그램을 작성하시오.
			190419-3000000 => 남자
			190419-4000000 => 여자
		 */
		
		String juminNum = "190419-5000000";
		// 문자열에서 문자 하나를 뽑아 비교함으로 싱글쿼데이션을 사용해야 한다.
		if(juminNum.charAt(7) == '1' || juminNum.charAt(7) == '3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7) == '2' || juminNum.charAt(7) == '4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7) == '5' || juminNum.charAt(7) == '6') {
			System.out.println("외국인입니다.");
		}else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
		
		
		System.out.println("\n==[3]==\n");
		/*
		 3] compareTo()
		 	: 두 문자열의 첫번째 문자부터 순차적으로 비교하ㅓ면서
		 	  앞 문자열의 아스키코드가 크면 양수를 반환하고
		 	  뒷 문자열의 아스키코드가 크면 음수를 반환한다.
		 	  두 문자열의 같을때 0을 반환한다.
		 */
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4)); // -1
		System.out.println(str4.compareTo(str3)); // 1
		System.out.println("ABC".compareTo("ABC") == 0 ? "문자열이 같다" : "문자열이다르다");
		
		System.out.println("\n==[4]==\n");
		/*
		 4] concat()
		 	: 두개의 문자열을 연결할 때 사용한다. 
		 	  + 기호와 동일한 역할을 한다.
		 */
		System.out.println("JAVA".concat(" WORLD").concat(" Go"));
		System.out.println("JAVA" + " WORLD" + " Go");
		
		System.out.println("\n==[5]==\n");
		/*
		 5] contains()
		 	: 해당 문자열을 포함하는지 아닌지 true false로 반환한다.
		 */
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		
		/*
		 시나리오] 해당 문자열이 이메일 형식인지 검사하는 프로그램을 작성하시오.
		 hong@ikosmo.co.kr => 이메일형식임
		 not@naver => 이메일형식이 아님
		 */
		System.out.println("---EX---");
		String email1 = "hong@ikosmo.co.kr";
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		}else {
			System.out.println("이메일 형식이 아님");
		};
		
		System.out.println("\n==[6,7]==\n");
		/*
		 6] endsWith()
		 	: 특정 문자열로 끝나면 true를 반환한다.
		 7] startsWith()
		 	: 특정 문자열로 시작되면 true를 반환한다.
		 */
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		System.out.println("\n==[8]==\n");
		/*
		 8] format()
		 	: 출력형식을 지정하여 문자열로 반환하고 싶을때 사용한다.
		 	  printf()와 사용법은 동일하고, 주로 웹애플리케이션(JSP)을 제작할 때 주로 사용한다.
		 */
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", 81, 92, 100);
		
		String formatStr = 
				String.format("국어:%d, 영어:%d, 수학:%d\n", 81, 92, 100);
		System.out.print(formatStr);
		
		System.out.println("\n==[9]==\n");
		/*
		 9] indexOf()
		 */
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println(email1.indexOf("@") != -1 ? "이메일형식맞음" : "이메일형식아님");
		
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-") + 1;
		if(juminNum.charAt(index)=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		System.out.println("\n==[10]==\n");
		/*
		 10] lastIndexOf()
		 	: 사용법은 indexOf()와 동일하나 문자열의 뒤에서부터 찾는 것이 다르다.
		 */
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf : " + str1.indexOf("a"));
		System.out.println("lastIndexOf : " + str1.lastIndexOf("a"));
		
		System.out.println("\n==[11]==\n");
		/*
		 11] replace
		 	: 특정 문자열을 찾아서 지정된 문자열로 변경한다.
		 	  만약 찾는 '문자열'이 없다면 변경만 되지 않을뿐 에러가 발생하지는 않는다.
		 */
		System.out.println("J를 G로 변경하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("java를 KOSMO로 변경하기");
		System.out.println(str1.replace("java", "KOSMO"));
		
		System.out.println("\n==[12]==\n");
		/*
		 12] split()
		 	: 문자열을 구분자를 통해 분리해서 String타입의 배열로 반환한다.
		 	  해당 구분자가 없는 경우에는 크기가 1인 배열로 반환된다.
		 */
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i = 0; i < phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n", i, phoneArr[i]);
		}
		
		System.out.println("\n==[13]==\n");
		/*
		 [13] substring()
		 	: 시작인덱스와 끝인덱스 사이의 문자열을 잘라서 반환해준다.
		 	  사용1 : substring(인덱스); => 인덱스부터 끝까지 잘라낸다.
		 	  사용2 : substring(시작인덱스, 끝인덱스); => 인덱스에 해당하는 부분만 잘라서 반환.
		 */
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		/*
		 시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오
		 파일명 : my.file.images.jpg
		 */
		
		String filename = "my.file.images.jps";
		// 파일명의 뒷부분부터 .의 위치를 찾아낸다.
		int beginIndex = filename.lastIndexOf(".") + 1;
		System.out.println("파일의 확장자는 : " + filename.substring(beginIndex));
		
		System.out.println("\n==[14]==\n");
		/*
		 14] codePointAt(인덱스)
		     : 문자열의 특정 인덱스의 문자를 찾은 후 아스키코드(유니코드)를 반환한다.
		 */
		System.out.println("str1 첫번째 문자의 아스키코드 : " +str1.codePointAt(0));
		System.out.println("str2 첫번째 문자의 아스키코드 : " +str2.codePointAt(0));
		
	}
}
