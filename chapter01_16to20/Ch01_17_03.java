package chapter01_16to20;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * �α��� �� ��α��� �Ұ�
 * �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * �α��� �� �̿밡��
 * 3. �Ա�
 * �α��� �� �̿밡��
 * 4. ���
 * �α��� �� �̿밡��
 * 5. ��ü
 * �α��� �� �̿밡��
 * 6. ��ȸ
 * �α��� �� �̿밡��
 * 0. ����
 */

public class Ch01_17_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;

		while (run) {
			System.out.println("�޴�����");
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("���¹�ȣ�Է�");
					int id = scan.nextInt();
					System.out.println("����Է�");
					int pw = scan.nextInt();
					if (id == dbAcc1 && pw == dbPw1) {
						System.out.println("1��, ȯ���մϴ�");
						log = 1;
					} else if (id == dbAcc2 && pw == dbPw2) {
						System.out.println("2��, ȯ���մϴ�");
						log = 2;
					} else {
						System.out.println("���̵�� ��й�ȣ �ٽ� Ȯ��");
					}
				} else if (log == 1 || log == 2) {
					System.out.println("�α��� �� ��α��� �Ұ�");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else if (log == 1 || log == 2) {
					System.out.println("�α׾ƿ� �Ϸ�");
				}

			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else if (log == 1) {
					System.out.println("�Ա��� �ݾ��Է�");
					int deposit = scan.nextInt();
					dbMoney1 = dbMoney1 + deposit;
					System.out.println("�Ա��� �ܾ�:" + dbMoney1 + "��");
				} else if (log == 2) {
					System.out.println("�Ա��� �ݾ��Է�");
					int deposit = scan.nextInt();
					dbMoney2 = dbMoney2 + deposit;
					System.out.println("�Ա��� �ܾ�:" + dbMoney2 + "��");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else if (log == 1) {
					System.out.println("����� �ݾ��Է�");
					int withdrawl = scan.nextInt();
					if (withdrawl > dbMoney1) {
						System.out.println("�ܾ��� �����մϴ�");
					} else {
						dbMoney1 = dbMoney1 - withdrawl;
						System.out.println("����� �ܾ�:" + dbMoney1 + "��");
					}
				} else if (log == 2) {
					System.out.println("����� �ݾ��Է�");
					int withdrawl = scan.nextInt();
					if (withdrawl > dbMoney2) {
						System.out.println("�ܾ��� �����մϴ�");
					} else {
						dbMoney2 = dbMoney2 - withdrawl;
						System.out.println("����� �ܾ�:" + dbMoney2 + "��");
					}
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else if (log == 1) {
					System.out.println("��ü�� �����Է�");
					int transacc = scan.nextInt();
					if (transacc == dbAcc2) {
						System.out.println("��ü�� �ݾ��Է�");
						int transmoney = scan.nextInt();
						if (transmoney > dbMoney1) {
							System.out.println("�ܾ��� �����մϴ�");
						} else {
							System.out.println("��ü����");
							dbMoney1 = dbMoney1 - transmoney;
							System.out.println("��ü �� �ܾ�:" + dbMoney1 + "��");
						}
					} else {
						System.out.println("���¹�ȣ �ٽ� Ȯ��");
					}
				} else if (log == 2) {
					System.out.println("��ü�� �����Է�");
					int transacc = scan.nextInt();
					if (transacc == dbAcc1) {
						System.out.println("��ü�� �ݾ��Է�");
						int transmoney = scan.nextInt();
						if (transmoney > dbMoney2) {
							System.out.println("�ܾ��� �����մϴ�");
						} else {
							System.out.println("��ü����");
							dbMoney2 = dbMoney2 - transmoney;
							System.out.println("��ü �� �ܾ�:" + dbMoney2 + "��");
						}
					} else {
						System.out.println("���¹�ȣ �ٽ� Ȯ��");
					}
				}

			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else if (log == 1) {
					System.out.println("�����ܾ�" + dbMoney1 + "��");
				} else if (log == 2) {
					System.out.println("�����ܾ�" + dbMoney2 + "��");
				}

			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				run = false;
			}
		}

		
	}
}
