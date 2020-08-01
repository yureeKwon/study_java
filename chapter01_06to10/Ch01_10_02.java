package chapter01_06to10;

import java.util.Random;
import java.util.Scanner;
/*
 * # 코인게임
 * 1. 0 또는 1의 랜덤숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 * 
 */

public class Ch01_10_02 {

	public static void main(String[] args) {
		// 13:00 ~ 13:07 (7분)

		Scanner scan = new Scanner(System.in);

		System.out.println("동전 앞면(0), 뒷면(1) 입력하세요");
		int me = scan.nextInt();

		Random ran = new Random();

		int coin = ran.nextInt(2);

		if (me == coin) {
			System.out.println("정답");
		}
		if (me != coin) {
			System.out.println("땡");
		}

	}

}
