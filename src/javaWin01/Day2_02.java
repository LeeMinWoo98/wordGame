package javaWin01;

public class Day2_02 {

	public static void main(String[] args) {
		
		//�ڷ��� �ǽ�
		int pointEng = 0;
		double avgPoint = 0;
		boolean haveMoney = false;
		char saveWord = 'a';
		
		System.out.println(pointEng);
		System.out.println(avgPoint);
		System.out.println(haveMoney);
		System.out.println(saveWord);
		
		
		//60�� �̻��̸� �հ�
		int point = 78;
		boolean a = point >= 60;
		System.out.println(a);
		
		
		//������ ����ȯ, ���� ����ȯ
		int b=10;				//���� b�� �����ϰ� �ڷ����� int�� ������ ���� 10�̴�.
		int c=4;				//���� c�� �����ϰ� �ڷ����� int�� ������ ���� 4�̴�.
		int d = b/c;			//���� d�� �����ϰ� �ڷ����� int�� b/c�� ������� �����Ѵ�.
								//b/c�� ������� ������ �����̹Ƿ� 2�̴�.
		
		double e =b/c;			//���� e�� �����ϰ� �ڷ����� double�� ������ ���� b/c�̴�.
								//b/c�� ���� ������ �����̱� ������ ������� 2�̰�
								//e�� ����Ǵ� ���� �Ǽ��̱� ������ 2.0�� ����ȴ�.
		
		int g = b/c;			//���� g�� �����ϰ� �ڷ����� int�� ������ ���� b/c�̴�.
								//b/c�� ���������� �����̱� ������ ������� 2�̰�, g�� �ڷ����� �����̱� ������ 2�� ����ȴ�.
		
		double h = b/(double)c;	//���� h�� �����ϰ� �ڷ����� double�� b/(double)c�� ������� �����Ѵ�
								//b/(double)c �� ������� c�� ���� ����ȯ�� ������ �Ǽ��� �����̰�,
								//�̶� ������ �Ǽ����� ������ �۱⶧���� ������ �Ǽ��� ������ ����ȯ�� �Ͼ��
								//�Ǽ��� �Ǽ��� �������� �ٲ�� ������� 2.5�̰�, �� ���� �����ϴ� ���� h�� �ڷ����� �Ǽ��̱� ������ 2.5�� ����ȴ�.
		
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		
		
		
		
	}

}
