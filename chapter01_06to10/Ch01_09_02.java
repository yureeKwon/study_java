package chapter01_06to10;
/*
 * #�ִ밪 ���ϱ�[1�ܰ�]
 * 1.����3���� �Է¹޴´�.
 * 2.�Է¹��� 3���� ���� ���Ͽ�,
 * 3.���� ū ��(MAX)�� ����Ѵ�.
 */

import java.util.Scanner;

public class Ch01_09_02 {

	public static void main(String[] args) {
		// ����ü�� �̿��ϴ� ��� (�ڵ尡 ��������)

		Scanner scan = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int x = scan.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int y = scan.nextInt();

		System.out.println("����° ���ڸ� �Է��ϼ���");
		int z = scan.nextInt();

		int maxNum = x; // �ƽ����� x���� ����
		
		if(maxNum<y) {
			maxNum = y;
		}
		if(maxNum<z) {
			maxNum = z;
		}
		
		System.out.println("�ִ밪:"+maxNum);
		

	}

}
