package chapter01_06to10;
/*
 * #�α���[2�ܰ�]
 * 1. ID�� PW�� �Է¹޾� ȸ�������� �����Ѵ�.
 * 2. ���� �α����� ���� �ٽ� ID�� PW�� �Է¹޴´�.
 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

import java.util.Scanner;

public class Ch01_07_03 {

	public static void main(String[] args) {
		// 13:42 ~ 13:50 (8��)

		Scanner scan = new Scanner(System.in);

		// ���� ���������� ID, PW
		// int dbID = 0;
		// int dbPW = 0;

		System.out.println("ȸ������");
		System.out.println("ID�Է�");
		int meID = scan.nextInt();
		System.out.println("PW�Է�");
		int mePW = scan.nextInt();
		System.out.println("ȸ������ �Ϸ�");

		System.out.println("�α���");
		System.out.println("ID�Է�");
		int meID2 = scan.nextInt();
		System.out.println("PW�Է�");
		int mePW2 = scan.nextInt();

		if (meID == meID2 && mePW == mePW2) {
			System.out.println("�α��� ����");
		}else{
			System.out.println("�α��� ����");
		}

	}

}
