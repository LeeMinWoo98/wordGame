package javaWin01;

import java.util.Scanner;

public class Day0122_s1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] menu = {"짜장면", "짬뽕", "탕수육", "만두", "울면"};
		String[] price= {"3000", "4000", "10000", "5000", "4500"};
		int[] pick = new int[3];
		int[] cnt = new int[3];
		
		/*for(int i=0; i<5; i++)
			System.out.println((i+1) + ":" + menu[i]);	//매뉴 출력*/
		
		
		for(int i=0; i<5; i++)
			System.out.println(menu[i]+" : "+price[i]+"원");
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println("1.짜장면  2.짬뽕  3.탕수육  4.만두   5.울면");
			System.out.println("메뉴를 선택하세요(종료는 999)");
			
			pick[i] = in.nextInt();
			if(pick[i] == 999)
				break;
			
			System.out.println("수량을 선택하세요 : ");
			cnt[i] = in.nextInt();
			
			//배열의 값이 1 1 2
			//음식 배열의 인덱스로 1, 1, 2 를 사용
			
			//cnt 배열에 2,1,0
				
		
		}
		
		for(int i=0; i<3; i++)
			System.out.println(menu[(pick[i]-1)]+" "+cnt[i]+"개"+ "가격 : " + "");
	}

}
