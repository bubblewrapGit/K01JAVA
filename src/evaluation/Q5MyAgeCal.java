package evaluation;

import java.util.Calendar;


public class Q5MyAgeCal {
	public static void main(String[] args) {
		int birthYear = 1994;
	    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
        int myAge = nowYear - birthYear;
        System.out.println(birthYear);
        System.out.println(nowYear);
        System.out.println("내 나이는 " + myAge + " 살 입니다.");
	}
}
