package chapter01_01to05;

public class Ch01_04_02 {

	public static void main(String[] args) {
		// ��) ������ 60�� �̻��̸� true ���

		int score = 30;
		System.out.println(score >= 60);

		// ����1) 3�� ����̸� true ���
		int ��� = 3;
		System.out.println(score % ��� == 0);

		// ����2) ¦���̸� true ���
		System.out.println(score % 2 == 0);

		// ����3) �Ʒ� �ݾ� �� 1000�� ¥�� �̻��� ȭ�� ������ 1000��¥���� 3�� �̻��̸� true
		int tot = 178600;
		int a = tot % 5000;
		int b = a / 1000;
		System.out.println(b >= 3);

	}

}
