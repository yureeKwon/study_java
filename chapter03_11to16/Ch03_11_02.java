package chapter03_11to16;
/*
 * # ���θ� [��ٱ���]
 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
 *  1) ��� 2) �ٳ��� 3) ����
 * 2. ��ȣ�� �����Ͽ� ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
 * 3. �α��� ȸ���� �ε��� ��ȣ�� �� ���� ù��° ���� �����Ѵ�.
 * 4. �ش� ȸ���� ������ ��ǰ�� �ε��� ��ȣ�� �� ���� �ι�° ���� �����Ѵ�.
 * {
 * 		{0, 1},				qwerȸ�� 			> �������
 * 		{1, 2},				javakingȸ�� 		> �ٳ�������
 * 		{2, 1},				abcdȸ��			> �������
 * 		{0, 3},				qwerȸ��			> ��������
 * 		...
 * }
 */
import java.util.Scanner;

public class Ch03_11_02 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		String[] ids = {"����", "����", "��Ÿ", "��Ÿ"};
		String[] pws = {"1111", "2222", "3333", "4444"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int cnt = 0;
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		
		while(true) {
			System.out.println("�α��λ���");
			if(log==-1) {
				System.out.println("�α׾ƿ�");
			}else {
				System.out.println(ids[log]+"�� �α�����");
			}
			System.out.println("----------");
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");

			System.out.print("�޴����� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log!=-1) {
					System.out.println("�α׾ƿ� �� �̿밡��");
					continue;
				}else {
					System.out.print("id�Է�:");
					String myid = scan.next();
					System.out.print("pw�Է�:");
					String mypw = scan.next();
					
					for(int i=0; i<ids.length; i++) {
						if(ids[i].equals(myid)&&pws[i].equals(mypw)) {
							log = i;
						}
					}
					
					if(log==-1) {
						System.out.println("�α��������ٽ�Ȯ��");
					}else {
						System.out.println(ids[log]+"�� �α��οϷ�");
					}
				}
			}
			else if(sel==2) {
				if(log==-1) {
					System.out.println("�α��� �� �̿밡��");
					continue;
				}else {
					log = -1;
					System.out.println("�α׾ƿ��Ϸ�");
				}
			}
			else if(sel==3) {
				if(log==-1) {
					System.out.println("�α��� �� �̿밡��");
					continue;
				}
				
				while(true) {
					for(int i=0; i<items.length;i++) {
						System.out.println((i+1)+")"+items[i]);
					}
					System.out.println("4)�ڷΰ���");
					System.out.println("����ǰ����:");
					int choice = scan.nextInt();
					
					if(choice==4) {
						break;
					}
					jang[cnt][0] = log;
					jang[cnt][1] = choice;
					cnt += 1;
				}
			}
			else if(sel==4) {
				if(log==-1) {
					System.out.println("�α��� �� �̿밡��");
					continue;
				}else {
					System.out.println(ids[log]+"���� ��ٱ���");
					int[] itemCount = new int[items.length];
					for(int i=0; i<cnt; i++) {
						if(jang[i][0]==log) {
							if(jang[i][1]==1) {
								itemCount[0] += 1;
							}else if(jang[i][1]==2) {
								itemCount[1] += 1;
							}else if(jang[i][1]==3) {
								itemCount[2] += 2;
							}
						}
					}
					//�α����� ȸ���� ����(log) ��ٱ��Ͽ� �ִ� �������̶� ���� ���
					for(int i=0; i<items.length; i++) {
						System.out.println((i+1)+")"+items[i]+":"+itemCount[i]+"��");
					}
				}
			}
			else if(sel==0) {
				System.out.println("��������");
				break;
			}

				
			
			
		}
		
		
	}

}
