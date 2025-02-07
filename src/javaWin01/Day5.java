package javaWin01;

public class Day5 {

	public static void main(String[] args) {
		//변수 선언
		int x=0;
		
		//숫자 선택:	56773
		//자릿수를 따지지 않고 숫자만 더하기
		x = x+5;
		x = x+6;
		x = x+7;
		x = x+7;
		x = x+3;
		
		System.out.println("모든 숫자의 합 :" + x);
		
		int sum = 0;			//모든 자릿수의 합을 넣을 변수 선언, 자료형은 int
		int num = 56773;		//선택한 수

		sum = num/10000;				//num을 10000으로 나누었을때의 몫 5
		sum = sum+(num%10000)/1000;		//num을 10000으로 나누었을때의 나머지 : 6773, 이걸 1000으로 나눈 몫 6
		sum = sum+(num%1000)/100;		//num을 1000으로 나누었을때의 나머지 : 773, 이걸 100으로 나눈 몫 7
		sum = sum+(num%100)/10;			//num을 100으로 나누었을때의 나머지 : 73, 이걸 10으로 나눈 몫 7
		sum = sum+num%10;				//num을 10으로 나누었을때의 나머지 : 3
		
				
		
		
		System.out.println("모든 숫자의 합 :" + sum);
		
		
	
	}

}
