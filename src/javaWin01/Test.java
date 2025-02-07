package javaWin01;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			/*
	1. 최대 10개의 영단어를 저장할 수 있다. <미리 저장해 둔다, 또는 게임하는 사람이 단어를 저장한다>								
	2. 엔터키를 누르면 게임이 시작되며 저장된 단어 10개 중 랜덤한 단어 한개가 콘솔에 출력된다.								
	3. 키보드로 해당 단어를 입력한다.								
	4. 채점정책을 정의. 단어의 알파벳이 모두 맞아야 점수인정, 부분점수 인정 등 점수 산정 정의								
	5. 게임종료정책 기준 마련. 예를들어 10개의 모든 단어가 나와야 종료, 단어 중복 상관없이 10번만 할 수 있다 등등
	6. 기타 추가하고 싶은 기능및 정책을 구분하여 추가								
									
	-- 기타기능의 샘플								
	1. 중복단어제시금지정책 - 제시되는 단어가 중복되지 않는다.								
	2. 복습기능 - 틀린 단어만 별도로 저장하여 복습하도록 서비스를 진행한다.								
	3. 채점정책 다양화 - 연속된 단어를 2번, 3번 맞출경우 보너스 점수를 준다..	
	4. 채점정책 다양화 - 단어별로 색깔을 다르게 한다. 흰색은 10점, 노랑색은 15점, 빨간색은 두번 입력해야 점수를 획득 등의 점수 정책에 활용한다. 				
			 */
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		
		String[] color= {"\u001B[30m","\u001B[31m","\u001B[33m","\u001B[34m"};//검은색,빨간색,노란색,파란색
		String exit= "\u001B[0m";
		String[] rankName=new String[5];
		String[] menu= {"회원가입	","로그인	","로그아웃	","시작	","랭킹	","도움말	","종료"};
		int[] rankScore=new int[5];
		float[] rankAcc=new float[5];
		String name=new String("guest");
		
		String id=new String();
		String ps=new String();
		String[] memberId=new String[50];
		String[] memberPs=new String[50];
		int memberLen=0;
		boolean nameCk=true;
		boolean logCk=false;
		boolean rankCk=false;
		
		
		System.out.println("_______________________________________________");
		System.out.println("" + 
				"                            _ \r\n" + 
				"                           | |\r\n" + 
				"__      __  ___   _ __   __| |\r\n" + 
				"\\ \\ /\\ / / / _ \\ | '__| / _` |\r\n" + 
				" \\ V  V / | (_) || |   | (_| |\r\n" + 
				"  \\_/\\_/   \\___/ |_|    \\__,_|\r\n" + 
				"                              \r\n" + 
				"                              \r\n" + 
							"	 ___   |      _______   |  ");
		System.out.println("	|      |         ㅅ        	|");
		System.out.println("	|ㅡㅡ     |___     /  \\ 	|___      ");
		System.out.println("	|___   |       /    \\ 	| ");
		System.out.println("	       |                | ");
		System.out.println("-----------------------------------------------");
		
		while(true) {
			String[] word= {"apple","banana","fish","computer","eclipse",
					"keyboard","mouse","file","data","base"};
			
			int score=0, len=0, ck=0, failIndex=0, s=0, totalLength=0, totalAns=0;
			boolean combo=false;
			String[] fail=new String[10];
			float acc=0;
			System.out.println(" ");
			if(logCk) {
				menu[1]="";
				menu[2]="로그아웃	";
			}else {
				menu[1]="로그인	";
				menu[2]="";
			}
			if(rankCk) {
				menu[4]="랭킹	";
			}else {
				menu[4]="";
			}
			for(int i=0;i<menu.length;i++) {
				System.out.print(menu[i]);
			}
			System.out.println("");
			
			System.out.println("_______________________________________________\r");
			System.out.print("원하는 메뉴를 입력하세요: ");
			
			String sel=in.nextLine();
			System.out.println("-----------------------------------------------");
			
			if(sel.equals("랭킹") && rankCk) {
				System.out.println("   	           			        ");
				System.out.println("	              	랭킹		        ");
				System.out.println("_______________________________________________");
				System.out.println("	id	|	점수	|	정확도	");
				System.out.println("-----------------------------------------------");
				for(int i=4;i>=0;i--)
					System.out.println("	"+rankName[i]+"	|	"+rankScore[i]+"	|	"+rankAcc[i]+"	");
				System.out.println("_______________________________________________");
				
			}else if(sel.equals("종료")) {
				System.out.println("");
				System.out.println("게임을 종료합니다.					");
				System.out.println("_______________________________________________");
				break;
				
			}else if(sel.equals("시작")) {
				
				System.out.println("");
				System.out.println("현재ID: "+name);
	
				System.out.println("영문 타자게임");
				System.out.println("엔터를 누르면 시작합니다");
				in.nextLine();
				System.out.println("게임 시작!			\r");
				
				for(int i=0;i<10;i++) { //10번 입력시 종료
					
					int target=r.nextInt(10); //문제 랜덤 출력
					String quest=word[target];
					if(quest.length()==0) { //중복 방지
						i--;
						continue;
					}
					System.out.println("_______________________________________________");
					word[target]="";
					totalLength+=quest.length(); //정확도 계산용 총 글자수
					
					ck=0; //일치하는 글자수
					System.out.println("현재점수: "+score+"					");
					
					int c=r.nextInt(4); //색 지정
					
					System.out.println("문제: "+color[c]+quest+exit+"\r"); //문제 출력
					System.out.print("입력: ");
					String answer=in.nextLine(); //정답입력
					
					if(quest.length()<answer.length()) { //정답체크 반복수 지정
						len=quest.length();
					}else {
						len=answer.length();
					}
					
					for(int j=0;j<len;j++) {
						if(quest.charAt(j)==answer.charAt(j)) { //정답 체크
							ck++;
						}
					}
					if(quest.length()<answer.length())
						totalLength+=answer.length()-quest.length();
					totalAns+=ck; //총 일치하는 글자수
					
					if(quest.equals(answer)) {
						if(combo) { //이전문제도 정답일시
							s=c+3; //기본점수 2 연속정답 1 색깔별 점수 추가
							System.out.println("연속정답!	 점수+"+s+"					");
							score+=s;
						}else { //이번문제만 정답시 
							s=c+2; //기본점수 2 색깔점수 c
							System.out.println("정답!	 점수+"+s+"						");
							score+=s;
							combo=true;
						}
					}else if(ck>=quest.length()/2 && quest.length()>=answer.length()) { //절반이상 일치하는 오답
						System.out.println("부분정답!	 점수 +1"+"						");
						score+=1;
						fail[failIndex++]=quest; //오답단어 추가
						combo=false;
					}else{ //오답
						System.out.println("오답!	 점수 없음"+"						");	
						fail[failIndex++]=quest; //오답단어 추가
						combo=false;
					}
					acc=(float)(totalAns*1000/totalLength)/10;
					System.out.println("정확도: "+acc+"%				"); 
					System.out.println("						");
				}
		
				System.out.println("게임종료! 최종점수: "+score+"				");
				
				
				while(true) {
					System.out.println("\n오답노트를 보시겠습니까? (Y/N)");
					String failCk=in.nextLine();
					if(failCk.equals("Y")) {
						System.out.println("오답노트: 					");
						if(failIndex==0)
							System.out.println("없음");
						for(int i=0;i<failIndex;i++) {
							System.out.println("-"+fail[i]);
						}
						break;
					}else if(failCk.equals("N")){
						break;
					}
					System.out.println("Y 또는 N을 입력해 주세요");
				}
				if(score>rankScore[0]) {
					rankName[0]=name;
					rankScore[0]=score;
					rankAcc[0]=acc;
				}
				String temp=new String();
				for(int j=1;j<5;j++) {
					if(rankScore[j]<rankScore[j-1]) {
						score=rankScore[j];
						rankScore[j]=rankScore[j-1];
						rankScore[j-1]=score;
						
						temp=rankName[j];
						rankName[j]=rankName[j-1];
						rankName[j-1]=temp;
						
						acc=rankAcc[j];
						rankAcc[j]=rankAcc[j-1];
						rankAcc[j-1]=acc;
					}
				}
				rankCk=true;
				System.out.println("   	           			        ");
			}else if(sel.equals("회원가입")){
				System.out.println("회원가입을 진행합니다. 엔터를 눌러주세요");
				in.nextLine();
					if(memberLen<memberId.length) {
						nameCk=true;
						System.out.println("아이디를 입력해 주세요");
						id=in.nextLine();
						for(int i=0;i<memberLen;i++) {
							if(memberId[i].equals(id)) {
								System.out.println("중복되는 아이디");
								nameCk=false;
								break;
							}
						}
						if(nameCk) {
							System.out.println("비밀번호를 입력해 주세요");
							memberId[memberLen]=id;
							memberPs[memberLen]=in.nextLine();
							System.out.println("비밀번호를 다시 입력해 주세요 (취소하려면 \"취소\"를 입력해 주세요)");
							String psCk=new String();
							while(true) {
								System.out.println("비밀번호 확인: ");
								psCk=in.nextLine();
								if(memberPs[memberLen].equals(psCk)) {
									break;
								}else if(psCk.equals("취소")){
									psCk="%%%%";
									break;
								}
							}
							if(psCk.equals("%%%%")) {
								System.out.println("회원가입 취소. 처음으로 돌아갑니다.");
								continue;
							}
							memberLen++;
							System.out.println("");
							System.out.println("회원가입 성공!");
						}
				}else {
					System.out.println("회원 등록이 불가능합니다.");
				}
			}else if(sel.equals("로그인") && !logCk){
				System.out.println("로그인을 진행합니다. 엔터를 눌러주세요");
				in.nextLine();
				nameCk=true;
				System.out.println("아이디를 입력해 주세요");
				id=in.nextLine();
				for(int i=0;i<memberLen;i++) {
					if(memberId[i].equals(id)) {
						nameCk=false;
						break;
					}
				}
				if(nameCk==false) {
					System.out.println("비밀번호을 입력해 주세요");
					ps=in.nextLine();
					for(int i=0;i<memberLen;i++) {
						if(memberPs[i].equals(ps)) {
							System.out.println("로그인 성공!");
							name=id;
							System.out.println("아이디: "+name);
							logCk=true;
							break;
						}
					}
					
				}
				if(logCk==false){
					System.out.println("로그인 실패");
				}
				
			}else if(sel.equals("로그아웃") && logCk){
				System.out.println("로그아웃 되었습니다.");
				name="guest";
				logCk=false;
				System.out.println("");
			}else if(sel.equals("도움말")){
				System.out.println("");
				System.out.println("현재ID: "+name);
	
				System.out.println("점수: 검은색+2,"+color[1]+"빨간색+3,"+color[2]+"노란색+4,"+color[3]+"파란색+5"+exit
						+"\n연속정답+1 가산	부분정답+1 고정			");
				System.out.println("엔터를 누르면 돌아갑니다");
				in.nextLine();
			}
		}
		}
	

	}


