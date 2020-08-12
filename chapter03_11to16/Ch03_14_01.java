package chapter03_11to16;
/*
 * # 오목게임
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
			//1.게임판출력
			System.out.println("게임판출력");
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(omok[i][j]+" ");
				}
				System.out.println();
			}
			
			//2.오목판정
			//가로
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
			//세로
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
//			//대각선 -기울기 --> 이렇게도 체크할수 있지만 아래처럼 삼중for문으로 더 깔끔하게 하면
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
			//대각선 -기울기
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
			//대각선 +기울기
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

			//3.승패결과
			if(win==1) {
				System.out.println("[P1]승리");
				break;
			}else if(win==2) {
				System.out.println("[P2]승리");
				break;
			}
			
			//3.게임진행
			if(turn%2==0) {
				System.out.print("[P1]Y좌표입력:");
				p1Y = scan.nextInt();
				System.out.print("[P1]X좌표입력:");
				p1X = scan.nextInt();
				
				if(omok[p1Y][p1X]==0) {
					omok[p1Y][p1X] = 1;
				}
				turn += 1;
			}else if(turn%2==1) {
				System.out.print("[P2]Y좌표입력:");
				p2Y = scan.nextInt();
				System.out.print("[P2]X좌표입력:");
				p2X = scan.nextInt();
				
				if(omok[p1Y][p1X]==0) {
					omok[p1Y][p1X] = 2;
				}
				turn += 1;
			}
			
		}
		
		
		
		
		
		
	}

}
