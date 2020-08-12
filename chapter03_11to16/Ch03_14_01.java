package chapter03_11to16;
/*
 * # �������
 */

import java.util.Scanner;

public class Ch03_14_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int SIZE = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,2,0,0,0,2,0,0,0},
				{0,0,2,0,1,1,0,0,0,0},
				{0,0,2,0,0,0,0,0,1,0},
				{0,0,2,0,0,0,0,1,0,0},
				{0,0,2,0,0,0,0,1,0,0},
				{0,0,0,0,0,1,0,0,1,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		
		int p1Y = 0; int p1X = 0;
		int p2Y = 0; int p2X = 0;

		int turn = 0;
		int win = 0;
		
		while(true) {
			//1.���������
			System.out.println("���������");
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(omok[i][j]+" ");
				}
				System.out.println();
			}
			
			//2.��������
			//����
			for(int i=0; i<SIZE; i++) {
				int cntp1 = 0; int cntp2 = 0;
				for(int j=0; j<SIZE; j++) {
					if(omok[i][j]==1) {
						cntp1 += 1;
					}else if(omok[i][j]==2) {
						cntp2 += 1;
					}else {
						cntp1 = 0; cntp2 = 0;
					}
					
					if(cntp1==5) {
						win = 1;
					}else if(cntp2==5) {
						win = 2;
					}
				}
			}
			//����
			for(int i=0; i<SIZE; i++) {
				int cntp1 = 0; int cntp2 = 0;
				for(int j=0; j<SIZE; j++) {
					if(omok[j][i]==1) {
						cntp1 += 1;
					}else if(omok[j][i]==2) {
						cntp2 += 1;
					}else {
						cntp1 = 0; cntp2 = 0;
					}
					
					if(cntp1==5) {
						win = 1;
					}else if(cntp2==5) {
						win = 2;
					}
				}
			}
//			//�밢�� -���� --> �̷��Ե� üũ�Ҽ� ������ �Ʒ�ó�� ����for������ �� ����ϰ� �ϸ�
//			for(int i=0; i<6;i++) {
//				for(int j=0; j<6; j++) {
//					if(omok[i][j]==omok[i+1][j+1]&&omok[i+1][j+1]==omok[i+2][j+2]&&omok[i+2][j+2]==omok[i+3][j+3]&&omok[i+3][j+3]==omok[i+4][j+4]) {
//						if(omok[i][j]==1) {
//							win = 1;
//						}else if(omok[i][j]==2) {
//							win = 2;
//						}
//					}
//				}
//			}
			//�밢�� -����
			for(int i=0; i<6;i++) {
				for(int j=0; j<6; j++) {
					int cntp1 = 0; int cntp2 = 0;
					for(int k=0; k<5;k++) {
						if(omok[i+k][j+k]==1) {
							cntp1+=1;
						}else if(omok[i+k][j+k]==2) {
							cntp2 += 1;
						}else {
							cntp1 = 0; cntp2 = 0;
						}
						
						if(cntp1 == 5) {
							win = 1;
						}else if(cntp2 ==5) {
							win = 2;
						}
					}
				}
			}
			//�밢�� +����
			for(int i=4; i<10;i++) {
				for(int j=0; j<6; j++) {
					if(omok[i][j]==omok[i-1][j+1]&&omok[i-1][j+1]==omok[i-2][j+2]&&omok[i-2][j+2]==omok[i-3][j+3]&&omok[i-3][j+3]==omok[i-4][j+4]) {
						if(omok[i][j]==1) {
							win = 1;
						}else if(omok[i][j]==2) {
							win = 2;
						}
					}
				}
			}

			//3.���а��
			if(win==1) {
				System.out.println("[P1]�¸�");
				break;
			}else if(win==2) {
				System.out.println("[P2]�¸�");
				break;
			}
			
			//3.��������
			if(turn%2==0) {
				System.out.print("[P1]Y��ǥ�Է�:");
				p1Y = scan.nextInt();
				System.out.print("[P1]X��ǥ�Է�:");
				p1X = scan.nextInt();
				
				if(omok[p1Y][p1X]==0) {
					omok[p1Y][p1X] = 1;
				}
				turn += 1;
			}else if(turn%2==1) {
				System.out.print("[P2]Y��ǥ�Է�:");
				p2Y = scan.nextInt();
				System.out.print("[P2]X��ǥ�Է�:");
				p2X = scan.nextInt();
				
				if(omok[p1Y][p1X]==0) {
					omok[p1Y][p1X] = 2;
				}
				turn += 1;
			}
			
		}
		
		
		
		
		
		
	}

}
