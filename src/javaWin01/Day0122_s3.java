package javaWin01;

import java.util.Scanner;

public class Day0122_s3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] menu = {"¥���", "«��", "������", "����", "���"};
		int[] price= {3000, 4000, 10000, 5000, 4500};
		int []cnt= new int[15];
		
		int []pick = new int[3];
		
		for(int i=0; i<5; i++) 
			System.out.println(menu[i]+":"+price[i]+"��");
		
		
		for(int i=0; i<3; i++) {
			System.out.println("�޴��� �����ϼ���(999�Է½� ����)");
			pick[i] = in.nextInt();
			
			System.out.println("������ �Է��ϼ��� : ");
			cnt[i] = in.nextInt();
			
		}
		for(int i=0; i<3; i++) {
		System.out.println(menu[(pick[i]-1)]+" "+cnt[i]+"��"+" "+"����"+price[(pick[i]-1)]+" "+"�� ��:"+(price[(pick[i]-1)])*cnt[i]+"��");
		}
		//System.out.println(menu[(pick[i]-1)]);

	}

}
