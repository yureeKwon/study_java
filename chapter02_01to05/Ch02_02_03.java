package chapter02_01to05;
/*
 * # �л��������� ���α׷�[3�ܰ�] : ����ó�� 
 */

import java.util.Scanner;

public class Ch02_02_03 {

	public static void main(String[] args) {
		// 12:45 ~ 12:54(9��)

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����) �й��� �Է¹޾� ���� ���
		// ��, ���� �й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.

		Scanner scan = new Scanner(System.in);
		System.out.println("�й��Է�");
		int num = scan.nextInt();
		int check = 0;
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == num) {
				check = 1;
				score = scores[i];
			} else {
				check = 0;
			}
		}

		// -------------------------------------

		if (check == 1) {
			System.out.println("����:" + score + "��");
		} else if (check == 0) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�");
		}

	}

}
