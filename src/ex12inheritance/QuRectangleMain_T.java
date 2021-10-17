package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
     	//블라블라
	int width;	// 가로
	int height; // 세로
	
	// 멤버변수가 2개임으로 인자가 2개인 생성자가 필요
	public Rectangle(int wi, int he) {
		this.width = wi;
		this.height = he;
	}
	//직사각형의 면적 출력
	public void ShowAreaInfo() {
		System.out.println("직사각형 면적 : " + (width * height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
    /*
     정사각형은 직사각형의 일종이고, 가로/세로의 길이가 동일함으로
     하나의 값으로 두개의 멤버변수를 초기화 할 수 있다.
     */
	public Square(int width) {
		super(width, width);
	}
	//정사각형의 면적 출력
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형 면적 : " + (width * height));
	}
} 

class QuRectangleMain_T {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.ShowAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.ShowAreaInfo();
 	}
}


