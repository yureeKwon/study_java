package chapter01_01to05;

import java.util.Scanner;

public class Ch01_05_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ����1) ���� 2���� �Է¹޾�, �� ���
		System.out.println("����1 �Է� : ");
		int x = scan.nextInt();
		System.out.println("����2 �Է� : ");
		int y = scan.nextInt();

		int tot = x + y;
		System.out.println("�� = " + tot);

		// ����2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("���� �Է� : ");
		int z = scan.nextInt();
		System.out.println(z % 2 == 1);

		// ����3) ������ �Է¹޾�, 60�� ���̻��̰� 100�� �����̸� true ���
		System.out.println("���� �Է� : ");
		int ���� = scan.nextInt();
		System.out.println(���� >= 60 && ���� <= 100);

	}

}
