package chapter01_16to20;

/*
 * # UP & DOWN 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료 된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */
import java.util.Scanner;
import java.util.Random;

public class Ch01_16_03 {

	public static void main(String[] args) {

		// 18:35 ~ 18:43 (8분)

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;
		//System.out.println(rNum);

		int score = 100;
		int cnt = 0;

		int run = 1;

		while (run == 1) {
			System.out.println("숫자를 입력하세요");
			int me = scan.nextInt();

			if (me == rNum) {
				System.out.println("정답");
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
		System.out.println("점수:" + score + "점");

	}

}
