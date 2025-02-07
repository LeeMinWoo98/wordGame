package javaWin01;

import java.util.Scanner;

public class Day0122_s3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] menu = {"짜장면", "짬뽕", "탕수육", "만두", "울면"};
		int[] price= {3000, 4000, 10000, 5000, 4500};
		int []cnt= new int[15];
		
		int []pick = new int[3];
		
		for(int i=0; i<5; i++) 
			System.out.println(menu[i]+":"+price[i]+"원");
		
		
		for(int i=0; i<3; i++) {
			System.out.println("메뉴를 선택하세요(999입력시 종료)");
			pick[i] = in.nextInt();
			
			System.out.println("수량을 입력하세요 : ");
			cnt[i] = in.nextInt();
			
		}
		for(int i=0; i<3; i++) {
		System.out.println(menu[(pick[i]-1)]+" "+cnt[i]+"개"+" "+"개당"+price[(pick[i]-1)]+" "+"총 합:"+(price[(pick[i]-1)])*cnt[i]+"원");
		}
		//System.out.println(menu[(pick[i]-1)]);

	}

}
