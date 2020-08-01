package chapter01_06to10;
/*
 * # Up&Down 게임[1단계]
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 *  1) me < com  : UP!
 *  2) me == com : Bingo!   
 *  3) me > com  : Down! 
 */

import java.util.Scanner;

public class Ch01_06_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int com = 8;

		System.out.println("숫자를 입력하세요");
		int me = scan.nextInt();

		if (me < com) {
			System.out.println("UP!");
		}
		if (me == com) {
			System.out.println("Bingo!");
		}
		if (me > com) {
			System.out.println("Down!");
		}

	}

}
