package chapter01_06to10;

/*
 * # ��� Control Statement
 * 1. ���ǹ� : if, switch-cast
 *  if(���ǽ�){���ǹ��� ���� �� ������ ����;} 
 * 2. �ݺ��� : for, while, do-while
 * 3. ������� : break, continue * 
 * 
 * 
 */
public class Ch01_06_01 {

	public static void main(String[] args) {

		if (true) {
			System.out.println("���� O");
		}
		if (false) {
			System.out.println("���� X");
		}

		// ��) Ȧ¦
		int num = 8;
		// System.out.println(num%2 == 0);
		// System.out.println(num%2 == 1);

		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦��");
		}
		if (num % 2 == 1) {
			System.out.println(num + "��(��) Ȧ��");
		}

		// ����1) ���, 0, ���� ��� (num = -10)
		double dnum = -10;

		if (dnum > 0) {
			System.out.println("���");
		}
		if (dnum == 0) {
			System.out.println("0");
		}
		if (dnum < 0) {
			System.out.println("����");
		}

		// ����2) 4�� ��� ��� (num = 12)
		int numb = 12;

		if (numb % 4 == 0) {
			System.out.println(numb + "��(��) 4�� ����̴�");
		}
		if (numb % 4 != 0) {
			System.out.println(numb + "��(��) 4�� ����� �ƴϴ�");
		}

		// ����3) �հ�, ���հ� ���
		int score = 87;

		if (score >= 70) {
			System.out.println(score + "������ �հ�");
		}
		if (score < 70) {
			System.out.println(score + "������ ���հ�");
		}

	}

}
