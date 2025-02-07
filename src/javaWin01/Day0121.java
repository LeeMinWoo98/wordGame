package javaWin01;

public class Day0121 {

	public static void main(String[] args) {
	
		int[] a = new int[1000];
		int cnt=0;
		int fcnt=0;
		int findInt = 755;
		
		for(int i=0; i<1000;i++){
			cnt++;
			a[i]=i+1;
			}
	//	System.out.println(cnt);
		
		if(findInt>825) {
			for(int i=826; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);		//배열 a의 인덱스 번호는 0부터 시작이므로 +1 해서 출력
					i = 2000;
				}
			}
		}
		else if(findInt>750) {
			for(int i=751; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else if(findInt>625) {
			for(int i=626; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else if(findInt>500) {
			for(int i=501; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else if(findInt>375) {
			for(int i=376; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else if(findInt>250) {
			for(int i=251; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else if(findInt>125) {
			for(int i=126; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
		else
		{
			for(int i=0; i<1000; i++) {
				fcnt++;
				if(findInt == a[i]) {
					System.out.println(fcnt);
					System.out.println(i+1);
					i = 2000;
				}
			}
		}
			
		
			
	}		
}

