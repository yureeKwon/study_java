package chapter01_16to20;
/*
 * # �ݺ��� ����(-100)
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */

import java.util.Scanner;

public class Ch01_16_02 {

	public static void main(String[] args) {
		// 18:23 ~ 18 : 30 (7��)

		Scanner scan = new Scanner(System.in);

		int run = 1;
		while (run == 1) {
			System.out.println("�����Է�[EXIT:-100] : ");
			int num = scan.nextInt();

			if (num == -100) {
				System.out.println("���α׷� ����");
				run = 0;
			}
		}

		// run~~~~~~

	}

}
