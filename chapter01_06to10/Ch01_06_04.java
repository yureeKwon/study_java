package chapter01_06to10;

/*
 * # ����(0)����(1)��(2) ���� [1�ܰ�]
 * 1. com�� ����(1)�� �� �� �ִ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 *  1)����.
 *  2)���� �̰��.
 *  3)���� ����.           �� ����Ѵ�.
 */

import java.util.Scanner;

public class Ch01_06_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int com = 1;

		System.out.println("����(0)����(1)��(2) �Է�.");
		int me = scan.nextInt();

		if (me == com) {
			System.out.println("����.");
		}
		if (me > com) {
			System.out.println("���� �̰��.");
		}
		if (me < com) {
			System.out.println("���� ����.");
		}

	}

}
