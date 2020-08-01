package chapter01_06to10;

/*
 * # 구구단 게임[1단계]
 * 1.구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2.입력받은 숫자를 토대로 구구단 문제를 출력한다.
 *  예)3 x 7 = ?
 * 3.문제에 해당하는 정답을 입력 받는다.
 * 4.정답을 비교 후 "정답" 또는 "땡" 출력.
 */
import java.util.Scanner;

public class Ch01_07_04 {

	public static void main(String[] args) {
		// 13:55 ~ 13:58 (3분)

		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력");
		int x1 = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int x2 = scan.nextInt();

		System.out.println("정답 입력");
		int x3 = scan.nextInt();

		if (x1 * x2 == x3) {
			System.out.println("정답");
		}else{
			System.out.println("ㅋㅋ땡ㅋㅋ");
		}

	}

}
