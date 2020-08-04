package chapter02_06to10;
/*
 * # 미니마블
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 * 
 * [p2]1~3 입력 : 1
 * 1 2 3 4 5 6 7 8 
 * 0 1 0 0 0 0 0 0
 * 0 0 0 2 0 0 0 0 
 * [p1]1~3 입력 : 3
 * [p1]이 [p2]를 잡았다!
 * 1 2 3 4 5 6 7 8 
 * 0 0 0 0 1 0 0 0
 * 2 0 0 0 0 0 0 0
 */
import java.util.Scanner;

public class Ch02_08_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1 = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] p2 = {2, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		int win = 0;
		
		int idx1 = 0;
		int idx2 = 0;
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		boolean run = true;
		while(run) {
			//1.출력
			for(int i=0; i<8; i++) {
				System.out.print(game[i]+" ");
			}System.out.println();
			for(int i=0; i<8; i++) {
				System.out.print(p1[i]+" ");
				if(p1[i]==1) {
					idx1 = i;
				}
			}System.out.println();
			for(int i=0; i<8; i++) {
				System.out.print(p2[i]+" ");
				if(p2[i]==2) {
					idx2 = i;
				}
			}System.out.println();
			//2.게임진행
			if(turn%2==0) {
				System.out.print("[p1]입력:");
				int move = scan.nextInt();
				
				p1[idx1] = 0;
				idx1 = idx1+move;
				if(idx1>=7) {
					cnt1+=1; 
				}
				idx1 = idx1%8;
				p1[idx1] = 1;
				
			}else if(turn%2==1) {
				System.out.print("[p2]입력:");
				int move = scan.nextInt();
				
				p2[idx2] = 0;
				idx2 = idx2+move;
				if(idx2>=7) {
					cnt2 += 1;
				}
				idx2 = idx2%8;
				p2[idx2] = 2;
				
			}
			
			//3.룰체크
			if(idx1==idx2&&idx1!=0&&turn%2==0) {
				System.out.println("[p1]이[p2]를 잡았다.");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;
			}
			if(idx1==idx2&&idx2!=0&&turn%2==1) {
				System.out.println("[p2]가[p1]을 잡았다.");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			
			if(cnt1==3) {
				System.out.println("[p1]승리");
				break;
			}else if(cnt2==3) {
				System.out.println("[p2]승리");
				break;
			}
			
			turn += 1;
			
		}
	}
}
