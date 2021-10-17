package ex11static;
/*
 static variable(정적변수)
 - 멤버변수 앞에 static키워드가 붙으면 정적변수가 된다.
 - 정적변수는 JVM(자바가상머신)에 의해 프로그램이 시작되는 시점에 초기화된다.
 - main() 메서드가 실행되기전에 이미 초기화됨으로 main()메서드
 	실행시 별도의 선언 없이 변수를 사용할 수 있다.
 접근방법]
 	- 클래스 내부 : 변수명으로 접근가능(일반적인 멤버변수와 동일함)
 	- 클래스 외부 : 참조변수를 통한 접근 or 클래스명을 통한 접근 둘다 가능하다.
 					단, 클래스명으로 접근할 것을 권장한다.
 */
class MyStatic{
	/*
	 멤버변수] 인스턴스형 멤버변수는 반드시 클래스의 객체를 생성한 후
	 	참조변수를 통해 접근해야한다.
	 */
	int intstanceVar;
	/*
	 정적멤버변수] 객체를 생성할 필요없이 클래스명으로 바로 접근할 수 있다.
	 	프로그램 시작시 이미 메소드 영역에 로드된다.
	 */
	static int staticVar;
	
	/*
	 인스턴스형 멤버메소드] 인스턴스형 메소드에서는 모든 멤버를 사용할 수 있다.
	 	인스턴스형 변수, 정적 변수 둘 다 접근 가능하다.
	 */
	void instanceMethod() {
		System.out.println("instanceVar = "+ intstanceVar); // 접근가능
		System.out.println("staticVar = "+ staticVar); // 접근가능
		staticMethod(); // 접근가능
	}
	
	/*
	 정적 멤버메소드] 정적 메소드 안에서는 인스턴스형 멤버를 사용할 수 없다.
	 	정적 멤버만 접근할 수 있다. 즉, 정적으로 호출된 메서드는 정적인 놈들만 호출가능
	 	(※ main 메소드에서는 static으로 선언된 메소드만 호출할 수 있었음을 기억하자)
	 */
	static void staticMethod() {
//		System.out.println("instanceVar = "+ intstanceVar); // 오류발생
		System.out.println("staticVar = "+ staticVar);
//		instanceMethod(); // 오류발생	
	}
}

public class E01StaticModifier {
	public static void main(String[] args) {
		
		/*
		 일반적인 멤버변수에 접근하는 방법
		 	: MyStatic클래스의 객체를 생성한 후 참조변수를 통해 접근한다.
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.intstanceVar = 100;
		System.out.println("myStatic.instanceVar = " + myStatic.intstanceVar);
		
		/*
		 static(정적) 멤버변수 접근 방법
		 	: 클래스명을 통해 직접 접근한다. 객체를 생성하지 않고도 바로 접근할 수 있다.
		 */
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar = " + MyStatic.staticVar);
		
		/*
		 정적변수도 일반적인 멤버변수처럼 참조변수를 통해 접근하는 것이 문법적으로는 가능.
		 단, Java에서는 클래스명을 통해 접근하기를 권장한다. (즉, 위와 같이 써라)
		 */
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.intstanceVar = 100;
		ms2.intstanceVar = 1000;
		
		System.out.println("ms1.intstanceVar = " + ms1.intstanceVar); // 100
		System.out.println("ms2.intstanceVar = " + ms2.intstanceVar); // 100
		
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		
		System.out.println("ms1.staticVar = " + ms1.staticVar); // 800
		System.out.println("ms2.staticVar = " + ms2.staticVar); // 900
		
		
		/*
		 정적 멤버메소드의 접근방법은 정적변수의 접근방법과 동일하다.
		 */
		myStatic.instanceMethod();
		myStatic.staticMethod(); // 권장사항X => 클래스명 사용
		
//	[에러]	MyStatic.instanceMethod(); // 참조변수를 통해서만 호출 가능. 
		MyStatic.staticMethod();
	}
}
