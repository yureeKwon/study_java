package chapter01_11to15;

import java.util.Scanner;
import java.util.Random;

/* 
 * # Ȧ¦����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */

public class Ch01_11_01 {

	public static void main(String[] args) {
		// 13:21 ~ 13:32 (11��)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;
		System.out.println("����[" + rNum + "]");

		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");

		System.out.println("��ȣ�� �����ϼ��� : ");
		int me = scan.nextInt();

		// ������ ���޾� �ΰ� �ٿ���(&& ||) �װ��� ����� �� ����� �ͺ���
		// if�� �ȿ� if�� ����� �� ����

		if (me == 1) {
			if (rNum % 2 == 1) {
				System.out.println("����");
			}
			if (rNum % 2 == 0) {
				System.out.println("��");
			}
		}
		if (me == 2) {
			if (rNum % 2 == 1) {
				System.out.println("��");
			}
			if (rNum % 2 == 0) {
				System.out.println("����");
			}
		}

	}

}
