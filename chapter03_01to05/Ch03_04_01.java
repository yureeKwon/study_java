package chapter03_01to05;
/*
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�
 *    ���� 10~19�� back �迭�� �����Ѵ�.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch03_04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = new int[9];
		int[] back = new int[9];
		//123456798 101112131415161718 �ֱ�
		for(int i=0; i<9; i++) {
			front[i] = i+1;
			back[i] = i+10;
		}
		//����
		int n=0;
		while(n<100) {
			int r = ran.nextInt(9);
			
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
			
			n++;
		}
		
		//��������
		int k = 1;
		while(true) {
			//���
			for(int i=0; i<9;i++) {
				System.out.print("\t"+front[i]);
				if(i%3==2) {
					System.out.println();
				}
			}
			
			if(k==19) {
				System.out.println("����");
				break;
			}
			
			System.out.print(k+"�� ��ġ�Է�:");
			int idx = scan.nextInt();
			
//			if(k<10) {
//				if(front[idx]==k) {
//					front[idx] = back[idx];
//					k=k+1;
//				}
//			}else if(k>=10) {
//				if(front[idx]==k) {
//					front[idx]=0;
//					k=k+1;
//				}
//			}
			//���� �ּ�ó���Ѱ� �Ʒ�ó�� �����ϰ�
			if(front[idx]==k) {
				if(k<10) {
					front[idx]=back[idx];
				}else {
					front[idx]=0;
				}
				k += 1;
			}
			
		}
		
		
		

	}

}
