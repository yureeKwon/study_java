package chapter01_06to10;
/*
 * # Up&Down ����[1�ܰ�]
 * 1. com�� 8�̴�.
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 *  1) me < com  : UP!
 *  2) me == com : Bingo!   
 *  3) me > com  : Down! 
 */

import java.util.Scanner;

public class Ch01_06_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int com = 8;

		System.out.println("���ڸ� �Է��ϼ���");
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
