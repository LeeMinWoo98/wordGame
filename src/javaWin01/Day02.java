package javaWin01;

public class Day02 {

	public static void main(String[] args) {
		int a=100;	//a�� ö��		-> ������ pointYoungsu 
		int b=100;	//b�� ����		-> ������ pointChulsu
		
			a = a+20;	//ö�� 2��		a = a+10
						//			a = a+10
			b = b-20;	//���� 2��		b = b+10
						//			b = b+10
			a = a+2;	//���
			b = b+2;	//���
			b = b+10;	//���� 1��
			a = a-10;	//ö�� 1��
		
		System.out.println("ö���� ���� : " + a); 	//ö���� ����		->���⼭ +�� ���ڿ� ������
		System.out.println("������ ���� : " + b);	//������ ����		->���⼭ +�� ���ڿ� ������
		

	}

}
