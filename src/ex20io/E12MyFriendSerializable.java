package ex20io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Friend implements Serializable{
	String name;	// 이름
	String phone;	// 전화번호
	String addr;	// 주소
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + addr);
	}

	public void showBasicInfo() { }
}

// 고딩친구
class HighFriend extends Friend{

	String nickname; // 별명
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		// 부모클래스의 생성자 호출
		super(name, phone, addr);
		// 자신의 멤버변수 초기화
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명 : " + nickname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명 : " + nickname);
		System.out.println("전번 : " + phone);
	}
}
// 대딩 친구
class UniverFriend extends Friend{
	String major; // 자식쪽에서 확장한 멤버변수. (전공)
	public UniverFriend(String name, String phone, String addr, String major) {
		super(name,phone, addr);
		this.major = major;
	}
	
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공 : " + major);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름 : " + name );
		System.out.println("전번 : " + phone );
	}
}


public class E12MyFriendSerializable {
	
	public static void menuShow() {
		System.out.println("### 메뉴를 입력하세요 ###");
		System.out.print("1. 고딩친구입력 ");
		System.out.println("2. 대딩친구입력");
		System.out.print("3. 전체정보출력 ");
		System.out.println("4. 간략정보출력");
		System.out.print("5. 검색 ");
		System.out.print("6. 삭제 ");
		System.out.println("7. 프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	
	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(true) {
			menuShow();
			Scanner scan = new Scanner(System.in);
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1: case 2:
//				System.out.println("고딩/대딩 친구 입력");
				handler.addFriend(choice);
				break; // break문을 만나면 switch문을 탈출한다.
			case 3:
//				System.out.println("전체정보출력");
				handler.showAllData();
				break;
			case 4:
//				System.out.println("간략정보출력");
				handler.showSimpleData();
				break;
			case 5:
//				System.out.println("검색");
				handler.searchInfo();
				break;
			case 6:
//				System.out.println("삭제");
				handler.deleteInfo();
				break;
			case 7:
				// 프로그램 종료시 컬렉션에 저장된 객체들을 직렬화한다.
				handler.saveFriendInfo();
				return; // main 에서의 return은 프로그램 종료 // return의 결과 1. 값을 반환. 2. 프로그램 종료
			}//// switch 끝
		}//// while 끝
	}//// main 끝
}//// class 끝

/*
 해당 프로그램에서 기능을 담당하는 클래스를 
 핸들러 혹은 매니저 클래스라고 한다.
 */
class FriendInfoHandler{
	
	// 친구의 정보를 저장할 List컬렉션 생성
	ArrayList<Friend> lists;
	
	//생성자
	public FriendInfoHandler(int num) {
		// 멤버변수가 컬렉션으로 변경되었음으로 List<T>를 생성한다.
		lists = new ArrayList<Friend>();
		
		/*
		 해당 프로그램은 시작시 핸들러 객체를 생성하면서 시작함으로
		 복원할 파일이 있다면 여기서 호출하면 된다.
		 */
		readFriendInfo();
	}
	
	// 새로운 친구 입력
	public void addFriend(int choice) {
		//choice가 1이면 고딩, 2면 대딩친구 추가
		
		// 정보 입력을 위한 객체생성
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		// 기본정보 입력(연락처의 공통사항)
		System.out.print("이름 : "); iName = scan.nextLine();
		System.out.print("전화번호 : "); iPhone = scan.nextLine();
		System.out.print("주소 : "); iAddr = scan.nextLine();
		

		if(choice == 1) { // 고딩친구 입력
			System.out.print("별명 : "); iNickname = scan.nextLine();
			
			// 고딩친구 객체를 만든 후 컬렉션에 add한다. 인덱싱은 필요없다.
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		}else if(choice == 2) { // 대딩친구 입력
			System.out.print("전공 : "); iMajor = scan.nextLine();
			
			// 대딩친구 객체를 생성과 동시에 add한다.
			lists.add(new UniverFriend(iName, iPhone, iAddr, iMajor));			
		}
	
		System.out.println("친구정보 입력이 완료되었습니다.");	
	}//// end of addFriend
	

	// 친구정보 전체보기
	
