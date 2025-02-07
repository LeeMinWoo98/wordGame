package javaWin01;

import java.util.Scanner; // 필요한 자료형을  가져오는 것 	ctrl + shift + 알파벳o

public class Day_0122_Scanner_sample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = in.nextLine();
		System.out.println("당신의 이름은 " + name);
		
	}

}
