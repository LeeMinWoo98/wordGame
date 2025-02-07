package javaWin01;
//+ 특정 단어 사용 금지 ex) fuck이라는 글자가 들어갔을 때 사용 못한다 알림 + 다시 입력? 아니면 종료?
import java.util.Scanner;

public class Day0204_s3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id ="";
		String sign="!@#$%^&*";
		String n_Word ="fuck";
		
		
		
		while(true) {
		System.out.println("아이디를 입력하세요 : ");
		id = in.nextLine();
		int cnt=0;
		
		if(id.indexOf("xx")!=(-1))
			break;
		
		if(id.indexOf(n_Word)==(-1)) {
		
			for(int i=0; i<id.length(); i++) {
				char k=id.charAt(i);
				for(int j=0; j<sign.length(); j++) {
					char z=sign.charAt(j);
					if(k==z)
						cnt++;
				}
			}
		
		
			System.out.println("입력한 아이디는 "+id+" 입니다.");
			System.out.println("특수 문자의 갯수 "+cnt);
			break;
		
			
			}
			else {
				System.out.println(n_Word+"라는 단어는 포함될 수 없습니다.");
				System.out.println("종료하시려먼 xx를 입력하세요");
			}
			
		}
			
	}

}
