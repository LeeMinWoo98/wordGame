package javaWin01;

import java.util.Scanner;

public class Day0204_s1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id ="";
		System.out.println("아이디를 입력하세요 : ");
		id = in.nextLine();
		int cnt=0;
		
		for(int i=0; i<id.length(); i++) {
			char k=id.charAt(i);
			if(k=='@')
				cnt++;
		}
		System.out.println("입력한 아이디는 "+id+" 입니다.");
		System.out.println("특수 문자의 갯수 "+cnt);
		

		
	}

}
