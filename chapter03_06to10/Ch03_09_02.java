package chapter03_06to10;

import java.util.Scanner;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 */
public class Ch03_09_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ladder[][] = {
				{0, 0, 0, 0, 0},
				{1, 1, 0, 1, 1}, 
				{0, 1, 1, 0, 0},
				{0, 0, 1, 1, 0}, 
				{1, 1, 0, 0, 0}, 
				{0, 1, 1, 0, 0}, 
				{1, 1, 0, 0, 0}, 
				{0, 0, 0, 1, 1}, 
				{0, 0, 0, 0, 0}
		};
		
		
		
		//1.사다리출력
		System.out.println("  === 사다리 ===");
		for(int i=0; i<ladder.length; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				if(ladder[i][j]==0) {
					System.out.print("ㅣ");
				}else if(ladder[i][j]==1) {
					if(j!=0&&ladder[i][j-1]==1) {
						System.out.print("ㅓ");
					}
					else if(j!=ladder[i].length-1&&ladder[i][j+1]==1) {
						System.out.print("ㅏ");
					}
				}
			}
			System.out.println();
		}
		
		//2.시작위치고르기
		int y = 0;//시작점([i][j]의 x)
		int x = 0;//시작점([i][j]의 j)
		System.out.print("0~4입력:");
		x = scan.nextInt();
		
		for(int i=0; i<ladder.length; i++) {
			if(ladder[y][x]==0) {
				y += 1; // 한줄아래로
			}else if(ladder[y][x]==1) {
				if(x!=0&&ladder[y][x-1]==1) {
					x -= 1;
				}
				else if(x!=ladder[i].length-1&&ladder[y][x+1]==1) {
					x += 1;
				}
				y += 1;
			}
		}
		System.out.println("사다리결과");
		System.out.println("마지막"+y+"번째 줄의");
		System.out.println(x+"번");
		
	}

}
