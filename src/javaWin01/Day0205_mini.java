package javaWin01;

import java.util.Random;
import java.util.Scanner;

public class Day0205_mini {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		String[] word =  {"apple", "simple", "sample", "couple", "triple", "purple", "temple", "example", "multple", "principle"};
		String input="";
		int point=0;
		int cnt=0;
		//String[] chosen = {};
		int num = 0;
		int[] check = new int [10];
		int bonus=0;
		int[] review = new int[10];
		int count=0;
		String replay ="";
		int playerCount=0;
		int max=0;
		int maxIndex=0;
		
		System.out.println(" ---------------------------------------");
		System.out.println("|                                       |");
		System.out.println("|		����ܾ� ���߱�		|");
		System.out.println("|					|");
		System.out.println("|					|");
		System.out.println("|					|");
		System.out.println("| 		start to enter		|");
		System.out.println("|					|");
		System.out.println(" ---------------------------------------");
			
		in.nextLine();
		System.out.println();
		
		
		
		System.out.println("������ �÷��̾��� ���� �Է��ϼ��� : ");
		while(true) {
			
			playerCount = in.nextInt();
			in.nextLine();
			System.out.println(playerCount+"���� �½��ϱ�?");
			System.out.println("Y/N");
			String aa = in.nextLine();
		
			if(aa.equals("y") || aa.equals("Y"))
				break;
			else
				System.out.println("�ٽ� �Է��ϼ��� : ");
		}
		
		String[] player = new String[playerCount];
		int[] playerPoint = new int[playerCount];
		
	
		
		for(int i=0; i<player.length; i++) {
			System.out.println((i+1)+"��° �÷��̾��� ���̵� �Է��ϼ��� : ");
			player[i] = in.nextLine();
		}
		
		System.out.println("������ �����մϴ�!");
		
		
		
		//check �迭�� num���� ���� ���� �ε����� ����� ���� ��� �迭 �� +1
		//check �迭�� ���� 0�� �ƴҰ�� �̹� ���� �ܾ�� ���� -> �ٽ� �̾ƾ� ��
		//check �迭�� ���� 0�ϰ�� �ڵ� ����
		//�������� ���� �� num�� check�� �ε����� ���
		
		for(int p=0; p<playerCount; p++) {
			
		while(true) {
		while(count<10) {
			num = r.nextInt(10);
			
			
			if(check[num]==0) {	
				System.out.println();
				System.out.println();
				System.out.println((p+1)+"�� �÷��̾��� ����");
				String pick = word[num];
				System.out.println("���� �� �ܾ� : "+pick+"�� �Է��ϼ���!!");
				input = in.nextLine();
				cnt=0;
				for(int i=0; i<pick.length(); i++) {
					char k = pick.charAt(i);
					if(pick.length()==input.length()) {
						char z = input.charAt(i);
						if(k==z) 
							cnt++;
						}
						else
							cnt=0;
						}
		
			
			if(cnt==pick.length()) {
				point += 2+bonus;
				bonus=1;
			}
			
			else if(cnt==0) {
				point += 0;
				bonus=0;
			}
			
			else if(cnt>=pick.length()/2) {
				point +=1;
				bonus=0;
			}
			
			if(cnt!=pick.length())//cnt!=pick.length() = �Է��� �ܾ �ϳ��� Ʋ�� ���
				review[num]++;
			
			System.out.println("���õ� �ܾ� : "+pick+"	�Է��� �ܾ� : "+input);
			
			if(cnt==pick.length()) {
				System.out.println("�����Դϴ�! +2��!");
				System.out.println("���� ���� : "+point);
				System.out.println("		�������� ���� ��� +1��!!!!");
				System.out.println();
			}
			else if(cnt>=pick.length()/2) {
				System.out.println("���ݸ� �� �й��ϼ���! +1��!");
				System.out.println("���� ���� : "+point);
				System.out.println();
			}
			else {
				System.out.println("�����Դϴ�! +0��!");
				System.out.println("���� ���� : "+point);
				System.out.println();
			}
			
			}
			
			else 
				count--;
		
				check[num]++;
				count++;
		}

		System.out.println("���� : "+point);
		
		System.out.println("�����ؾ� �� �ܾ� : ");
		for(int i=0; i<10; i++) {
		if(review[i]==1) 
			System.out.print(word[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<10; i++) {
			check[i]=0;
			review[i]=0;
		}
		
		playerPoint[p] = point;
		
		
		count=0;
		point=0;
		
		System.out.println((p+1)+"�� �÷��̾��� ������ �������ϴ�.");
		System.out.println("   �ٽ��Ͻðڽ��ϱ�?	");
		System.out.println("   Y/N");
		replay=in.nextLine();
		
		if(replay.equals("n") || replay.equals("N"))
			break;
		}
	}
		
		for(int i=0; i<playerCount; i++) {
			System.out.println(player[i]+"�� ���� : "+playerPoint[i]+"��");
			if(max<playerPoint[i]) {
				max = playerPoint[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("�����մϴ�!!");
		System.out.println("�̹� ������ 1���� "+max+"���� ȹ���� "+player[maxIndex]+"�Դϴ�!!!");
	
	}

}
