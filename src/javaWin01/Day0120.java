package javaWin01;

public class Day0120 {

	public static void main(String[] args) {
		

		//�ݺ��� �۾� : 3�� ����� ��� -> ������ ���� ������, ������ �ʿ���
		
		for(int i=1; 20>=i; i++){
			if(i%3==0)
				System.out.println(i);
			
		}
		
		//�ݺ��� �۾� : ���ʽ��� 10�� �߰��ε� 10ȸ�� ���ʽ� ȹ�� 
		int point = 70;
		for(int i=0; i<10; i++) {
			point += 10;
		}
		System.out.println("ö���� ���� : "+point);
		
		
		
		
		//�ݺ��� �۾� : 100���� 50���� �������� ��� -> ����� 50�� �ݺ��ؾ���
		int a=100;
		for(int i=0; i<=50; i++) {
			System.out.println(a);
			a--;
		}
		
		//�ݺ��� �۾� : 30�ϰ� ������ �Ѵ� -> 1�Ϻ��� 30�ϱ��� �����ϴ� ������ �ݺ� + ¦������ 500���� �� �����Ѵٴ� ������ �ʿ�
		int money = 1000;
		
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				money += 1500;
			}
			else {
				money += 1000;
			}
		}
		System.out.println("ö���� ���� �� : " + money);
	
	}

}
