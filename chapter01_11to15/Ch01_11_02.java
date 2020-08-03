package chapter01_11to15;
/*
 * #구구단 게임[2단계]
 * 1.구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2.저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예) 3 x 7 = ?
 * 3.문제에 해당하는 정답을 입력 받는다.
 * 4.정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_11_02 {

	public static void main(String[] args) {

		// 13:37 ~ 13:43 (6분)

		Random ran = new Random();
		int x = ran.nextInt(10) + 1; // 출제 숫자 범위 정하기~~
		int y = ran.nextInt(10) + 1;

		System.out.println("문제 : " + x + "x" + y + "= ?");

		Scanner scan = new Scanner(System.in);
		int myAns = scan.nextInt(); // 변수이름 정할때 입력값, 실제값 따로 알아보기 쉽게 하기

		if (x * y == myAns) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}

	}

}
