package chapter03_06to10;

/*
* # ���ڿ� [��]
* ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
*/

import java.util.Scanner;

public class Ch03_10_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "ȫ�浿";

		System.out.print("�̸��� �Է��ϼ��� : ");
		String myName = scan.next();

		if (name == myName) {
			System.out.println("== ������ : ��ġ");
		} else {
			System.out.println("== ������ : ����ġ");
		}
//ȫ�浿 �Ȱ��� �Է��ص� ==�����ڷδ� ��ġ���� �Ǵܸ���
		if (name.equals(myName)) { // A.equals(B) -> A��B�� ������
			System.out.println("equals() �޼��� : ��ġ");
		} else {
			System.out.println("equals() �޼��� : ����ġ");
		}
//String�� equals�޼���� ���ؾ� �Ѵٴ� �ǹ̶��..
	}

}