	/*
	 일반 for문을 통해 컬렉션에 접근한다.
	 이때에는 인덱스를 사용함으로 get()메서드를 활용한다.
	 컬렉션에 저장된 객체의 갯수는 size()메서드를 통해 알수있다.
	 */
	public void showAllData() { // 전체정보 출력용 메서드
		for(int i= 0; i < lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	
	// 친구정보 간략보기
	/*
	 확장(개선된) for문을 이용한다.
	 인덱스를 사용할 필요가 없음으로 코드는 훨씬 간결해진다.
	 컬렉션에 저장된 객체의 갯수만큼 알아서 반복한다.
	 */
	public void showSimpleData() { // 간략정보 출력용 메서드
		for(Friend fr : lists) {
			fr.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다==");
	}
	
	// 주소록 검색
	public void searchInfo() {
		boolean isFind = false; //검색한 정보가 있는지 확인하기 위한 변수
		Scanner scan =new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scan.nextLine();
		
		/*
		 이터레이터 사용방법
		 1. 컬렉션의 참조변수를 기반으로 이터레이터 객체를 생성한다.
		 2. hasNext()로 출력할 요소가 있는지 검사한다.
		 3. true를 반환하면 next()로 반환한다.
		 ★★★★ 단, while문 내에서 next()를 두번 호출하면 다음/다음 요소가 반환됨으로 주의해야한다.
		   	  => 다음이라는 것을 표현하는 변수를 만들어 변수를 사용한다.
		 */
		Iterator<Friend> itr = lists.iterator();
		while(itr.hasNext()/*hasNext라는 메서드를 통해 itr에 데이터가 있는지(true) 없는지(false) 확인한다.*/) {
			Friend fr = itr.next();
			if(searchName.compareTo(fr.name)==0) {
				// 일치하는 이름이 있으면 정보를 출력한다.
				fr.showAllData();
				
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
				isFind = true; // 찾는 정보가 있다면 true로 변경
			}			
		}
		
		if(isFind==false) {
			System.out.println("*** 찾는 정보가 없습니다***");
		}
	}
	
	// 주소록 항목 삭제
	public void deleteInfo() {
		Scanner scan =new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요 : ");
		String deleteName = scan.nextLine();

		int deleteIndex = -1;
		
		// 저장된 데이터 만큼 반복하고
		for(Friend fr : lists) {
			// 삭제할 이름이 있는지 검색하고
			if(deleteName.compareTo(fr.name)==0) {
				lists.remove(fr);
				deleteIndex = 1; // deleteIndex 단순히 삭제 여부(삭제됨 -1반환 / 삭제안됨 0반환)를 반환하기 위해 변경한다.
				break;
			}
		}
		
		if(deleteIndex== -1) {
			// 검색된 데이터가 없어 삭제되지 않았다면 -1을 유지한다.
			System.out.println("==삭제된 데이터가 없습니다==");
		}else {
			System.out.println("==데이터가 삭제되었습니다.");
		}
	}//// end of deleteInfo
	
	/*
	 연습문제] 친구정보를 파일로 직렬화하기위한 메서드를 정의하시오.
	 	프로그램 종료시 컬렉션에 저장된 모든 친구객체를 파일로 저장해야한다.
	 	저장할 파일명 : friend_info.obj
	 */
	public void saveFriendInfo() {
		
		try {		
			// 인스턴스를 파일에 저장하기 위해 출력스트림을 생성한다.
			ObjectOutputStream out = 
				new ObjectOutputStream(
					new FileOutputStream("src/ex20io/friend_info.obj")
				);
			
			for(Friend fr : lists) {
				out.writeObject(fr);
			}
		} catch (Exception e) {
			System.out.println("친구 정보 직렬화시 예외발생");
		}
	}
	public void readFriendInfo() {
		try {
			ObjectInputStream in = 
				new ObjectInputStream(
					new FileInputStream("src/ex20io/friend_info.obj")
				);
			while(true) {
				Friend fr = (Friend)in.readObject();			
				lists.add(fr);
				if(fr == null) break;
			}			
		} catch (Exception e) {
			System.out.println("더 이상 읽을 객체가 없습니다.");
		}
		System.out.println("친구 정보가 복원되었습니다.");
	}
}//// end of FriendInfoHandler
