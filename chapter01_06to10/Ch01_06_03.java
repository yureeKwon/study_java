package chapter01_06to10;

/*
 * #up&down ���� 1�ܰ�
 * 1. com = 8
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 *  1)com�� me���� ũ�� up
 *  2)������ bingo
 *  3)com�� me���� ������ down
  */
import java.util.Scanner;

public class Ch01_06_03 {

	public static void main(String[] args) {
		int com = 8;
		System.out.println("���ڸ� �Է�");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();

		if (com > me) {
			System.out.println("up");
		} else if (com == me) {
			System.out.println("bingo");
		} else {
			System.out.println("down");
		}

	}

}
