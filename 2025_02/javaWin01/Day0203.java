package javaWin01;

public class Day0203 {

	public static void main(String[] args) {
		
		int[] a ={1, 0, 0, 0, 2, 3, 4, 4, 6, 2, 2, 2, 2, 2};
		System.out.println(a.length + "���� �迭");
		int cnt=0;

		for(int i=0; i<a.length-2; i++){ 	//3�� �̻��ΰ͸� üũ�ϴϱ� ���������� -2������ Ȯ�� �� �������� �Ʒ� for������ ����, �ٴ����� ã�Ƽ� ���ϸ� �Ǳ� ������ -2�� ���ش�
			System.out.print(i+" : ");		//ex) ���̰� 14�϶� 12������ ���� ������ �Ǵ� ���� Ȯ�� �� �� �� 2���� ���ڴ� �Ʒ� for���� �ذ�
			cnt=1;
			for(int j=i+1; a[i]==a[j]; j++) {	//i��° �ε����� ���� �� ���� �ε����� ���� ���ϱ� ���� j=i+1�� ��� 
				System.out.print(j+" ");
				cnt++;
				if(j==a.length-1)
					break;		//���� �ݺ����� �����Ѵ�. ���⼭ ���� �ݺ����� 14��° �� for��
			}
			if(cnt>=3) {
			System.out.println("�� ���� : "+cnt);
			i+=cnt;
			}
			System.out.println();
		}
		
	}

}
