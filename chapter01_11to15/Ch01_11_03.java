package chapter01_11to15;
/*
 * #가위(0)바위(1)보(2) 게임[2단계]
 * 1.com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2.me는 0~2 사이의 숫자를 입력받는다.
 * 3.com과 me를 비교해,
 *  1)비겼다.
 *  2)내가 이겼다.
 *  3)내가 졌다. 를 출력한다.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_11_03 {

	public static void main(String[] args) {
		// 13:50 ~ 14:00(10분)

		Random ran = new Random();
		int com = ran.nextInt(3);

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(0~2)");
		int me = scan.nextInt();

		if (com == me) {
			System.out.println("비겼다");
		}
		if (com == 0) {
			if (me == 1) {
				System.out.println("내가 이겼다");
			}
			if (me == 2) {
				System.out.println("내가 졌다");
			}
		}
		if (com == 1) {
			if (me == 2) {
				System.out.println("내가 이겼다");
			}
			if (me == 0) {
				System.out.println("내가 졌다");
			}
		}
		if (com == 2) {
			if (me == 0) {
				System.out.println("내가 이겼다");
			}
			if (me == 1) {
				System.out.println("내가 졌다");
			}
		}

	}

}
