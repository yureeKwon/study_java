package chapter01_11to15;

//# �ݺ��� �⺻����[2�ܰ�]
public class Ch01_15_02 {

	public static void main(String[] args) {

		// ����1) 1~5������ �� ���
		// ����1) 15
		int tot = 0;
		int i = 1;
		while (i <= 5) {
			tot += i;
			i++;
		}
		System.out.println(tot);

		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10
		i = 1;
		while (i < 11) {
			if (i < 3 || i > 6) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37
		tot = 0;
		i = 1;
		while (i < 11) {
			if (i < 3 || i > 6) {
				tot += i;
			}
			i++;
		}
		System.out.println(tot);

		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		int cnt = 0;
		i = 1;
		while (i <= 10) {
			if (i < 3 || i > 6) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(cnt);

	}
}