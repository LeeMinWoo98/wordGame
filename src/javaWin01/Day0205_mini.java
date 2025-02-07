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
		System.out.println("|		영어단어 맞추기		|");
		System.out.println("|					|");
		System.out.println("|					|");
		System.out.println("|					|");
		System.out.println("| 		start to enter		|");
		System.out.println("|					|");
		System.out.println(" ---------------------------------------");
			
		in.nextLine();
		System.out.println();
		
		
		
		System.out.println("참여할 플레이어의 수를 입력하세요 : ");
		while(true) {
			
			playerCount = in.nextInt();
			in.nextLine();
			System.out.println(playerCount+"명이 맞습니까?");
			System.out.println("Y/N");
			String aa = in.nextLine();
		
			if(aa.equals("y") || aa.equals("Y"))
				break;
			else
				System.out.println("다시 입력하세요 : ");
		}
		
		String[] player = new String[playerCount];
		int[] playerPoint = new int[playerCount];
		
	
		
		for(int i=0; i<player.length; i++) {
			System.out.println((i+1)+"번째 플레이어의 아이디를 입력하세요 : ");
			player[i] = in.nextLine();
		}
		
		System.out.println("게임을 시작합니다!");
		
		
		
		//check 배열에 num으로 뽑은 수를 인덱스로 사용해 뽑힐 경우 배열 값 +1
		//check 배열의 값이 0이 아닐경우 이미 뽑힌 단어로 생각 -> 다시 뽑아야 함
		//check 배열의 값이 0일경우 코드 실행
		//랜덤으로 뽑은 수 num을 check의 인덱스로 사용
		
		for(int p=0; p<playerCount; p++) {
			
		while(true) {
		while(count<10) {
			num = r.nextInt(10);
			
			
			if(check[num]==0) {	
				System.out.println();
				System.out.println();
				System.out.println((p+1)+"번 플레이어의 게임");
				String pick = word[num];
				System.out.println("제시 된 단어 : "+pick+"을 입력하세요!!");
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
			
			if(cnt!=pick.length())//cnt!=pick.length() = 입력한 단어가 하나라도 틀릴 경우
				review[num]++;
			
			System.out.println("제시된 단어 : "+pick+"	입력한 단어 : "+input);
			
			if(cnt==pick.length()) {
				System.out.println("정답입니다! +2점!");
				System.out.println("현재 점수 : "+point);
				System.out.println("		연속으로 맞출 경우 +1점!!!!");
				System.out.println();
			}
			else if(cnt>=pick.length()/2) {
				System.out.println("조금만 더 분발하세요! +1점!");
				System.out.println("현재 점수 : "+point);
				System.out.println();
			}
			else {
				System.out.println("오답입니다! +0점!");
				System.out.println("현재 점수 : "+point);
				System.out.println();
			}
			
			}
			
			else 
				count--;
		
				check[num]++;
				count++;
		}

		System.out.println("총점 : "+point);
		
		System.out.println("복습해야 할 단어 : ");
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
		
		System.out.println((p+1)+"번 플레이어의 게임이 끝났습니다.");
		System.out.println("   다시하시겠습니까?	");
		System.out.println("   Y/N");
		replay=in.nextLine();
		
		if(replay.equals("n") || replay.equals("N"))
			break;
		}
	}
		
		for(int i=0; i<playerCount; i++) {
			System.out.println(player[i]+"의 점수 : "+playerPoint[i]+"점");
			if(max<playerPoint[i]) {
				max = playerPoint[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("축하합니다!!");
		System.out.println("이번 게임의 1등은 "+max+"점을 획득한 "+player[maxIndex]+"입니다!!!");
	
	}

}
