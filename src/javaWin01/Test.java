package javaWin01;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			/*
	1. �ִ� 10���� ���ܾ ������ �� �ִ�. <�̸� ������ �д�, �Ǵ� �����ϴ� ����� �ܾ �����Ѵ�>								
	2. ����Ű�� ������ ������ ���۵Ǹ� ����� �ܾ� 10�� �� ������ �ܾ� �Ѱ��� �ֿܼ� ��µȴ�.								
	3. Ű����� �ش� �ܾ �Է��Ѵ�.								
	4. ä����å�� ����. �ܾ��� ���ĺ��� ��� �¾ƾ� ��������, �κ����� ���� �� ���� ���� ����								
	5. ����������å ���� ����. ������� 10���� ��� �ܾ ���;� ����, �ܾ� �ߺ� ������� 10���� �� �� �ִ� ���
	6. ��Ÿ �߰��ϰ� ���� ��ɹ� ��å�� �����Ͽ� �߰�								
									
	-- ��Ÿ����� ����								
	1. �ߺ��ܾ����ñ�����å - ���õǴ� �ܾ �ߺ����� �ʴ´�.								
	2. ������� - Ʋ�� �ܾ ������ �����Ͽ� �����ϵ��� ���񽺸� �����Ѵ�.								
	3. ä����å �پ�ȭ - ���ӵ� �ܾ 2��, 3�� ������ ���ʽ� ������ �ش�..	
	4. ä����å �پ�ȭ - �ܾ�� ������ �ٸ��� �Ѵ�. ����� 10��, ������� 15��, �������� �ι� �Է��ؾ� ������ ȹ�� ���� ���� ��å�� Ȱ���Ѵ�. 				
			 */
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		
		String[] color= {"\u001B[30m","\u001B[31m","\u001B[33m","\u001B[34m"};//������,������,�����,�Ķ���
		String exit= "\u001B[0m";
		String[] rankName=new String[5];
		String[] menu= {"ȸ������	","�α���	","�α׾ƿ�	","����	","��ŷ	","����	","����"};
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
		System.out.println("	|      |         ��        	|");
		System.out.println("	|�Ѥ�     |___     /  \\ 	|___      ");
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
				menu[2]="�α׾ƿ�	";
			}else {
				menu[1]="�α���	";
				menu[2]="";
			}
			if(rankCk) {
				menu[4]="��ŷ	";
			}else {
				menu[4]="";
			}
			for(int i=0;i<menu.length;i++) {
				System.out.print(menu[i]);
			}
			System.out.println("");
			
			System.out.println("_______________________________________________\r");
			System.out.print("���ϴ� �޴��� �Է��ϼ���: ");
			
			String sel=in.nextLine();
			System.out.println("-----------------------------------------------");
			
			if(sel.equals("��ŷ") && rankCk) {
				System.out.println("   	           			        ");
				System.out.println("	              	��ŷ		        ");
				System.out.println("_______________________________________________");
				System.out.println("	id	|	����	|	��Ȯ��	");
				System.out.println("-----------------------------------------------");
				for(int i=4;i>=0;i--)
					System.out.println("	"+rankName[i]+"	|	"+rankScore[i]+"	|	"+rankAcc[i]+"	");
				System.out.println("_______________________________________________");
				
			}else if(sel.equals("����")) {
				System.out.println("");
				System.out.println("������ �����մϴ�.					");
				System.out.println("_______________________________________________");
				break;
				
			}else if(sel.equals("����")) {
				
				System.out.println("");
				System.out.println("����ID: "+name);
	
				System.out.println("���� Ÿ�ڰ���");
				System.out.println("���͸� ������ �����մϴ�");
				in.nextLine();
				System.out.println("���� ����!			\r");
				
				for(int i=0;i<10;i++) { //10�� �Է½� ����
					
					int target=r.nextInt(10); //���� ���� ���
					String quest=word[target];
					if(quest.length()==0) { //�ߺ� ����
						i--;
						continue;
					}
					System.out.println("_______________________________________________");
					word[target]="";
					totalLength+=quest.length(); //��Ȯ�� ���� �� ���ڼ�
					
					ck=0; //��ġ�ϴ� ���ڼ�
					System.out.println("��������: "+score+"					");
					
					int c=r.nextInt(4); //�� ����
					
					System.out.println("����: "+color[c]+quest+exit+"\r"); //���� ���
					System.out.print("�Է�: ");
					String answer=in.nextLine(); //�����Է�
					
					if(quest.length()<answer.length()) { //����üũ �ݺ��� ����
						len=quest.length();
					}else {
						len=answer.length();
					}
					
					for(int j=0;j<len;j++) {
						if(quest.charAt(j)==answer.charAt(j)) { //���� üũ
							ck++;
						}
					}
					if(quest.length()<answer.length())
						totalLength+=answer.length()-quest.length();
					totalAns+=ck; //�� ��ġ�ϴ� ���ڼ�
					
					if(quest.equals(answer)) {
						if(combo) { //���������� �����Ͻ�
							s=c+3; //�⺻���� 2 �������� 1 ���� ���� �߰�
							System.out.println("��������!	 ����+"+s+"					");
							score+=s;
						}else { //�̹������� ����� 
							s=c+2; //�⺻���� 2 �������� c
							System.out.println("����!	 ����+"+s+"						");
							score+=s;
							combo=true;
						}
					}else if(ck>=quest.length()/2 && quest.length()>=answer.length()) { //�����̻� ��ġ�ϴ� ����
						System.out.println("�κ�����!	 ���� +1"+"						");
						score+=1;
						fail[failIndex++]=quest; //����ܾ� �߰�
						combo=false;
					}else{ //����
						System.out.println("����!	 ���� ����"+"						");	
						fail[failIndex++]=quest; //����ܾ� �߰�
						combo=false;
					}
					acc=(float)(totalAns*1000/totalLength)/10;
					System.out.println("��Ȯ��: "+acc+"%				"); 
					System.out.println("						");
				}
		
				System.out.println("��������! ��������: "+score+"				");
				
				
				while(true) {
					System.out.println("\n�����Ʈ�� ���ðڽ��ϱ�? (Y/N)");
					String failCk=in.nextLine();
					if(failCk.equals("Y")) {
						System.out.println("�����Ʈ: 					");
						if(failIndex==0)
							System.out.println("����");
						for(int i=0;i<failIndex;i++) {
							System.out.println("-"+fail[i]);
						}
						break;
					}else if(failCk.equals("N")){
						break;
					}
					System.out.println("Y �Ǵ� N�� �Է��� �ּ���");
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
			}else if(sel.equals("ȸ������")){
				System.out.println("ȸ�������� �����մϴ�. ���͸� �����ּ���");
				in.nextLine();
					if(memberLen<memberId.length) {
						nameCk=true;
						System.out.println("���̵� �Է��� �ּ���");
						id=in.nextLine();
						for(int i=0;i<memberLen;i++) {
							if(memberId[i].equals(id)) {
								System.out.println("�ߺ��Ǵ� ���̵�");
								nameCk=false;
								break;
							}
						}
						if(nameCk) {
							System.out.println("��й�ȣ�� �Է��� �ּ���");
							memberId[memberLen]=id;
							memberPs[memberLen]=in.nextLine();
							System.out.println("��й�ȣ�� �ٽ� �Է��� �ּ��� (����Ϸ��� \"���\"�� �Է��� �ּ���)");
							String psCk=new String();
							while(true) {
								System.out.println("��й�ȣ Ȯ��: ");
								psCk=in.nextLine();
								if(memberPs[memberLen].equals(psCk)) {
									break;
								}else if(psCk.equals("���")){
									psCk="%%%%";
									break;
								}
							}
							if(psCk.equals("%%%%")) {
								System.out.println("ȸ������ ���. ó������ ���ư��ϴ�.");
								continue;
							}
							memberLen++;
							System.out.println("");
							System.out.println("ȸ������ ����!");
						}
				}else {
					System.out.println("ȸ�� ����� �Ұ����մϴ�.");
				}
			}else if(sel.equals("�α���") && !logCk){
				System.out.println("�α����� �����մϴ�. ���͸� �����ּ���");
				in.nextLine();
				nameCk=true;
				System.out.println("���̵� �Է��� �ּ���");
				id=in.nextLine();
				for(int i=0;i<memberLen;i++) {
					if(memberId[i].equals(id)) {
						nameCk=false;
						break;
					}
				}
				if(nameCk==false) {
					System.out.println("��й�ȣ�� �Է��� �ּ���");
					ps=in.nextLine();
					for(int i=0;i<memberLen;i++) {
						if(memberPs[i].equals(ps)) {
							System.out.println("�α��� ����!");
							name=id;
							System.out.println("���̵�: "+name);
							logCk=true;
							break;
						}
					}
					
				}
				if(logCk==false){
					System.out.println("�α��� ����");
				}
				
			}else if(sel.equals("�α׾ƿ�") && logCk){
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				name="guest";
				logCk=false;
				System.out.println("");
			}else if(sel.equals("����")){
				System.out.println("");
				System.out.println("����ID: "+name);
	
				System.out.println("����: ������+2,"+color[1]+"������+3,"+color[2]+"�����+4,"+color[3]+"�Ķ���+5"+exit
						+"\n��������+1 ����	�κ�����+1 ����			");
				System.out.println("���͸� ������ ���ư��ϴ�");
				in.nextLine();
			}
		}
		}
	

	}


