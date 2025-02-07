package javaWin01;

public class Day0120_1 {

	public static void main(String[] args) {
	
		int a=1;
		int b=1;
		int c=0;
		
		for(int i=0; i<8; i++) {
			c = a+b;	//c=2	//c=3	//c=5	//c=8	//c=13
			b = a;		//b=1	//b=2	//b=3	//b=5	//b=8
			a = c;		//a=2	//a=3	//a=5	//a=8	//a=13
			
		}
	}

}
