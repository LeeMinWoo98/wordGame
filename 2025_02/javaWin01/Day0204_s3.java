package javaWin01;
//+ Ư�� �ܾ� ��� ���� ex) fuck�̶�� ���ڰ� ���� �� ��� ���Ѵ� �˸� + �ٽ� �Է�? �ƴϸ� ����?
import java.util.Scanner;

public class Day0204_s3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id ="";
		String sign="!@#$%^&*";
		String n_Word ="fuck";
		
		
		
		while(true) {
		System.out.println("���̵� �Է��ϼ��� : ");
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
		
		
			System.out.println("�Է��� ���̵�� "+id+" �Դϴ�.");
			System.out.println("Ư�� ������ ���� "+cnt);
			break;
		
			
			}
			else {
				System.out.println(n_Word+"��� �ܾ�� ���Ե� �� �����ϴ�.");
				System.out.println("�����Ͻ÷��� xx�� �Է��ϼ���");
			}
			
		}
			
	}

}
