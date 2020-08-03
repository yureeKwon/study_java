package chapter01_16to20;
/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */

import java.util.Scanner;

public class Ch01_16_02 {

	public static void main(String[] args) {
		// 18:23 ~ 18 : 30 (7분)

		Scanner scan = new Scanner(System.in);

		int run = 1;
		while (run == 1) {
			System.out.println("숫자입력[EXIT:-100] : ");
			int num = scan.nextInt();

			if (num == -100) {
				System.out.println("프로그램 종료");
				run = 0;
			}
		}

		// run~~~~~~

	}

}
