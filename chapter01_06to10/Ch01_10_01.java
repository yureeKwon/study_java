package chapter01_06to10;

import java.util.Random;

// # 랜덤

public class Ch01_10_01 {

	public static void main(String[] args) {
		Random ran = new Random();

		// 예) 0~2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);

		// 문제1) 1~5 사이의 랜덤
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// 문제2) -3~3 사이의 랜덤
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
		System.out.println(rNum);

	}

}
