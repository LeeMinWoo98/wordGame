package javaWin01;

import java.util.Random;


public class Day0123_s1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		
		int [] lotto = new int[45];
		int max=0;
		int min=100;
		
		int sum=0;
		int avg=0;
		
		
		for(int i=0; i<1000; i++) {                     //r.nextInt(45)���� ���� �� �ϳ��� lotto�� �ε����� ����� lotto[23]++
			lotto[r.nextInt(45)]++;						//for������ ���� ���� ���� ������ �� �ε����� ���� �ϳ��� ������Ų��.         	
		}
		for(int i=0; i<45; i++) {
			System.out.println((i+1)+"��  "+lotto[i]+"ȸ"+" Ȯ��"+ (double)lotto[i]/10+"%"); //�迭�� ���� �ε����� 0�̱⋚���� i+1�� 1�� ǥ��
		
		}
		
		for(int i=0; i<45; i++) {
			if(lotto[i]>=max) {			//���� ���� ū ��ȣ�� �켱 -> i���� ū ���� ����Ѵ�. for������ i���� �ڵ����� ����
				max = lotto[i];			//���� ���� max���� ���ų� ũ�ٸ�(>=) i�� �����Կ� ���� ���߿� ���� max���� ���� 
										//�迭�� ���� �ִ밡 ������
			}
			
		
			if(lotto[i]<=min) {			//���� ���������� i���� �����ϸ鼭 ���߿� Ȯ���� min���� �����Ϸ��� min<=lotto
				min = lotto[i];			// ���Ⱑ �迭�� ���� �ּҰ� ������
			}
			
			sum += lotto[i];			//�� ���� �� ���ؼ�
		}
		
		
		
		
		
			for(int i=0; i<45; i++)
				if(max <= lotto[i])			//�迭�� �ִ밪�̶� lotto[1, 2, 3, 4, ~~~~ 45]�� ���� ���ؼ�
					max = i+1;				//�ִ밪�� 32(���� Ƚ��) lotto[5] ={32}, �̶� i ���� 5�ε� �ζǹ�ȣ�� 1������ �����̴ϱ� i+1�ؼ� ��ȣ 6�� 32�� ����
											//40��ȣ 32�� ���Դٸ� max �� ���Ƽ� ������ �ȵǴϱ� ������ max<lotto�� �ƴ϶� max<"="lotto �� ����
			for(int i=0; i<45; i++)
				if(min >= lotto[i])
					min = i+1;
			
			avg = sum/45;				//��ȣ ������ ���� ��ձ��ϱ�
			
	
			System.out.println("Ȯ���� ��� : "+(float)avg/10+"%");
			System.out.println("���� ���� ���� ��ȣ: "+ max);
			System.out.println("���� ���� ���� ��ȣ: "+ min);
			
			for(int i=0; i<45; i++) {
				if(lotto[i]>avg)
					System.out.println("Ȯ���� ��պ��� ���� ��ȣ : "+(i+1)+"��");
				
				
			}
			for(int i=0; i<45; i++)
				System.out.println(i+"+1��"+" "+lotto[i]);
				
		}
	}