package chapter01_11to15;
/*
 * # ����ö ��� ���
 * 1.�̿��� ������ ���� �Է¹޴´�.
 * 2.������ ���� ������ ���� ���� ����� ����ȴ�.
 * 3.���ǥ
 *  1) 1~5 : 500��
 *  2) 6~10 : 600��
 *  3) 11,12 : 650��
 *  4) 13,14 : 700��
 *  5) 15,16 : 750��
 *     ...
 */

import java.util.Scanner;

public class Ch01_13_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� �Է� : ");
		int sta = scan.nextInt();
		int fee = 0;
		
		if(1<=sta&&sta<=5) {
			fee = 500;
		}else if(6<=sta&&sta<=10) {
			fee = 650;
		}else if(10<sta&&sta%2==1) {
			fee = 650+(sta-10)/2*50;
		}else if(10<sta&&sta%2==0) {
			fee = 600+(sta-10)/2*50;
		}
		
		System.out.println("��� :"+fee+"��");
		
	}
}
