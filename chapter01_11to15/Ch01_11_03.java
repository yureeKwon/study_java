package chapter01_11to15;
/*
 * #����(0)����(1)��(2) ����[2�ܰ�]
 * 1.com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
 * 2.me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3.com�� me�� ����,
 *  1)����.
 *  2)���� �̰��.
 *  3)���� ����. �� ����Ѵ�.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_11_03 {

	public static void main(String[] args) {
		// 13:50 ~ 14:00(10��)

		Random ran = new Random();
		int com = ran.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(0~2)");
		int me = scan.nextInt();

		if (com == me) {
			System.out.println("����");
		}
		if (com == 0) {
			if (me == 1) {
				System.out.println("���� �̰��");
			}
			if (me == 2) {
				System.out.println("���� ����");
			}
		}
		if (com == 1) {
			if (me == 2) {
				System.out.println("���� �̰��");
			}
			if (me == 0) {
				System.out.println("���� ����");
			}
		}
		if (com == 2) {
			if (me == 0) {
				System.out.println("���� �̰��");
			}
			if (me == 1) {
				System.out.println("���� ����");
			}
		}

	}

}
