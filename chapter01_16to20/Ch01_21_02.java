package chapter01_16to20;
/*
 * # ������� 
 * 1. break
 *  �ݺ��� 1���� ��� ����
 * 2. continue
 *  �ݺ����� ���ǽ�����  �ٷ� �̵�
 *  �Ʒ����� �����Ű�� ���� ���� �� ���
 */

import java.util.Scanner;

public class Ch01_21_02 {

	public static void main(String[] args) {
		
		// break
		for (int i = 0; i < 15; i++) {
			if (i > 3) { // i = 3 ������ �ݺ����� ����
				break;
			}
			System.out.println(i); // i = 0, 1, 2, 3
		}

		// =========================================

		// continue
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				continue;
			}

			if (sel == 1) {
			} else if (sel == 2) {
			} else if (sel == 3) {
			}

		}

	}

}
