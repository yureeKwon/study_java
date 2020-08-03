package chapter01_11to15;
/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 *  예)
 * 랜덤숫자 249, 정답 4
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_12_05 {

	public static void main(String[] args) {

		// 13:43 ~ 13:48 (5분)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(101) + 150;
		System.out.println(rNum);
		System.out.println("가운데숫자 입력");
		int me = scan.nextInt();

		int ans = (rNum / 10) % 10; // 가운데숫자 추출

		if (me == ans) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
