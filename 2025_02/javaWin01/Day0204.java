package javaWin01;
import java.util.Random;

public class Day0204 {

	public static void main(String[] args) {
	
		int a=10;
		int b=10;
		
		if(a==b) {
			System.out.println("같다");
		}
		
		String aa = new String("kim");
		String bb = new String("kim");
		
		System.out.println(aa.length()+"<");
		System.out.println(aa.indexOf("im")+"<<"); //indexOf매개변수에 해당하는 문자열의 시작점을 반환
		
		if(aa==bb) {
			System.out.println("같다2");
		}
		
		if(aa.equals(bb)) {
			System.out.println("같다3");
		}
		
		
	}

}
