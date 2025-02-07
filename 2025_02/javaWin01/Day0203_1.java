package javaWin01;

public class Day0203_1 {

	public static void main(String[] args) {
		String a ="23-56+45*2-56E";		//
		int result=0;	//23 저장-> -33 저장
		int temp=0;		//0 초기화-> 0
		char sign='+';	// result에 만든 숫자를
		
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

