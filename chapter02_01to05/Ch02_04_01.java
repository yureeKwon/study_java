package chapter02_01to05;

/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 * 2. �Ʒ� 3������ ������ ��÷���θ� ����Ѵ�.
 */
import java.util.Scanner;

public class Ch02_04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] lotto1 = { 0, 0, 7, 7, 7, 0, 0, 0 };
		int[] lotto2 = { 7, 0, 7, 7, 0, 0, 0, 0 };
		int[] lotto3 = { 7, 0, 7, 7, 7, 0, 7, 0 };

		boolean run = true;
		while (run) {
			
			int cnt = 0;
			int check = -1;
			
			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");
			System.out.print("�޴�����:");
			int sel = scan.nextInt();

			if (sel == 1) {
				for (int i = 0; i < 8; i++) {
					if (lotto1[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("==��÷==");
				} else {
					System.out.println("==��==");
				}
			} else if (sel == 2) {
				cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto2[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("==��÷==");
				} else {
					System.out.println("==��==");
				}
			} else if (sel == 3) {
				cnt = 0;
				for (int i = 0; i < 8; i++) {
					if (lotto3[i] == 7) {
						cnt += 1;
						if (cnt == 3) {
							check = 1;
						}
					} else {
						cnt = 0;
					}
				}
				if (check == 1) {
					System.out.println("==��÷==");
				} else {
					System.out.println("==��==");
				}
			}

		}

	}

}
