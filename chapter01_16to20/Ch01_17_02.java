package chapter01_16to20;
/*
 * # ATM[2�ܰ�]
 * 1.�Ա�
 * �Ա��� �ݾ��� �Է¹޾� myMoney�� �Ա�
 * 2.���
 * ����� �ݾ��� �Է¹޾� myMoney���� ���
 * �� ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3.��ü
 * yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü�Ұ�
 * ��ü �� yourMoney �ܾ� ����
 * 4.��ȸ
 * myMoney�� yourMoney �ܾ� ��� ���
 */

import java.util.Scanner;

public class Ch01_17_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("5.����");

			System.out.println("�޴�����");
			int sel = scan.nextInt();

			if(sel==1) {
				System.out.print("�Ա��� �ݾ� �Է� : ");
				int deposit = scan.nextInt();
				myMoney += deposit;
				System.out.println("�ԱݿϷ�");
				System.out.println("myMoney:"+myMoney+"��");
			}else if(sel==2) {
				System.out.print("����� �ݾ� �Է� :");
				int withdrawl = scan.nextInt();
				if(myMoney<withdrawl) {
					System.out.println("�ܾ׺���");
				}else {
					myMoney -= withdrawl;
					System.out.println("��ݿϷ�");
					System.out.println("myMoney:"+myMoney+"��");
				}
			}else if(sel==3) {
				System.out.println("��ü�� ���¹�ȣ �Է� : ");
				int transAcc = scan.nextInt();
				if(transAcc==yourAcc) {
					System.out.println("��ü�� �ݾ� �Է� : ");
					int transMoney = scan.nextInt();
					if(transMoney<=myMoney) {
						yourMoney += transMoney;
						myMoney -= transMoney;
						System.out.println("��ü�Ϸ�");
					}else {
						System.out.println("�ܾ׺���");
					}
				}else {
					System.out.println("���¹�ȣ �ٽ�Ȯ��");
				}
			}else if(sel==4) {
				System.out.println("�ܾ���ȸ");
				System.out.println("myMoney:"+myMoney+"��");
				System.out.println("yourMoney:"+yourMoney+"��");
			}else if(sel==5) {
				System.out.println("����");
				run = false;
			}
			
			
			
		}

	}
}
