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

public class Ch01_06_05 {

	public static void main(String[] args) {
		int com = 1;
		System.out.println("�����Է�0~2");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();

		if (com == me) {
			System.out.println("����");
		} else if (com < me) {
			System.out.println("���� �̰��");
		} else {
			System.out.println("���� ����");
		}

	}

}
