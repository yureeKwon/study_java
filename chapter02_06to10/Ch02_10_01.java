package chapter02_06to10;

/*
 * # ATM[3�ܰ�]
 * 1. ����
 * ���¹�ȣ�� ��й�ȣ�� �Է¹޾� ����
 * ���¹�ȣ �ߺ��˻�
 * 2.Ż��
 * ���¹�ȣ�� �Է¹޾� Ż��
 */
import java.util.Scanner;

public class Ch02_10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;
		
		int newAcc = 0;
		int newPw = 0;
		
		int delAcc = 0;
		int delPw = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("1.���� 2.Ż��");
			System.out.print("�޴�����:");
			int sel = scan.nextInt();
			
			if(sel==1) {
				
				if(cnt==5) {
					System.out.println("���̻��ԺҰ�");
					continue;
				}
				
				System.out.print("�����¹�ȣ�Է�:");
				newAcc = scan.nextInt();
				
				int check = 1;
				for(int i=0; i<cnt; i++) {
					if(accs[i]==newAcc) {
						check = -1;
					}
				}
				
				if(check==1) {
					System.out.print("������Է�:");
					newPw = scan.nextInt();
					accs[cnt] = newAcc;
					pws[cnt] = newPw;
					cnt += 1;
					System.out.println("���ԿϷ�");
				}else if(check==-1) {
					System.out.println("�̹������ϴ°��¹�ȣ");
					continue;
				}
				
			}else if(sel==2) {
				int check = -1;
				System.out.print("Ż���Ұ��¹�ȣ:");
				delAcc = scan.nextInt();
				for(int i=0; i<cnt; i++ ) {
					if(delAcc==accs[i]) {
						check = i;
					}
				}
				if(check==-1) {
					System.out.println("�Է��Ѱ��¾���");
					continue;
				}else {
					System.out.print("����Է�:");
					delPw = scan.nextInt();
					if(delPw==pws[check]) {
						System.out.println("Ż��Ϸ�");
						for(int i=check; i<cnt-1;i++) {
							accs[i] = accs[i+1];
							pws[i] = pws[i+1];
						}
	//********���������� 0�����ʱ�ȭ�������. ���� �迭�� ������ �����������ϱ� �Ʒ�ó������
						accs[cnt-1] = 0; 
						pws[cnt-1] = 0;
					
						cnt = cnt - 1;
					}else {
						System.out.println("���Ʋ��");
						continue;
					}
					
				}
				
			}
		}
		

	}

}
