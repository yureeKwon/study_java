package chapter01_16to20;

/*
 * # UP & DOWN ����[2�ܰ�]
 * 1. ������ ���߸� ������ ���� �ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
import java.util.Scanner;
import java.util.Random;

public class Ch01_16_03 {

	public static void main(String[] args) {

		// 18:35 ~ 18:43 (8��)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;
		//System.out.println(rNum);

		int score = 100;
		int cnt = 0;

		int run = 1;

		while (run == 1) {
			System.out.println("���ڸ� �Է��ϼ���");
			int me = scan.nextInt();

			if (me == rNum) {
				System.out.println("����");
				run = 0;
			} else if (me > rNum) {
				System.out.println("DOWN");
				cnt += 1;
			} else if (me < rNum) {
				System.out.println("UP");
				cnt += 1;
			}
		}
		
		score -= cnt * 5;
		System.out.println("����:" + score + "��");

	}

}
