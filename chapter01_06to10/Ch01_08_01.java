package chapter01_06to10;

/*
 * #���� ��ȿ�� �˻�
 * 1. ������ �Է� �޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������ 
 *    �����̰ų� 100���� �ʰ��ϸ� ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�. 
 */
import java.util.Scanner;

public class Ch01_08_01 {

	public static void main(String[] args) {
		// 14:01 ~ 14:06 (5��)

		Scanner scan = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();

		if(score>=60) {
			if(score<=100) {
			System.out.println("�հ�");
			}else {System.out.println("�߸��Է�");}
		}
		else if(score<60) {
			if(score>=0) {
				System.out.println("���հ�");
			}else {System.out.println("�߸��Է�");}
		}

	}

}
