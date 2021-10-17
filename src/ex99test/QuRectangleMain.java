package ex99test;
/*
 정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
 그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다.
 아래의 소스를 참조하여 구현하시오. 
 
 실행결과]
	직사각형 면적: 12
	정사각형 면적: 49
 */

//직사각형을 표현한 클래스
class Rectangle
{
	// 직사각형 추상화
	int rectangle;
	// 모든 자식 클래스에서 사용가능한 static 변수 생성.
	static int secondNum;
	static int firstNum;
	
	public Rectangle(int firstNum, int secondNum) {
		rectangle = firstNum * secondNum;
	}
	void ShowAreaInfo() {
		System.out.println("직사각형 면적 : " + rectangle);		
	}
	
} 

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{	
	// 정사각형 추상화
	int square;
	// 스퀘어 생성자 생성. 변수는 1개 // 2개일땐 static 변수를 통해 부모에게 전달.
	public Square(int firstNum) {
		super(firstNum, secondNum);

		square = firstNum * firstNum;
	}

	void ShowAreaInfo() {
		System.out.println("정사각형 면적 : " + square);
	}
} 

class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.ShowAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.ShowAreaInfo();
 	}
}
