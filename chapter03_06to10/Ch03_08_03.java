package chapter03_06to10;

/*
 * # 2�����迭 �⺻����[2�ܰ�]
 */
import java.util.Scanner;

public class Ch03_08_03 {

	public static void main(String[] args) {
		// 13:15 ~ 13:35(20��)

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k = k + 1;
			}
		}
		// ����1) �ε���2���� �Է¹޾� �� ���
		System.out.print("[�Է�] �ε���1 : ");
		int idx1 = scan.nextInt();
		System.out.print("[�Է�] �ε���2 : ");
		int idx2 = scan.nextInt();

		System.out.println("[�� ���] : " + arr[idx1][idx2]);

		// ����2) ���� �Է¹޾� �ε��� 2�� ���
		System.out.print("[�Է�] �� : ");
		int data = scan.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == data) {
					System.out.println("[�ε���1 ���] : " + i);
					System.out.println("[�ε���2 ���] : " + j);
				}
			}
		}

		// ����3) ���� ū ���� �ε��� 2�� ���
		int maxnum = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (maxnum < arr[i][j]) {
					maxnum = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("[�ִ밪 �ε���1 ���] : " + idx1);
		System.out.println("[�ִ밪 �ε���2 ���] : " + idx2);

		// ����4) �� 2���� �Է¹޾� �� ��ü
		System.out.print("[�Է�] ��1 : ");
		int data1 = scan.nextInt();
		System.out.print("[�Է�] ��2 : ");
		int data2 = scan.nextInt();

		int idx3 = 0;
		int idx4 = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == data1) {
					idx1 = i;
					idx2 = j;
				} else if (arr[i][j] == data2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}

		int temp = arr[idx1][idx2];
		arr[idx1][idx2] = arr[idx3][idx4];
		arr[idx3][idx4] = temp;

		System.out.println("�ٲ� arr[][]��� : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();

	}

}
