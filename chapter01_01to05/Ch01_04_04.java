package chapter01_01to05;

public class Ch01_04_04 {

	public static void main(String[] args) {
		// ��) 3�� ����̸鼭, ¦���̸� true ���
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);

		// ����1) ����
		// 3������ ����� 60�� �̻��̸�, true
		// ��, ��� �� �����̶� 50�� �̸��̸�, false
		int score1 = 100;
		int score2 = 87;
		int score3 = 41;
		int tot = score1 + score2 + score3;
		double avr = tot / 3.0;
		System.out.println("������� " + (avr >= 60 && score1 > 50 && score2 > 50 && score3 > 50));

		// ����2) Ű�� 200cm �̻��̰ų� �����԰� 200kg �̻��̸�, ����(true)
		int height1 = 199;
		int weight1 = 199;
		int height2 = 200;
		int weight2 = 68;

		System.out.println("1�� ���忩�� " + (height1 >= 200 || weight1 >= 200));
		System.out.println("2�� ���忩�� " + (height2 >= 200 || weight2 >= 200));

	}

}
