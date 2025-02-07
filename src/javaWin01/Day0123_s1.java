package javaWin01;

import java.util.Random;


public class Day0123_s1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		
		int [] lotto = new int[45];
		int max=0;
		int min=100;
		
		int sum=0;
		int avg=0;
		
		
		for(int i=0; i<1000; i++) {                     //r.nextInt(45)에서 뽑인 수 하나를 lotto의 인덱스로 사용해 lotto[23]++
			lotto[r.nextInt(45)]++;						//for문에서 같은 수가 나올 때마다 그 인덱스의 값을 하나씩 증가시킨다.         	
		}
		for(int i=0; i<45; i++) {
			System.out.println((i+1)+"번  "+lotto[i]+"회"+" 확률"+ (double)lotto[i]/10+"%"); //배열의 시작 인덱스는 0이기떄문에 i+1로 1번 표현
		
		}
		
		for(int i=0; i<45; i++) {
			if(lotto[i]>=max) {			//같을 경우는 큰 번호가 우선 -> i값이 큰 것을 출력한다. for문에서 i값이 자동으로 증가
				max = lotto[i];			//이전 값중 max값이 같거나 크다면(>=) i가 증가함에 따라 나중에 나온 max값을 저장 
										//배열의 값의 최대가 몇인지
			}
			
		
			if(lotto[i]<=min) {			//위와 마찬가지로 i값이 증가하면서 나중에 확인한 min값을 저장하려면 min<=lotto
				min = lotto[i];			// 여기가 배열의 값이 최소가 몇인지
			}
			
			sum += lotto[i];			//다 더한 값 구해서
		}
		
		
		
		
		
			for(int i=0; i<45; i++)
				if(max <= lotto[i])			//배열의 최대값이랑 lotto[1, 2, 3, 4, ~~~~ 45]의 값을 비교해서
					max = i+1;				//최대값이 32(나온 횟수) lotto[5] ={32}, 이때 i 값은 5인데 로또번호는 1번부터 시작이니까 i+1해서 번호 6이 32번 나옴
											//40번호 32번 나왔다면 max 가 같아서 갱신이 안되니까 조건을 max<lotto가 아니라 max<"="lotto 로 변경
			for(int i=0; i<45; i++)
				if(min >= lotto[i])
					min = i+1;
			
			avg = sum/45;				//번호 갯수로 나눠 평균구하기
			
	
			System.out.println("확률의 평균 : "+(float)avg/10+"%");
			System.out.println("가장 많이 나온 번호: "+ max);
			System.out.println("가장 적게 나온 번호: "+ min);
			
			for(int i=0; i<45; i++) {
				if(lotto[i]>avg)
					System.out.println("확률의 평균보다 높은 번호 : "+(i+1)+"번");
				
				
			}
			for(int i=0; i<45; i++)
				System.out.println(i+"+1번"+" "+lotto[i]);
				
		}
	}