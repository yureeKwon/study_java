package chapter01_06to10;

/*
 * # �α���[3�ܰ�]
 * 1. ID�� �Է¹޾� dbID�� ��ġ�� ��쿡�� PW�� �Է��� �� �ִ�.
 * 2. ID�� Ʋ�� ��� "ID�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 3. PW�� Ʋ�� ��� "PW�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 4. ID�� PW�� ��� ��ġ�ϴ� ���, "�α��� �����̶�� �޼����� ����Ѵ�."
 *
 */

import java.util.Scanner;

public class Ch01_08_03 {

	public static void main(String[] args) {
		// 14:22 ~ 14:30 (8��)

		Scanner scan = new Scanner(System.in);

		int dbID = 1234;
		int dbPW = 1111;

		System.out.println("ID�� �Է��ϼ��� : ");

		int meID = scan.nextInt();

		if (meID == dbID) {
			System.out.println("PW�� �Է��ϼ��� : ");
			int mePW = scan.nextInt();
			if (mePW == dbPW) {
				System.out.println("�α��� ����");
			}
			if (mePW != dbPW) {
				System.out.println("PW�� Ȯ���ϼ���");
			}
		}else {
			System.out.println("ID�� Ȯ���ϼ���");
		}

	}

}
