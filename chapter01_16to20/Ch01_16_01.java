package chapter01_16to20;
/*
 * # ������ ���[2�ܰ�]
 * 1. 5�� �ֹ��� �޴´�.
 * 2. �ֹ��� ���� ��, ���� �Է� �޴´�.
 * 3. �� �޴��� �ֹ������� �� �ݾ��� ����Ѵ�.
 * 
 * ��) 
 * �޴����� : 1
 * �޴����� : 1
 * �޴����� : 2
 * �޴����� : 2
 * �޴����� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� = 32000��
 * 
 * ===�Ե����� ������===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��          �� : 1��
 * 4. ��    ��   �� : 31300��
 * 5. ��          �� : 700��
 */

import java.util.Scanner;

public class Ch01_16_01 {

	public static void main(String[] args) {
		// 18:04 ~ 18:14 (10��)

		Scanner scan = new Scanner(System.in);

		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;

		int i = 1;
		while (i <= 5) {
			System.out.println("�ֹ��� �Է��ϼ���");
			int select = scan.nextInt();
			if (select == 1) {
				menu1 = menu1 + 1;
			} else if (select == 2) {
				menu2 = menu2 + 1;
			} else if (select == 3) {
				menu3 = menu3 + 1;
			}
			i = i + 1;
		}

		int tot = menu1 * 8700 + menu2 * 6200 + menu3 * 1500;
		System.out.println("�ѱݾ� :" + tot + "��");
		System.out.println("������ �Է��ϼ���");
		int cash = scan.nextInt();

		if (tot <= cash) {
			System.out.println("===== �Ե����� ������ =====");
			System.out.println("1. �Ұ�� ����: " + menu1 + "��");
			System.out.println("3. �� ��  �� ��: " + menu2 + "��");
			System.out.println("3. ��         ��: " + menu3 + "��");
			System.out.println("4. ��   ��   ��: " + tot + "��");
			System.out.println("5. ��         ��: " + (cash - tot) + "��");

		} else {
			System.out.println("������ �����մϴ�");
		}

	}

}
