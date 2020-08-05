package chapter03_06to10;
/*
 * # ������
 */
import java.util.Scanner;

public class Ch03_09_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] apt = { { 101, 102, 103 }, 
						{ 201, 202, 203 }, 
						{ 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, 
						{ 4100, 2000, 1000 },
						{ 3000, 1600, 800 } };

		// ����1) ������ ������ �� ��� (���� : 4400, 7100, 5400)
		int[] floor = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				floor[i] += pay[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "�� ������ �� : " + floor[i]);
		}

		// ����2) ȣ�� �Է��ϸ� ������ ��� (�Է� : 202ȣ, ������ : 2000��)
		System.out.print("ȣ �Է� : ");
		int ho = scan.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho) {
					System.out.println("������ : " + pay[i][j] + "��");
				}
			}
		}

		// ����3) ������ ���� ���� ���� ��, ���� ���� �� ��� (����: 201ȣ, 303ȣ)
		int maxpay = pay[0][0];
		int maxidx1 = 0;
		int maxidx2 = 0;
		int minpay = pay[0][0];
		int minidx1 = 0;
		int minidx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pay[i][j] > maxpay) {
					maxpay = pay[i][j];
					maxidx1 = i;
					maxidx2 = j;
				} else if (pay[i][j] < minpay) {
					minpay = pay[i][j];
					minidx1 = i;
					minidx2 = j;
				}
			}
		}
		System.out.println("���� ���� ���� �� : " + apt[maxidx1][maxidx2] + "ȣ");
		System.out.println("���� ���� ���� �� : " + apt[minidx1][minidx2] + "ȣ");

		// ����4) ȣ 2���� �Է��ϸ� ������ ��ü
		System.out.print("ȣ1 �Է� : ");
		int ho1 = scan.nextInt();
		System.out.print("ȣ2 �Է� : ");
		int ho2 = scan.nextInt();

		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		int idx4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho1) {
					idx1 = i;
					idx2 = j;
				} else if (apt[i][j] == ho2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		int temp = pay[idx1][idx2];
		pay[idx1][idx2] = pay[idx3][idx4];
		pay[idx3][idx4] = temp;

		// ���
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
