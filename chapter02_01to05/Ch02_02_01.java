package chapter02_01to05;
/*
 * # �л��������� ���α׷�[1�ܰ�] : �л�����
 */

import java.util.Scanner;
import java.util.Random;

public class Ch02_02_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) arr �迭�� 1~100�� ������ ������ 5�� ����

		Random ran = new Random();

		System.out.println(">>>����1");
		System.out.println("�������");

		int i = 0;
		for (i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.println(arr[i]);
		}
		System.out.println("������¿Ϸ�");

		// ����2) �������� ������ ��� ���
		System.out.println(">>>����2");
		int tot = 0;
		double avg = 0.0;
		for (i = 0; i < 5; i++) {
			tot = tot + arr[i];
		}
		avg = tot / 5;
		System.out.println("����:" + tot + "��");
		System.out.println("���:" + avg + "��");

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		System.out.println("����3");
		int cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] >= 60) {
				cnt = cnt + 1;
			}
		}
		System.out.println("�հݻ� ��:" + cnt + "��");

	}

}
