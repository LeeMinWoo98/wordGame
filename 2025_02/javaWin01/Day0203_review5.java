package javaWin01;

public class Day0203_review5 {

	public static void main(String[] args) {
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		
		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		
		for(int i=0; i<carnum.length; i++) {
			//�ʱ� ���ڸ� ã��
			nowCar = carnum[i];					//carnum�迭�� �ִ� ù��° ������ nowCar�� ����
			carPositionIndex = nowCar%10;		//������ ������ ��ȣ�� carPositionIndex�� nowCar�� ����� ������ȣ�� ������ ���� ����
			System.out.println(nowCar+"���� "+ carPositionIndex+ " ���� �����ڸ� �Դϴ�.");	//�ߺ��� �Ű澲�� �ʰ� �ϴ� �ڸ� ����
			
			//totalCarCnt�� ������ ������ ��, parking�� totalCarCnt���� ũ�ٸ� == �����忡 �ڸ��� �ִٸ�
			if(totalCarCnt<parking.length) {
				//���ѷ����� �����µ�	 parking�迭�� ������� ������ ��� ���� == ���� �ڸ��� �̹� �� �ִٸ� ��� ����
				for(; parking[carPositionIndex]!=0;) {					
					System.out.println("���ڸ����� Ȯ�� ���Դϴ�.");				
					carPositionIndex=(carPositionIndex+1)%(parking.length);	//�� ������ ������ ��ȣ�� ���� ��ȣ�� ������ϱ� ������ �ڸ��� �ߺ��ȴٸ�
																			//carPositionIndex�� 1 ������Ű��(���� �ڸ��� ����)
																			//������ ���ڰ� 9�� ��� 1 ������Ű�� 10�� �Ǳ� ������ %10�ؼ� 0���� �����
																			//�̶� %10�� �������� �ڸ� ��, ex)�ڸ��� 8������, ���ڸ��� 7�� ������ �δ뿴�ٸ�
																			//(7+1)%(parking.length==8)->0���� ������
					System.out.println(carPositionIndex+"��ȣ�� ���� ����");		//������ ��ȣ�� ���� �����Ѵٰ� �˸�
																			
				}
				
				System.out.println(carPositionIndex+"��ȣ�� �����մϴ�");		//������ ��ġ�� ��ȣ �˸�
				parking[carPositionIndex] = nowCar;							//carnum�迭�� i��° ������ parking�迭�� �����ϴµ�
																			//������ȣ�� �������ڸ��� ��ȣ�� ���� ������
				totalCarCnt++;												//�� ���� ���� �� ����
			}
		}
		System.out.println(totalCarCnt);
		
	}

}

