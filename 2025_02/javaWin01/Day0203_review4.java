package javaWin01;

public class Day0203_review4 {

	public static void main(String[] args) {
		int []arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int size=2;
		int totalCnt=0;
		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {	//i++�� ������ ������ 22��° �� cnt-1�� �ʿ���!!!!!
			cnt=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]==0)
					cnt++;
				else
					break;
			}
			if(cnt>=size) {
				System.out.println(i+"��ġ�� 0�� ����������"+cnt+"�� �����Դϴ�.");
				totalCnt += (cnt-size+1);
				i += cnt-1;
			}
		}
		System.out.println(totalCnt);

	}

}
