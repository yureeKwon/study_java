package chapter01_11to15;

import java.util.Scanner;

public class Ch01_12_04 {

	public static void main(String[] args) {
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		int cash = 20000; // �Աݽ� ����, ��ݽ� ����
		int balance = 30000; // �Աݽ� ����, ��ݽ� ����
		int account = 11111; // �α��ν� ���
		int password = 1234; // �α��ν� ���

		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("���¿� ��й�ȣ�� �Է��ϼ���");
			int acc = scan.nextInt();
			int pw = scan.nextInt();

			if (acc == account && pw == password) {
				System.out.println("1.�Ա� 2.��� 3.�ܾ���ȸ");
				select = scan.nextInt();

				if (select == 1) {
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
					int deposit = scan.nextInt();
					cash = cash - deposit;
					balance = balance + deposit;
				} else if (select == 2) {
					System.out.println("����� �ݾ��� �Է��ϼ���");
					int withdrawl = scan.nextInt();
					cash = cash + withdrawl;
					balance = balance - withdrawl;
				} else if (select == 3) {
					System.out.println("�ܾ� :" + balance + "��");
				}

				System.out.println("�����ܾ� = " + balance + "��");
				System.out.println("���� = " + cash + "��");

			} else {
				System.out.println("���¿� ��й�ȣ�� Ȯ�����ּ���");
			}

		} else {
			System.out.println("����");
		}

	}

}
