package javaWin01;

import java.util.Scanner;

public class Day0122_s1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] menu = {"¥���", "«��", "������", "����", "���"};
		String[] price= {"3000", "4000", "10000", "5000", "4500"};
		int[] pick = new int[3];
		int[] cnt = new int[3];
		
		/*for(int i=0; i<5; i++)
			System.out.println((i+1) + ":" + menu[i]);	//�Ŵ� ���*/
		
		
		for(int i=0; i<5; i++)
			System.out.println(menu[i]+" : "+price[i]+"��");
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println("1.¥���  2.«��  3.������  4.����   5.���");
			System.out.println("�޴��� �����ϼ���(����� 999)");
			
			pick[i] = in.nextInt();
			if(pick[i] == 999)
				break;
			
			System.out.println("������ �����ϼ��� : ");
			cnt[i] = in.nextInt();
			
			//�迭�� ���� 1 1 2
			//���� �迭�� �ε����� 1, 1, 2 �� ���
			
			//cnt �迭�� 2,1,0
				
		
		}
		
		for(int i=0; i<3; i++)
			System.out.println(menu[(pick[i]-1)]+" "+cnt[i]+"��"+ "���� : " + "");
	}

}
