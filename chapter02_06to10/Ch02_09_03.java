package chapter02_06to10;
/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 * 1) �߰�
 * 2) ����
 * 3) ����
 */
import java.util.Scanner;

public class Ch02_09_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 0, 0};
		
		int cnt = 3;
		int data = 0;
		int idx = -1;

		boolean run = true;
		while(run) {
			
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[1]�߰�");
			System.out.println("[2]����");
			System.out.println("[3]����");
			System.out.println("[0]����");
			
			System.out.print("�޴����� : ");
			int sel = scan.nextInt();

			if(sel==1) {
				if(cnt==5) {
					System.out.println("���̻��߰��Ұ���");
					continue;
				}
				System.out.println("�߰��� ������ �Է�:");
				data = scan.nextInt();
				arr[cnt] = data;
				cnt += 1;
			}else if(sel==2) {
				if(cnt==0) {
					System.out.println("�����Ұ���");
					continue;
				}
				System.out.println("������ ������ �Է�:");
				data = scan.nextInt();
				for(int i=0; i<cnt; i++) {
					if(data==arr[i]) {
						idx = i;
					}
				}
				for(int i=idx; i<cnt-1; i++) {
					arr[i] = arr[i+1];
				}
				cnt -= 1;
			}else if(sel==3) {
				System.out.print("������ �ε����Է�:");
				idx = scan.nextInt();
				if(idx<0||idx>=cnt) {
					System.out.println("���ԺҰ���");
					continue;
				}else {
					System.out.print("������ �������Է�:");
					data = scan.nextInt();
					
					for(int i=idx+1; i<cnt+1; i++) {
						arr[i]=arr[i-1];
					}
					arr[idx] = data;
					cnt += 1;
				}
			}else if(sel==0) {
				System.out.println("����");
				run = false;
			}
		}

		
		
	}

}
