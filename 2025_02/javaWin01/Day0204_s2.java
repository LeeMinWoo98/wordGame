package javaWin01;

import java.util.Scanner;

public class Day0204_s2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id ="";
		String sign="!@#$%^&*";
		int small=0;
		int big=0;
		int word=0;
		int num=0;
		
		
		System.out.println("���̵� �Է��ϼ��� : ");
		id = in.nextLine();
		int cnt=0;
		
		for(int i=0; i<id.length(); i++) {
			int k=id.charAt(i);
			if(57>=k && k>=48) {
				num++;
			}
			if(122>=k && k>=97) {
				small++;
			}
			if(90>=k && k>=65) {
				big++;
			}
			for(int j=0; j<sign.length(); j++) {
				int z=sign.charAt(j);
			if(k==z)
				cnt++;
			}
		}
		System.out.println("�Է��� ���̵�� "+id+" �Դϴ�.");
		System.out.println("Ư�� ������ ���� "+cnt);
		System.out.println("�ҹ����� ���� "+small);
		System.out.println("�빮���� ���� "+big);
		System.out.println("������ ���� "+num);
		

		
	}

}
