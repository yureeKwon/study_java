package chapter02_01to05;
/*
 * # �迭 �⺻����
 */

public class Ch02_01_03 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// ����1) 10���� 50���� arr�迭�� ����
		System.out.println(">>>����1");
		int i = 0;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

		// ����2) 4�� ����� ���
		System.out.println(">>>����2");
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}

		// ����3) 4�� ����� �� ���
		System.out.println(">>>����3");
		int tot = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				tot = tot + arr[i];
			}
		}
		System.out.println(tot);

		// ����4) 4�� ����� ���� ���
		System.out.println(">>>����4");
		int cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

		// ����5) ¦���� ���� ���
		System.out.println(">>>����5");
		cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

	}

}
