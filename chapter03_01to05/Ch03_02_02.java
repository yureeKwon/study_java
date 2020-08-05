package chapter03_01to05;
/*
 * # EXIT 게임
 * 1. game 배열에서 exit변수와 값이 같은 위치를 입력한다.
 * 2. 정답을 맞추면 exit변수는 1 증가한다.
 * 3. exit 변수의 값이 16이 되면 게임은 종료된다.
 */

import java.util.Scanner;

public class Ch03_02_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int exit = 10;

		int[] game = { 11, 15, 10, 14, 12, 13 };

		while(true) {
			for(int i=0; i<game.length; i++) {
				System.out.print(game[i]+" ");
			}System.out.println();
			
			System.out.println(exit+"위치입력:");
			int idx = scan.nextInt();
			
			if(game[idx]==exit) {
				exit += 1;
			}
			if(exit==16) {
				System.out.println("종료");
				break;
			}
		}
		
	}

}
