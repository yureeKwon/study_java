package chapter01_11to15;
/*
 * # ��� ���� ���߱� ����
 * 1. 150~250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 *  ��)
 * �������� 249, ���� 4
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_12_05 {

	public static void main(String[] args) {

		// 13:43 ~ 13:48 (5��)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(101) + 150;
		System.out.println(rNum);
		System.out.println("������� �Է�");
		int me = scan.nextInt();

		int ans = (rNum / 10) % 10; // ������� ����

		if (me == ans) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
