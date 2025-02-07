package javaWin01;

public class Day0117_example {

	public static void main(String[] args) {
		int[] a = {3, 14, 25, 7, 9};
		int temp = 0;
		int index=0;	//a의 몇번째 인덱스가 가장 큰 값인지 알기위해서
		
			if(a[0]> temp) {
				temp = a[0];
				index = 0;
			}
			if(a[1]> temp) {
				temp = a[1];
				index = 1;
			}
			if(a[2]> temp) {
				temp = a[2];
				index = 2;
			}
			if(a[3]> temp) {
				temp = a[3];
				index = 3;
			}
			if(a[4]> temp) {
				temp = a[4];
				index = 4;
			}
			
			int temp2 = a[2]; 	// 제일 큰 a의  인덱스를 따로 저장
			a[2] = a[4];		//a[4]를 a[2]째로 옮기기
			a[4] = temp2; 		// 저장했던 제일 큰 인덱스를 a[4]에 저장
			
		
		
		System.out.println(temp);
		System.out.println(index);
	}

}
