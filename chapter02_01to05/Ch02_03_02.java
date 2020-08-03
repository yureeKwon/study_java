package chapter02_01to05;
/*
 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

public class Ch02_03_02 {

	public static void main(String[] args) {

		// 13:28 ~ 13:48 (20��)

		Scanner scan = new Scanner(System.in);

		int[] seat = new int[7];
		int cnt = 0;

		System.out.println("�ް���ȭ��");
		boolean run = true;
		while (run) {
			System.out.print("�¼���Ȳ : ");
			for(int i=0; i<seat.length; i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println();
			System.out.println("1.�¼�����");
			System.out.println("2.����");

			System.out.println("�޴�����");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.print("�¼�����(0~6) : ");
				int select = scan.nextInt();

				if (seat[select] == 1) {
					System.out.println("�̹� ���ŵ� �ڸ�");
				}else if (seat[select] == 0) {
					seat[select] = 1;
					cnt = cnt + 1;
				}
				System.out.println("�ݾ�:" + (cnt * 12000) + "��");
			}else if (choice == 2) {
				System.out.println("�ݾ�:" + (cnt * 12000) + "��");
				System.out.println("���α׷� ����");
				run = false;
			}

		}

	}
}
