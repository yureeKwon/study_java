package chapter01_16to20;
/*
 * # �ݺ��� for
 * 1. �ݺ����� ���� 3����
 *  1)�ʱ��
 *  2)���ǽ�
 *  3)������
 * 2. for���� ����
 * for(�ʱ��;���ǽ�;������){
 *                     ���ǽ��� ���� ���� ������ ����;
 * }
 * 3. for���� �������                    
 * �ʱ�� -> ���ǽ� -> ���๮ -> ������ -> ���ǽ� -> ���๮ -> ������ ...
 */

public class Ch01_21_01 {

	public static void main(String[] args) {
		// 1~5���� ���
		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x = x + 1;
		}
		System.out.println();

		for (int y = 1; y <= 5; y = y + 1) {
			System.out.println(y);
		}

		int i = 1;

		// ����1) 1���� 5���� ���
		for (i = 1; i <= 5; i = i + 1) {
			System.out.println(i);
		}
		// ����2) 1���� 10���� �ݺ���, 5~9���� ���
		for (i = 1; i <= 10; i = i + 1) {
			if (i >= 5 && i <= 9) {
				System.out.println(i);
			}
		}

		// ����3) 1���� 10���� �ݺ���, 6~3���� ���
		for (i = 10; i >= 1; i = i - 1) {
			if (i >= 7) {
				System.out.println(i - 4);
			}
		}

		// ����4) 1���� 10���� �ݺ���, 3�̸� 7�̻� ���
		for (i = 1; i <= 10; i = i + 1) {
			if (i < 3 || i >= 7) {
				System.out.println(i);
			}
		}

	}

}
