package chapter01_06to10;
/*
 * #���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1 , no:0)
 * 
 */

import java.util.Scanner;

public class Ch01_08_02 {

	public static void main(String[] args) {
		// 14:09 ~ 14:19 (10��)

		Scanner scan = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ���.");
		int height = scan.nextInt();

		if (height >= 120) {
			System.out.println("���̱ⱸ �̿��� �����մϴ�.");
		} else {
			System.out.println("�θ�԰� �Բ� ���̳���? (yes:1 , no:0)");
			int ans = scan.nextInt();
			if (ans == 1) {
				System.out.println("���̱ⱸ �̿��� �����մϴ�.");
			}
			if (ans == 0) {
				System.out.println("���̱ⱸ �̿��� �Ұ����մϴ�.");
			}
		}

	}

}
