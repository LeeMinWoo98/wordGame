package javaWin01;


public class Day0122 {

	public static void main(String[] args) {
		//터널의 길이 1 1 1 1 2 3 1 1 2 1 1 2 3 4 5 6 1 2 3 4 5 1 2
		//최대값 찾기+갱신1~~2,3,~~~~~~~~~~~~~~,4,5,6,~~~~~~~~~~~~~~
		int[] a = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		
		int b=-1;
		int cnt=1;
		int max=-1;
		int ta=-1;
		
		for(int i=0; i<23; i++) {
			if(b!=a[i]) {
				b = a[i];
				cnt = 1;
			}
			else {
				cnt++;
			}
			if(cnt>max) {
				max = cnt;
				ta = a[i];
				}
			System.out.println(i + "/" + cnt);
		}
		System.out.println(max+"/"+ta);
		
	}

}
