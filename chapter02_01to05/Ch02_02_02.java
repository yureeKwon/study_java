package chapter02_01to05;

/*
 * # �л��������� ���α׷�[2�ܰ�] : �л��˻�
 */
import java.util.Scanner;

public class Ch02_02_02 {

	public static void main(String[] args) {
		// 12:37 ~ 12:44 (7��)
		Scanner scan = new Scanner(System.in);

		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��

		System.out.println("�ε����Է�");
		int idx = scan.nextInt();
		System.out.println(arr[idx]);

		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) �����Է� : 11 �ε��� : 1

		System.out.println("�����Է�");
		int i = 0;
		int score = scan.nextInt();
		for (i = 0; i < 5; i++) {
			if (arr[i] == score) {
				System.out.println(i);
			}
		}

		// =======================================

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��

		System.out.println("�й��Է�");
		int num = scan.nextInt();
		for (i = 0; i < 5; i++) {
			if (num == hakbuns[i]) {
				System.out.println(scores[i]);
			}
		}

	}

}
