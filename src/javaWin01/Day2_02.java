package javaWin01;

public class Day2_02 {

	public static void main(String[] args) {
		
		//자료형 실습
		int pointEng = 0;
		double avgPoint = 0;
		boolean haveMoney = false;
		char saveWord = 'a';
		
		System.out.println(pointEng);
		System.out.println(avgPoint);
		System.out.println(haveMoney);
		System.out.println(saveWord);
		
		
		//60점 이상이면 합격
		int point = 78;
		boolean a = point >= 60;
		System.out.println(a);
		
		
		//묵시적 형변환, 강제 형변환
		int b=10;				//변수 b를 선언하고 자료형은 int에 저장한 값은 10이다.
		int c=4;				//변수 c를 선언하고 자료형은 int에 저장한 값은 4이다.
		int d = b/c;			//변수 d를 선언하고 자료형은 int에 b/c의 결과값을 저장한다.
								//b/c의 결과값은 정수의 연산이므로 2이다.
		
		double e =b/c;			//변수 e를 선언하고 자료형은 double에 저장한 값은 b/c이다.
								//b/c는 정수 끼리의 연산이기 때문에 결과값은 2이고
								//e에 저장되는 값은 실수이기 때문에 2.0이 저장된다.
		
		int g = b/c;			//변수 g를 선언하고 자료형은 int에 저장한 값은 b/c이다.
								//b/c는 정수끼리의 연산이기 떄문에 결과값은 2이고, g는 자료형이 정수이기 때문에 2가 저장된다.
		
		double h = b/(double)c;	//변수 h를 선언하고 자료형은 double에 b/(double)c의 결과값을 저장한다
								//b/(double)c 의 결과값은 c를 강제 형변환해 정수와 실수의 연산이고,
								//이때 정수가 실수보다 범위가 작기때문에 정수는 실수로 묵시적 형변환이 일어난다
								//실수와 실수의 연산으로 바뀌어 결과값이 2.5이고, 이 값을 저장하는 변수 h도 자료형이 실수이기 때문에 2.5가 저장된다.
		
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		
		
		
		
	}

}
