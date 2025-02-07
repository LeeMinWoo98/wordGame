package javaWin01;

import java.util.Random;
import java.util.Scanner;

public class Day0123_s3 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
			int cnt=0;
			int []pick = new int[7];
			int []check = new int[45];
			
			for(int i=0; i<7; i++) {
				System.out.println("선택할 로또 번호를 입력하세요 :  (입력 종료 : 0)");
				int aaa = in.nextInt();
				if(aaa==0)
					break;
				else {
				pick[i] = aaa;
				cnt++;
				check[aaa-1]++;
				}
				if(check[aaa-1]==2) {
					check[aaa-1] = 1;
					System.out.println("중복된 숫자입니다. 다시 입력하세요");
					i--;
					cnt--;
				}
			}
		
			
			for(int i=cnt; i<7; i++) {
				//pick[]=r.nextInt((45)+1);
				int bbb = r.nextInt(45)+1;
				
				System.out.println((bbb)+"번을 사용하시겠습니까?(사용시 1입력)");
				if(in.nextInt()==1) {
					pick[i] = bbb;
					check[bbb-1]++;
				}
				else 
					i--;
				if(check[bbb-1]==2) {
					check[bbb-1]=1;
					System.out.println("중복된 숫자입니다. 다른 수를 선택하세요");
					i--;
				
				}
				
			}
				
				for(int i=0; i<7; i++)
					System.out.print(pick[i]+" ");
			
			
			
		
		
		
		
	}

}
