package javaWin01;

public class Day0117_example {

	public static void main(String[] args) {
		int[] a = {3, 14, 25, 7, 9};
		int temp = 0;
		int index=0;	//a�� ���° �ε����� ���� ū ������ �˱����ؼ�
		
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
			
			int temp2 = a[2]; 	// ���� ū a��  �ε����� ���� ����
			a[2] = a[4];		//a[4]�� a[2]°�� �ű��
			a[4] = temp2; 		// �����ߴ� ���� ū �ε����� a[4]�� ����
			
		
		
		System.out.println(temp);
		System.out.println(index);
	}

}
