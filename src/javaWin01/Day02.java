package javaWin01;

public class Day02 {

	public static void main(String[] args) {
		int a=100;	//a는 철수		-> 변수명 pointYoungsu 
		int b=100;	//b는 영수		-> 변수명 pointChulsu
		
			a = a+20;	//철수 2승		a = a+10
						//			a = a+10
			b = b-20;	//영수 2패		b = b+10
						//			b = b+10
			a = a+2;	//비김
			b = b+2;	//비김
			b = b+10;	//영수 1승
			a = a-10;	//철수 1패
		
		System.out.println("철수의 점수 : " + a); 	//철수의 점수		->여기서 +는 문자열 연결자
		System.out.println("영수의 점수 : " + b);	//영수의 점수		->여기서 +는 문자열 연결자
		

	}

}
