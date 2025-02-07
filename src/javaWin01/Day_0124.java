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
			System.out.println("기차의 이름과 시간을 입력하세요 : " );
			train[i] = in.next();
		}
		
		for(int i=0; i<5; i++) {
			T_name[i] += train[i].charAt(0);
			//T_name[i] = T_name[i] + train[i].charAt(0);		//""+문자열이므로 강제 형변환이 일어나서 오류가 안남
			
			T_name[i] += train[i].charAt(1);
			
			
			T_name[i] += train[i].charAt(2);
		}
		
		for(int i=0; i<5; i++) {
			T_time[i] += train[i].charAt(3);
			T_time[i] += train[i].charAt(4);
		}
		
		System.out.println("검색할 기차명을 입력하세요  : ");
		t = in.next();
		
		for(int i=0; i<5; i++) {
			if(t.equals(T_name[i]))
				System.out.println("기차명 : "+T_name[i]+"  기차시간:"+T_time[i]);
		}
		
		
		}
	}


