package chapter02_01to05;
/*
 * # 4�� ����� ����
 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
 */

public class Ch02_05_03 {

	public static void main(String[] args) {
		int[] arr = { 44, 11, 29, 24, 76 };

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}

		}
		int[] temp = new int[cnt];

		int j = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i]; // temp[j]=arr[i]�� �ǰ�
				j = j + 1; // j = j + 1; ���� j�� j+1�� �ǰ�..
			}
		}

		for (int i = 0; i < cnt; i++) { // **** i < cnt ****
			System.out.print(temp[i] + " "); // temp ��� ���
		}

		System.out.println();

	}

}
