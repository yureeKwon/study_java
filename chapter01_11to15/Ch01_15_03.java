package chapter01_11to15;

/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
import java.util.Scanner;
import java.util.Random;

public class Ch01_15_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int cnt = 0;
		

		int i = 0;
		while (i < 5) {
			int x = ran.nextInt(10) + 1;
			int y = ran.nextInt(10) + 1;
			int ans = x * y;
			System.out.println("����:" + x + "*" + y + "= ?");
			System.out.print("�����Է� : ");
			int me = scan.nextInt();

			if (me == ans) {
				cnt += 1;
			} 
			i++;
		}
		
		int score = cnt * 20;
		System.out.println("����:" + score + "��");
	}
}