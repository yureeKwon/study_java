package chapter02_01to05;
/*
 * # �л��������� ���α׷�[4�ܰ�] : 1���л� 
 */

public class Ch02_02_04 {

	public static void main(String[] args) {
		// 12:55 ~ 13:00(5��)

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����) 1�� �л��� �й��� ���� ���
		// ����) 1004��(98��)

		int i = 0;
		int maxScore = 0;
		int maxhak = 0;

		for (i = 0; i < 5; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxhak = hakbuns[i];
			}
		}
		System.out.println("1���л��� �й��� ����");
		System.out.println("�й� :" + maxhak + "��");
		System.out.println("���� :" + maxScore + "��");

	}

}
