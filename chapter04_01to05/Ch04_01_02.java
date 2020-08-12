package chapter04_01to05;
/*
 * # ����ȯ(type conversion)
 * 1) �ڷ���(data type)�� �ٲٴ� ���� �ǹ�
 * 2) (��ȯ�� �ڷ���) ����
 */

public class Ch04_01_02 {

	public static void main(String[] args) {

		// ���� -> ����
		char ch = 'a';
		int aNum = (int) ch;
		System.out.println(aNum); // 97 �ƽ�Ű�ڵ尪���� ��ȯ��

		ch = (char) (aNum + 1);
		System.out.println(ch); // b

		// ���ڿ� -> ����
		String strNum = "10";
		int num = Integer.parseInt(strNum); // num = 10
		System.out.println(num + 1); // 11

		// ���� -> ���ڿ�
		// ���1) �ļ�
		strNum = num + ""; // ����10�� ����10���� �������
		System.out.println(strNum + 1); // ����10�� 1���ϸ� 10+1=101
		// ���2) ����
		strNum = String.valueOf(num);
		System.out.println(strNum + 1);

	}
}
