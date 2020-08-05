package chapter03_01to05;

/*
 * # ATM[4�ܰ�] : ��ü ��ɱ���
 * 1. ȸ������
 * id�� pw�� �Է¹޾� ����
 * ���� �� �� 1000�� �ο�
 * id �ߺ�üũ
 * 2. ȸ��Ż��
 * �α��νÿ��� �̿밡��
 * 3. �α���
 * id�� pw�� �Է¹޾� �α���
 * �α׾ƿ� ���¿����� �̿밡��
 * 4. �α׾ƿ�
 * �α��� �ÿ��� �̿밡��
 * 5. �Ա�
 * �α��νÿ��� �̿밡��
 * 6. ��ü
 * �α��� �ÿ��� �̿밡��
 * 7. �ܾ���ȸ
 * �α��� �ÿ��� �̿밡��
 * 0. ����
 */
import java.util.Scanner;

public class Ch03_05_01 {

	public static void main(String[] args) {
		// 14:27 ~

		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int cnt = 0;
		int log = -1;

		String menu = "=== �ް� ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";

		while (true) {

			System.out.println("[ȸ�� �� :" + cnt + "��]");
			for (int i = 0; i < cnt; i++) {
				System.out.print(arAcc[i] + ":" + arPw[i] + "(" + arMoney + ")");
			}
			System.out.println("------------------------");
			System.out.print("[������] : ");
			if (log == -1) {
				System.out.println("����");
			} else {
				System.out.println(arAcc[log]);
			}
			System.out.println("------------------------");

			System.out.println(menu);
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("ȸ�������� 5������� ����");
					continue;
				}
				System.out.print("[����]Acc�Է� : ");
				int myAcc = scan.nextInt();

				int check = 1;
				for (int i = 0; i < cnt; i++) {
					if (arAcc[i] == myAcc) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("[����]Acc�� �ߺ�");
				} else {
					System.out.print("[����]pw�Է� : ");
					int myPw = scan.nextInt();
					int myMoney = 0;

					arAcc[cnt] = myAcc;
					arPw[cnt] = myPw;
					arMoney[cnt] = 1000;
					cnt = cnt + 1;
					System.out.println("[����]���ԿϷ�");

				}

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("[Ż��]�α��� �� �̿밡��");
				} else {
					for (int i = log; i < cnt - 1; i++) {
						arAcc[i] = arAcc[i + 1];
						arPw[i] = arPw[i + 1];
					}
					cnt = cnt - 1;
					System.out.println("[Ż��]Ż��Ϸ�");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("[�α���]Acc�Է�");
					int myAcc = scan.nextInt();
					System.out.println("[�α���]Pw�Է�");
					int myPw = scan.nextInt();

					int check = -1;
					for (int i = 0; i < cnt; i++) {
						if (arAcc[i] == myAcc && arPw[i] == myPw) {
							check = i;
						}
					}

					if (check == -1) {
						System.out.println("[�α���]Acc�� Pw �ٽ� Ȯ��");
					} else {
						log = check;
						System.out.println("[�α���]" + arAcc[log] + "�� ȯ���մϴ�");
					}

				} else {
					System.out.println("[�α���]����" + arAcc[log] + "���� �α��� ��");
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else {
					System.out.println("[�α׾ƿ�]�α׾ƿ� �Ϸ�");
					log = -1;
				}

			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("[�Ա�]�α��� �� �̿밡��");
				} else {
					System.out.println("[�Ա�]�Աݱݾ� �Է�");
					int money = scan.nextInt();

					arMoney[log] = arMoney[log] + money;
					System.out.println("[�Ա�]�Ա� �Ϸ�");
				}

			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else {
					System.out.println("[��ü]���¹�ȣ �Է� : ");
					int account = scan.nextInt();

					int check = -1;
					for (int i = 0; i < cnt; i++) {
						if (arAcc[i] == account) {
							check = i;
						}
					}

					if (check == -1) {
						System.out.println("[��ü]���¹�ȣ �ٽ� Ȯ��");
						continue;
					}
					System.out.println("[��ü]��ü�� �ݾ��� �Է� : ");
					int money = scan.nextInt();

					if (arMoney[log] >= money) {
						arMoney[log] = arMoney[log] - money;
						arMoney[check] = arMoney[check] + money;
						System.out.println("[��ü]��ü �Ϸ�");
					} else {
						System.out.println("[��ü]�ܾ��� �����մϴ�");
					}
				}
			} else if (sel == 7) {
				if (log == -1) {
					System.out.println("�α��� �� �̿밡��");
				} else {
					System.out.println("������ �ܾ��� " + arMoney[log] + "�� �Դϴ�");
				}
			} else if (sel == 0) {
				break;
			}

		}

	}

}
