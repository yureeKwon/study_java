package chapter01_01to05;

public class Ch01_03_02 {

	public static void main(String[] args) {
		// ������ 1000�� �ִ�. 200��¥�� ���� ���� ��, �ܵ� ���

		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");

		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int ���� = 100;
		int �������� = ���� * 12;
		int ���� = �������� / 10;
		int ���Ŀ��� = �������� - ����;
		System.out.println("���Ŀ��� = " + ���Ŀ��� + "��");

		// ����2) ���������� 30, 50, 4�� �޾Ҵ�. �����?
		int ����1 = 30;
		int ����2 = 50;
		int ����3 = 4;
		int ���� = ����1 + ����2 + ����3;
		double ����� = 3;
		double ��� = ���� / �����;
		System.out.println("��� = " + ��� + "��");

		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int ���� = 3;
		int ���� = 6;
		System.out.println("�ﰢ�� ���� = " + ���� * ���� / 2.0);

		// ����4 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		System.out.println(time + "�� = " + minutes + "��" + seconds + "��");

		// ����5 800������ 500��¥�� ����, 100��¥�� ����
		int tot = 800;
		int fivHund = tot / 500;
		int oneHund = tot % 500 / 100;
		System.out.println("500�� = " + fivHund + "��, 100�� = " + oneHund + "��");

	}

}
