package javaWin01;

import java.util.Scanner;

public class Day0204_s1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id ="";
		System.out.println("���̵� �Է��ϼ��� : ");
		id = in.nextLine();
		int cnt=0;
		
		for(int i=0; i<id.length(); i++) {
			char k=id.charAt(i);
			if(k=='@')
				cnt++;
		}
		System.out.println("�Է��� ���̵�� "+id+" �Դϴ�.");
		System.out.println("Ư�� ������ ���� "+cnt);
		

		
	}

}
