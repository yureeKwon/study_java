package chapter02_01to05;

/*
 * # �� ��ü�ϱ�[2�ܰ�]
 */
import java.util.Scanner;

public class Ch02_05_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		// ����1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��1) �ε���1 �Է� : 1
		// �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		System.out.println("�ε��� �Է�");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		int z = 0;
		z = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = z;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// ����2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��2) ��1�Է� : 40
		// �� 2�Է� : 20
		// {10, 40, 30, 20, 50}

		System.out.println("�� �Է�");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int x = 0;
		int y = 0;
		int z1 = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] == n1) {
				x = i;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] == n2) {
				y = i;
			}
		}
		z1 = arr[x];
		arr[x] = arr[y];
		arr[y] = z1;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
