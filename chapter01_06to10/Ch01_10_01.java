package chapter01_06to10;

import java.util.Random;

// # ����

public class Ch01_10_01 {

	public static void main(String[] args) {
		Random ran = new Random();

		// ��) 0~2 ������ ����
		int rNum = ran.nextInt(3);
		System.out.println(rNum);

		// ����1) 1~5 ������ ����
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// ����2) -3~3 ������ ����
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
		System.out.println(rNum);

	}

}
