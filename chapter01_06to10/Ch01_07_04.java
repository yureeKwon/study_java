package chapter01_06to10;

/*
 * # ������ ����[1�ܰ�]
 * 1.������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2.�Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 *  ��)3 x 7 = ?
 * 3.������ �ش��ϴ� ������ �Է� �޴´�.
 * 4.������ �� �� "����" �Ǵ� "��" ���.
 */
import java.util.Scanner;

public class Ch01_07_04 {

	public static void main(String[] args) {
		// 13:55 ~ 13:58 (3��)

		Scanner scan = new Scanner(System.in);

		System.out.println("ù��° ���� �Է�");
		int x1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int x2 = scan.nextInt();

		System.out.println("���� �Է�");
		int x3 = scan.nextInt();

		if (x1 * x2 == x3) {
			System.out.println("����");
		}else{
			System.out.println("����������");
		}

	}

}
