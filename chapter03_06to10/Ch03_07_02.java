package chapter03_06to10;
/*
 * # �迭 ��Ʈ�ѷ�[2�ܰ�] : ����(Vector)
 * 1.�߰�
 * ���� �Է¹޾� ���������� �߰�
 * 2.����(�ε���)
 * �ε����� �Է¹޾� �ش� ��ġ�� �� ����
 * 3.����(��)
 * ���� �Է¹޾� ����
 * ���� �� �Է� �� ����ó��
 * 4.����
 * �ε����� ���� �Է¹޾� ����
 */
import java.util.Scanner;

public class Ch03_07_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int cnt = 0;
		
		while(true) {
			for(int i=0; i<score.length; i++) {
				System.out.print(score[i]+" ");
			}System.out.println();
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰�");
			System.out.println("[2]����(�ε���)");
			System.out.println("[3]����(��)");
			System.out.println("[4]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if(sel==1) {
				if(cnt==0) {
					score = new int[cnt+1];
				}else if(cnt>0) {
					int[] temp = score;
					score = new int[cnt+1];
					for(int i=0; i<cnt; i++) {
						score[i] = temp[i];
					}
					
					System.out.print("[�߰�]���Է�:");
					int data = scan.nextInt();
					score[cnt] = data;
					cnt+=1;
				}
				
			}else if(sel==2) {
				
				System.out.print("[����]�ε����Է�:");
				int delidx=scan.nextInt();
				if(delidx>=cnt||delidx<0) {
					System.out.println("�����Ұ���");
					continue;
				}
				
				if(cnt==1) {
					score = null;
				}else if(cnt>1) {
					int[] temp = score;
					score = new int[cnt-1];
					for(int i=0; i<delidx; i++) {
						score[i] = temp[i];
					}
					for(int i=delidx; i<cnt-1; i++) {
						score[i] = temp[i+1];
					}
					temp = null;
				}
				cnt-=1;
				
			}else if(sel==3) {
				 System.out.print("[����]���Է�:");
				 int deldata = scan.nextInt();
				 
				 int delidx=-1;
				 for(int i=0; i<cnt; i++) {
					 if(deldata==score[i]) {
						 delidx=i;
					 }
				 }
				 if(delidx==-1) {
					 System.out.println("�ش簪������������");
					 continue;
				 }
				 
				 if(cnt==1) {
					 score = null;
				 }else if(cnt>1) {
					 int[] temp = score;
					 score = new int[cnt-1];
					 
					 int j=0;
					 for(int i=0; i<cnt; i++) {
						 if(i!=delidx) {
							 score[j] = temp[i];
							 j += 1;
						 }
					 }
					 temp = null;
				 }
				 cnt -= 1;
			}else if(sel==4) {
				System.out.print("[����]�ε����Է�:");
				int insertidx = scan.nextInt();
				if(insertidx<0||insertidx>=cnt) {
					System.out.println("�ش���ġ���ԺҰ�");
					continue;
				}
				System.out.print("[����]���Է�:");
				int insertdata = scan.nextInt();
				
				if(cnt==0) {
					score = new int[1];
				}else if(cnt>1) {
					int[] temp = score;
					score = new int[cnt+1];
					
					int j=0;
					for(int i=0; i<cnt+1; i++) {
						if(i!=insertidx) {
							score[i] = temp[j];
							j+=1;
						}
					}
					temp=null;
				}
				
				score[insertidx] = insertdata;
				cnt+=1;
			}else if(sel==0) {
				System.out.println("����");
				break;
			}
			
			
		}
		
	}

}
