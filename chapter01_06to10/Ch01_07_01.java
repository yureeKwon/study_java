package chapter01_06to10;

/*
 * # �α���[1�ܰ�]
 * 1. ID�� PW�� �Է� �޴´�. 
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

import java.util.Scanner;

public class Ch01_07_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbID = 1234;
		int dbPW = 1111;

		System.out.println("ID�Է�");
		int meID = scan.nextInt();
		System.out.println("PW�Է�");
		int mePW = scan.nextInt();

		if (dbID == meID && dbPW == mePW) {
			System.out.println("�α��� ����");
		}
		if (dbID != meID || dbPW != mePW) {
			System.out.println("�α��� ����");
		}

	}

}
