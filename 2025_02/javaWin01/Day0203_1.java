package javaWin01;

public class Day0203_1 {

	public static void main(String[] args) {
		String a ="23-56+45*2-56E";		//
		int result=0;	//23 ����-> -33 ����
		int temp=0;		//0 �ʱ�ȭ-> 0
		char sign='+';	// result�� ���� ���ڸ�
		
		for(int i=0; i<a.length(); i++) {
			char k=a.charAt(i);
			if(47<k && k<58) {
				temp *= 10;
				temp += k-48;
			}else {
				if(sign=='+') {
					result += temp;
				}else if(sign=='-') {
					result -= temp;
				}else if(sign=='*') {
					result *= temp;
				}
				temp=0;
				sign=k;
			}
		}
		System.out.println(result);
		
	}

}

