package chapter03_06to10;
/*
 * # 2�����迭 �⺻����[1�ܰ�] 
 */

public class Ch03_08_02 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1; // arr[][]�迭�� ����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k = k + 1;
			}
		}

		for (int i = 0; i < 3; i++) { // arr[][]�迭�� ���
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// ����1) ��ü �� ���
		int tot = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("���� : " + tot);

		// ����2) 4�� ����� ���
		System.out.print("4�� ��� : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(+arr[i][j] + " ");
				}
			}
		}
		System.out.println();

		// ����3) 4�� ����� �� ���

		int tot4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					tot4 += arr[i][j];
				}
			}
		}
		System.out.println("4�� ��� ���� : " + tot4);

		// ����4) 4�� ����� ���� ���
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt = cnt + 1;
				}
			}
		}
		System.out.print("4�� ����� ���� : " + cnt);

	}

}
