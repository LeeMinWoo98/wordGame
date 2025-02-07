package javaWin01;

public class Day0120 {

	public static void main(String[] args) {
		

		//반복할 작업 : 3의 배수를 출력 -> 저장할 값은 없지만, 조건이 필요함
		
		for(int i=1; 20>=i; i++){
			if(i%3==0)
				System.out.println(i);
			
		}
		
		//반복할 작업 : 보너스당 10점 추가인데 10회의 보너스 획득 
		int point = 70;
		for(int i=0; i<10; i++) {
			point += 10;
		}
		System.out.println("철수의 점수 : "+point);
		
		
		
		
		//반복할 작업 : 100부터 50까지 내림차순 출력 -> 출력을 50번 반복해야함
		int a=100;
		for(int i=0; i<=50; i++) {
			System.out.println(a);
			a--;
		}
		
		//반복할 작업 : 30일간 저금을 한다 -> 1일부터 30일까지 저금하는 행위를 반복 + 짝수날은 500원을 더 저금한다는 조건이 필요
		int money = 1000;
		
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				money += 1500;
			}
			else {
				money += 1000;
			}
		}
		System.out.println("철수가 모은 돈 : " + money);
	
	}

}
