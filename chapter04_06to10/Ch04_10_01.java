package chapter04_06to10;
/*
 * # ����(Exception)ó��
 */

public class Ch04_10_01 {

	public static void main(String[] args) {
		int num = 10;
		// java.lang.ArithmeticException: / by zero
		// System.out.println(num / 0);
		
		// �ɰ��� ������ �߻���ų �� �ִ� ������
		// try(if) catch(else) �����ȿ� ���鵵�� �����Ѵ�.
		
		try {
			System.out.println(num / 0);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println("���α׷� ����");

	}
}
