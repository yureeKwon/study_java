package chapter02_06to10;
/*
 * #숫자이동[1단계]
 * 1.숫자2는 캐릭터이다.
 * 2.숫자1을 입력하면, 캐릭터가왼쪽으로
 *   숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3.단, 좌우끝에 도달했을 때, 예외처리를 해야한다.
 */
import java.util.Scanner;

public class Ch02_06_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;

		boolean run = true;
		while(run) {
			
			for(int i=0; i<game.length; i++) {
				System.out.print(game[i]+" ");
				if(game[i]==2) {
					player = i;
				}
			}
			System.out.println();
			System.out.print("방향입력(1or2):");
			int dir = scan.nextInt();
			
			if(dir==1) {
				if(player==0) {
					System.out.println("더이상 이동불가");
					continue;
				}else {
					game[player]=0;
					game[player-1]=2;
				}
			}else if(dir==2){
				if(player==6) {
					System.out.println("더이상 이동불가");
					continue;
				}else {
					game[player]=0;
					game[player+1]=2;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
