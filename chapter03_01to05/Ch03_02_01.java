package chapter03_01to05;

/*
 * 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3.단 좌우 끝에 도달했을때 예외처리를 해야한다.
 * 4. 숫자1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단 숫자3을 입력하면 벽을 격파할 수 있다.
 *  
 */
import java.util.Scanner;

public class Ch03_02_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };

		int player = 0;

		
		
		boolean run = true;
		while(run) {
			//1.출력
			for(int i=0; i<game.length; i++) {
				if(game[i]==2) {
					player = i;
					System.out.print("[옷]");
				}else if(game[i]==1) {
					System.out.print("[벽]");
				}else {
					System.out.print("[ ]");
				}
			}System.out.println();
			//2.게임진행
			System.out.print("방향입력:");
			int move = scan.nextInt();
			
			if(move==1) {
				if(player==0) {
					System.out.println("더이상이동불가");
					continue;
				}else if(game[player-1]==1) {
					System.out.println("[격파]3입력");
					int punch = scan.nextInt();
					if(punch==3) {
						game[player]=0;
						player -= 1;
						game[player]=2;
					}
				}else {
					game[player]=0;
					player -= 1;
					game[player] = 2;
				}
				
			}else if(move==2) {
				if(player==8) {
					System.out.println("더이상이동불가");
					continue;
				}else if(game[player+1]==1) {
					System.out.println("[격파]3입력");
					int punch = scan.nextInt();
					if(punch==3) {
						game[player]=0;
						player += 1;
						game[player]=2;
					}
				}else {
					game[player]=0;
					player += 1;
					game[player] = 2;
				}
				
			}
		}
		
	}

}
