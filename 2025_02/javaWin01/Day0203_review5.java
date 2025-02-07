package javaWin01;

public class Day0203_review5 {

	public static void main(String[] args) {
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		
		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		
		for(int i=0; i<carnum.length; i++) {
			//초기 빈자리 찾기
			nowCar = carnum[i];					//carnum배열에 있는 첫번째 차량을 nowCar에 저장
			carPositionIndex = nowCar%10;		//차량을 주차할 번호인 carPositionIndex에 nowCar에 저장된 차량번호의 마지막 수를 저장
			System.out.println(nowCar+"차량 "+ carPositionIndex+ " 번이 주차자리 입니다.");	//중복은 신경쓰지 않고 일단 자리 배정
			
			//totalCarCnt는 차량을 주차한 수, parking이 totalCarCnt보다 크다면 == 주차장에 자리가 있다면
			if(totalCarCnt<parking.length) {
				//무한루프를 돌리는데	 parking배열이 비어있지 않으면 계속 돌림 == 주차 자리가 이미 차 있다면 계속 돌림
				for(; parking[carPositionIndex]!=0;) {					
					System.out.println("빈자리인지 확인 중입니다.");				
					carPositionIndex=(carPositionIndex+1)%(parking.length);	//각 차량의 마지막 번호를 주차 번호로 잡았으니까 마지막 자리가 중복된다면
																			//carPositionIndex를 1 증가시키고(다음 자리로 배정)
																			//마지막 숫자가 9일 경우 1 증가시키면 10이 되기 때문에 %10해서 0으로 만들기
																			//이때 %10은 주차장의 자리 수, ex)자리가 8개었고, 뒷자리가 7인 차량이 두대였다면
																			//(7+1)%(parking.length==8)->0으로 가야함
					System.out.println(carPositionIndex+"번호로 새로 배정");		//지정된 번호에 새로 배정한다고 알림
																			
				}
				
				System.out.println(carPositionIndex+"번호에 주차합니다");		//주차할 위치의 번호 알림
				parking[carPositionIndex] = nowCar;							//carnum배열의 i번째 차량을 parking배열에 저장하는데
																			//차량번호의 마지막자리의 번호에 따라 저장함
				totalCarCnt++;												//총 차량 주차 수 증가
			}
		}
		System.out.println(totalCarCnt);
		
	}

}

