package javaWin01;

public class Day0203_review4 {

	public static void main(String[] args) {
		int []arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int size=2;
		int totalCnt=0;
		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {	//i++인 증감식 떄문에 22번째 줄 cnt-1이 필요함!!!!!
			cnt=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]==0)
					cnt++;
				else
					break;
			}
			if(cnt>=size) {
				System.out.println(i+"위치의 0은 오른쪽으로"+cnt+"개 연속입니다.");
				totalCnt += (cnt-size+1);
				i += cnt-1;
			}
		}
		System.out.println(totalCnt);

	}

}
