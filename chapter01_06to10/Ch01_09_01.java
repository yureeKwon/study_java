package chapter01_06to10;
/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�. 
 * 
 */

import java.util.Scanner;

public class Ch01_09_01 {

	public static void main(String[] args) {
		// 12:13 ~ 12:28

		Scanner scan = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("===== �Ե����� =====");
		System.out.println("1.�Ұ����� : " + price1 + "��");
		System.out.println("2.����   ���� : " + price2 + "��");
		System.out.println("3.��        �� : " + price3 + "��");

		System.out.println("�ֹ��ϰ��� �ϴ� �޴�(��ȣ)�� �Է��ϼ���");
		int menu = scan.nextInt();

		int charge = 0;
		if(menu==1) {charge = 8700;}
		else if(menu==2) {charge=6200;}
		else if(menu==3) {charge=1500;}
		
		System.out.println("������ �Է��ϼ���");
		int money = scan.nextInt();

		int change = money-charge;
		
		if(change>=0) {
			System.out.println("�ܾ� : "+change+"��");
		}else {
			System.out.println("�ܾ��� ����");
		}
		
	}

}
