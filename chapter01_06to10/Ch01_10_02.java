package chapter01_06to10;

import java.util.Random;
import java.util.Scanner;
/*
 * # ���ΰ���
 * 1. 0 �Ǵ� 1�� �������ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 * 
 */

public class Ch01_10_02 {

	public static void main(String[] args) {
		// 13:00 ~ 13:07 (7��)

		Scanner scan = new Scanner(System.in);

		System.out.println("���� �ո�(0), �޸�(1) �Է��ϼ���");
		int me = scan.nextInt();

		Random ran = new Random();

		int coin = ran.nextInt(2);

		if (me == coin) {
			System.out.println("����");
		}
		if (me != coin) {
			System.out.println("��");
		}

	}

}
