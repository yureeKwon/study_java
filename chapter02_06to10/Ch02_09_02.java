package chapter02_06to10;
/*
 * # �迭 ��Ʈ�ѷ�[1�ܰ�] : ����
 */

import java.util.Scanner;

public class Ch02_09_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int cnt = 5;

		boolean run =true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			
			System.out.println("[2]����");
			System.out.print("�޴�����:");
			int sel = scan.nextInt();
			
			if(sel==2) {
				System.out.println("������ ���Է�:");
				int data = scan.nextInt();
				int delidx =-1;
				for(int i=0; i<cnt; i++) {
					if(arr[i]==data) {
						delidx = i;
					}
				}
				
				if(delidx==-1) {
					System.out.println("�Է��� �� ������������");
				}else {
					for(int i=delidx; i<cnt-1; i++) {
						arr[i] = arr[i+1];
					}
					cnt -= 1;
				}
				
			}
		}
	}

}
