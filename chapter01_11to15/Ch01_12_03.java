package chapter01_11to15;

/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney : ��ü����
 *               myMoney - ��ü�� �ݾ�
 *               yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ� >= myMoney : ��ü�Ұ�             
 */

import java.util.Scanner;

public class Ch01_12_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		int yourMoney = 12000;

		System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
		int transAcc = scan.nextInt();

		if (transAcc == myAcc) {
			System.out.println("��ü�� �ݾ��� �Է��ϼ��� :");
			int transMoney = scan.nextInt();
			if (transMoney <= myMoney) {
				myMoney = myMoney - transMoney;
				yourMoney = yourMoney + transMoney;

				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�");
			} else {
				System.out.println("��ü�� �ܾ��� �����մϴ�");
			}
		} else {
			System.out.println("���¸� Ȯ���ϼ���");
		}

		System.out.println("myMoney :" + myMoney + "��");
		System.out.println("yourMoney :" + yourMoney + "��");

	}

}
