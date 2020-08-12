package chapter03_11to16;
/*
 * #���� 1�ο�
 */
import java.util.Random;
import java.util.Scanner;

public class Ch03_15_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int max = 5;
		
		int[][] bingo = new int[max][max];
		int[][] mark = new int[max][max];
		
		int[] temp = new int[max*max];
		int size = 50;
		
		int win = 0;
		
		//1.1����50������ ���� �ߺ����� �������� �̾Ƽ� temp�� ����
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size)+ 1;
			for(int j=0; j<i; j++) {
				if(temp[i]==temp[j]) {
					i -= 1;
				}
			}
		}
		//2.����25�� �����ǿ� �ֱ�
		int k = 0;
		for(int i=0; i<max; i++) {
			for(int j=0; j<max; j++) {
				bingo[i][j] = temp[k];
				k++;
			}
		}
		
		//3.��������
		while(true) {
			//3.1 ���������
			System.out.println("===BINGO GAME===");
			System.out.print("\t");
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
			}
			System.out.println("\n");
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
				for(int j=0; j<max; j++) {
					if(mark[i][j]==0) {
						System.out.print(bingo[i][j] + "\t");
					}else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}
			//3.2����Ȯ��
			if(win==1) {
				System.out.println("�¸�");
				 break;
			}
			
			//3.3 turn����
			System.out.print("y��ǥ�Է�:");
			int meY = scan.nextInt();
			System.out.print("x��ǥ�Է�:");
			int meX = scan.nextInt();
			
			if(mark[meY][meX]==0) {
				mark[meY][meX]=1;
			}
			
			//4.�˻�-����
			for(int i=0; i<max; i++) {
				int cnt = 0;
				for(int j=0; j<max; j++) {
					if(mark[i][j]==1) {
						cnt += 1;
					}else {
						cnt = 0;
					}
					if(cnt==5) {
						win = 1;
					}
				}
			}
			//5.�˻�-����
			for(int j=0; j<max; j++) {
				int cnt = 0;
				for(int i=0; i<max; i++) {
					if(mark[i][j]==1) {
						cnt += 1;
					}else {
						cnt = 0;
					}
					if(cnt==5) {
						win = 1;
					}
				}
			}
			//6.�˻�-�밢��
			int cnt1 = 0;
			for(int i=0; i<max; i++) {
				if(mark[i][i]==1) {
					cnt1 += 1;
				}else {
					cnt1 = 0;
				}
				if(cnt1==5) {
					win = 1;
				}
			}
			cnt1= 0;
			for(int i=0; i<max; i++) {
				if(mark[4-i][i]==1) {
					cnt1 += 1;
				}else {
					cnt1 = 0;
				}
				if(cnt1==5) {
					win = 1;
				}
			}
			
		}
		
		
	}

}
