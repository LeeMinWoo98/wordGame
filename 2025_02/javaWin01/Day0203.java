package javaWin01;

public class Day0203 {

	public static void main(String[] args) {
		
		int[] a ={1, 0, 0, 0, 2, 3, 4, 4, 6, 2, 2, 2, 2, 2};
		System.out.println(a.length + "길이 배열");
		int cnt=0;

		for(int i=0; i<a.length-2; i++){ 	//3개 이상인것만 체크하니까 마지막에서 -2까지만 확인 후 나머지는 아래 for문으로 다음, 다다음값 찾아서 비교하면 되기 때문에 -2를 해준다
			System.out.print(i+" : ");		//ex) 길이가 14일때 12까지만 비교할 기준이 되는 숫자 확인 후 그 뒤 2개의 숫자는 아래 for에서 해결
			cnt=1;
			for(int j=i+1; a[i]==a[j]; j++) {	//i번째 인덱스의 값과 그 다음 인덱스의 값을 비교하기 위해 j=i+1을 사용 
				System.out.print(j+" ");
				cnt++;
				if(j==a.length-1)
					break;		//현재 반복문을 종료한다. 여기서 현재 반복문은 14번째 줄 for문
			}
			if(cnt>=3) {
			System.out.println("총 길이 : "+cnt);
			i+=cnt;
			}
			System.out.println();
		}
		
	}

}
