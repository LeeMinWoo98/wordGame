package javaWin01;

import java.util.Scanner;

public class Day_0124 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] train = new String[5];
		String[] T_time = {"", "", "", "", ""};
		String[] T_name = {"", "", "", "", ""};
		String t = "";
		
		for(int i=0; i<5; i++)
		{
			System.out.println("������ �̸��� �ð��� �Է��ϼ��� : " );
			train[i] = in.next();
		}
		
		for(int i=0; i<5; i++) {
			T_name[i] += train[i].charAt(0);
			//T_name[i] = T_name[i] + train[i].charAt(0);		//""+���ڿ��̹Ƿ� ���� ����ȯ�� �Ͼ�� ������ �ȳ�
			
			T_name[i] += train[i].charAt(1);
			
			
			T_name[i] += train[i].charAt(2);
		}
		
		for(int i=0; i<5; i++) {
			T_time[i] += train[i].charAt(3);
			T_time[i] += train[i].charAt(4);
		}
		
		System.out.println("�˻��� �������� �Է��ϼ���  : ");
		t = in.next();
		
		for(int i=0; i<5; i++) {
			if(t.equals(T_name[i]))
				System.out.println("������ : "+T_name[i]+"  �����ð�:"+T_time[i]);
		}
		
		
		}
	}


