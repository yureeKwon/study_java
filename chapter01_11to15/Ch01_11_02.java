package chapter01_11to15;
/*
 * #������ ����[2�ܰ�]
 * 1.������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
 * 2.����� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��) 3 x 7 = ?
 * 3.������ �ش��ϴ� ������ �Է� �޴´�.
 * 4.������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_11_02 {

	public static void main(String[] args) {

		// 13:37 ~ 13:43 (6��)

		Random ran = new Random();
		int x = ran.nextInt(10) + 1; // ���� ���� ���� ���ϱ�~~
		int y = ran.nextInt(10) + 1;

		System.out.println("���� : " + x + "x" + y + "= ?");

		Scanner scan = new Scanner(System.in);
		int myAns = scan.nextInt(); // �����̸� ���Ҷ� �Է°�, ������ ���� �˾ƺ��� ���� �ϱ�

		if (x * y == myAns) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
