package chapter01_11to15;

import java.util.Scanner;
import java.util.Random;

/* 
 * # 홀짝게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */

public class Ch01_11_01 {

	public static void main(String[] args) {
		// 13:21 ~ 13:32 (11분)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;
		System.out.println("문제[" + rNum + "]");

		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.println("번호를 선택하세요 : ");
		int me = scan.nextInt();

		// 조건을 연달아 두개 붙여서(&& ||) 네가지 경우의 수 만드는 것보다
		// if문 안에 if문 만드는 게 간결

		if (me == 1) {
			if (rNum % 2 == 1) {
				System.out.println("정답");
			}
			if (rNum % 2 == 0) {
				System.out.println("땡");
			}
		}
		if (me == 2) {
			if (rNum % 2 == 1) {
				System.out.println("땡");
			}
			if (rNum % 2 == 0) {
				System.out.println("정답");
			}
		}

	}

}
